/**
 * Universidad Nacional del Oeste
 * Programación con Objetos II, comisión (7034) Turno Noche
 * 1er cuatrimestre 2016
 *                            "TP S.E.L."
 *                            
 * @author Gastón M. López y Eugenio Puente Perazzo
 *         GRUPO: 6.
 */

package ecuaciones_matriciales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Archivo{
	/**
	 * @param Resource 1 al 6 que llaman a archivos in con datos a cargar.
	 * @param ResourceRandom que llama a archivo generado con matrices y vectores de dimension mayor a 1000x1000.
	 * @param ResourceSolucion que da ruta de archivo out con datos solicitados.
	 */
	private static String Resource1 = "Resources//Entrada//04_caso2x2cCasiLDsimple.in";
	private static String Resource2 = "Resources//Entrada//05_caso3x3.in";
	private static String Resource3 = "Resources//Entrada//06_caso10x10.in";
	private static String Resource4 = "Resources//Entrada//07_caso100x100.in";
	private static String Resource5 = "Resources//Entrada//08_caso1000x1000.in";
	private static String Resource6 = "Resources//Entrada//09_caso5000x5000.in";
	private static String ResourceSolucion = "Resources//Salida//solucion.out";
	private static String ResourceRandom = "Resources//Entrada//09_casoMayorA1000x1000.in";

	private MatrizMath matriz;
	private VectorMath vector;
	private VectorMath incognitasResueltasAGrabar;
	private Double errorCalculoSELaGrabar;
	private Integer dimensionAGarabar;
	
	/**
	 * Métodos de lectura de archivo de texto para cargar valores de matriz y de vector.
	 * Más abajo, método para escribir los datos solicitados en archivo de salida: 
	 *    * dimensión de la matriz y el vector.
	 *    * Elementos del vector de soluciones del SEL.
	 *    * Valor del Error calculado por norma dos.
	 */
	
	public void leer(){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File(Resource3);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea = "";
			Boolean PrimeraLinea = true;
			long l1 = -1;
			long l2 = 0;
			long l3 = 0;
			Long lNumeroLineas = new Long(l1);
			Long lNumeroLineaFinMatriz = new Long(l2);
			Long lNumeroLineaFinVector = new Long(l3);
			Integer posVector = 0; //Posicion del Vector
			
			System.out.println("Leyendo matriz del archivo...");
			int iFila = 0;
			int jColumna = 0;
			double eElemento = 0;
			while ((linea = br.readLine()) != null){ //Primera lectura obtiene la dimension de la matriz y vector
				lNumeroLineas++; //Contador de Lineas la primera lectura
				if(PrimeraLinea == true){
					this.setDimensionAGarabar(Integer.parseInt(linea));
					System.out.println("La dimension de la matriz cuadrada es " + linea + "x" + linea);
					System.out.println("La dimension del vector es " + linea);
					lNumeroLineaFinMatriz = (long) (Integer.parseInt(linea)*(Integer.parseInt(linea)));//Numero de linea de fin elementos de la matriz
					lNumeroLineaFinVector = lNumeroLineaFinMatriz + Integer.parseInt(linea);
					this.setMatriz(new MatrizMath(Integer.parseInt(linea))); //Dimensiono la matriz
					this.setVector(new VectorMath(Integer.parseInt(linea))); //Dimensiono el vector
					this.setIncognitasResueltasAGrabar(new VectorMath(Integer.parseInt(linea))); //Dimensiono el Vector de Incognitas Resueltas 
					PrimeraLinea = false;
					System.out.println("Matriz: ");
				}else{

					if(lNumeroLineas <= lNumeroLineaFinMatriz){ //Elementos de la matriz nxn	
						String[] lineaSpliteada = linea.split(" ");
						iFila = Integer.parseInt(lineaSpliteada[0]);
						jColumna = Integer.parseInt(lineaSpliteada[1]);
						eElemento = Double.parseDouble(lineaSpliteada[2]);

						//Cargo matriz leida
						this.getMatriz().cargarMatrizArchivo(iFila,jColumna,eElemento);
						System.out.println("Elemento i["+ iFila + "] j["+ jColumna +"]: " + eElemento);
					}else{ //Elementos del vector
						if(lNumeroLineas <= lNumeroLineaFinVector){ //Elementos del vector
							eElemento = Double.parseDouble(linea);

							//Cargo el vector leido
							this.getVector().cargarVectorArchivo(posVector, eElemento);
							posVector++;
						}
					}
				}
			}
			System.out.println("Vector: ["+ eElemento+ "]");
			this.getMatriz().imprimirMatriz();
			this.getVector().imprimirVector();		
			System.out.println("\nFin de lectura...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}//fin leer

	public void escribir() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(ResourceSolucion);
			pw = new PrintWriter(fichero);

			pw.println(this.getDimensionAGarabar());
			pw.println(this.getIncognitasResueltasAGrabar());
			pw.println(this.getErrorCalculoSELaGrabar());

			System.out.println("\nEl archivo solucion fue grabado con exito.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//fin escribir
    
	/**
	 * Método generador de matriz de dimensión mayor a 1000 x 1000 para casos de prueba que así lo requieran.
	 * Método de asignación de valores Random.
	 * @param dimension
	 */
	public void escribirMatrizRandon(Integer dimension) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		Integer limite = 9;
		try {
			fichero = new FileWriter("D://UNIVERSIDAD//Objetos II//TP Matrices//TDA_git//TDA_SEL//Resources//Entrada//09_casoMayorA1000x1000.in");
			pw = new PrintWriter(fichero);

			pw.println(dimension);

			for(int i=0; i<dimension;i++){
				for(int j=0; j<dimension; j++){
					pw.println(i + " " + j + " " + (int) (Math.random()*limite+1));
				}
			}

			for(int i=0; i<dimension;i++){
				pw.println((int) (Math.random()*limite+1));
			}

			System.out.println("\nEl archivo random fue grabado con exito.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//fin escribir
	
	/**
	 * Getters y Setters
	 * @return
	 */
	public MatrizMath getMatriz() {
		return matriz;
	}
	public void setMatriz(MatrizMath matriz) {
		this.matriz = matriz;
	}
	public VectorMath getVector() {
		return vector;
	}
	public void setVector(VectorMath vector) {
		this.vector = vector;
	}
	public VectorMath getIncognitasResueltasAGrabar() {
		return incognitasResueltasAGrabar;
	}
	public void setIncognitasResueltasAGrabar(VectorMath incognitasResueltasAGrabar) {
		this.incognitasResueltasAGrabar = incognitasResueltasAGrabar;
	}
	public Double getErrorCalculoSELaGrabar() {
		return errorCalculoSELaGrabar;
	}
	public void setErrorCalculoSELaGrabar(Double errorCalculoSELaGrabar) {
		this.errorCalculoSELaGrabar = errorCalculoSELaGrabar;
	}
	public Integer getDimensionAGarabar() {
		return dimensionAGarabar;
	}
	public void setDimensionAGarabar(Integer dimensionAGarabar) {
		this.dimensionAGarabar = dimensionAGarabar;
	}
}
