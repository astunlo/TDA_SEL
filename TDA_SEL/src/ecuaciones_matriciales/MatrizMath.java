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

public class MatrizMath implements Cloneable {

	private Integer dimension; //Dimension de la matriz
	private Double[][] matriz; //Matriz
	private Integer fila;
	private Integer columna;

	/**
	 * Constructor de MatrizMath que crea objeto tipo Matriz y lo inicializa.
	 * @param dimension
	 */
	public MatrizMath(Integer dimension) {
		this.setDimension(dimension);
		this.setFila(dimension);
		this.setColumna(dimension);
		this.setMatriz(new Double[dimension][dimension]);
		for(int i=0; i<this.getDimension(); i++){
			for(int j=0; j<this.getDimension(); j++){
				matriz[i][j]=0.0;
			}//Fin inicializacion de Matriz Cuadrada
		}
	}

	/**
	 * Método para cargar MatrizMath desde archivo
	 * @param iFila
	 * @param jColumna
	 * @param eElemento
	 */
	public void cargarMatrizArchivo(Integer iFila, Integer jColumna, Double eElemento){
		matriz[iFila][jColumna]=eElemento;
	}//fin cargar
    
	/**
	 * Método para imprimir la matriz
	 */
	public void imprimirMatriz(){
		System.out.println("\nMatriz cargada: ");
		for(int i=0; i<this.getFila();i++){
			for(int j=0; j<this.getColumna(); j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}//fin imprimir

	/**
	 * Método para clonar una MatrizMath
	 */
	public Object clone(){
		MatrizMath obj=null;
		try{
			obj=(MatrizMath)super.clone();
		}catch(CloneNotSupportedException ex){
			System.out.println("Objeto NO se puede Clonar");
		}
		obj.matriz=(Double[][])obj.getMatriz().clone();
		for(int i=0; i<obj.getDimension(); i++){
			obj.getMatriz()[i]=(Double[])obj.getMatriz()[i].clone();
		}
		return obj;
	}

	/**
	 * Determinante de una matriz. Se supone la matriz cuadrada.
	 * Si matriz no es cuadrada no permite su cálculo. Se verifica dimensión de fila y columna.
	 * @return determinante de la matriz
	 */
	public Double calcularDeterminante(){
		if(this.getFila()==this.getColumna()){
			MatrizMath matrizAux=(MatrizMath)this.clone();//Casteo a Matriz de obj que devuelve el método clone.
			double deter=1;
			for(int k=0; k<this.getDimension()-1; k++){
				for(int i=k+1; i<this.getDimension(); i++){
					for(int j=k+1; j<this.getDimension(); j++){
						matrizAux.getMatriz()[i][j]-=matrizAux.getMatriz()[i][k]*matrizAux.getMatriz()[k][j]/matrizAux.getMatriz()[k][k];
					}
				}
			}

			for(int i=0; i<this.getDimension(); i++){
				deter*=matrizAux.getMatriz()[i][i];
			}
			return deter;
		}else{System.out.println("No es una matriz cuadrada. No puede calcularse su determinante");
		return null;}
	}

	/**
	 * Método de generación de una Matriz Identidad teórica.
	 * Método para el cálculo de una Matriz Inversa.
	 * @return MatrizMath resultado
	 */
	public MatrizMath matrizIdentidad(){
		MatrizMath mIdent = new MatrizMath(this.getDimension());
		for(int i=0; i<this.getDimension(); i++){
			for(int j=0; j<this.getDimension(); j++){
				mIdent.matriz[i][i]=1.0;
			}//Fin inicializaciï¿½n de Matriz Cuadrada
		}
		return mIdent;
	}

	public MatrizMath calcularMatrizInversa(){
		if(this.getFila()==this.getColumna()){
			if(this.calcularDeterminante()!=0){
				MatrizMath matrizAux=(MatrizMath)this.clone();
				MatrizMath matrizIdentidad=this.matrizIdentidad();   //matriz de los términos independientes
				MatrizMath matrizInversa=new MatrizMath(this.getDimension());   //matriz de las incógnitas

				//transformación de la matriz y de los términos independientes
				for(int k=0; k<this.getDimension()-1; k++){
					for(int i=k+1; i<this.getDimension(); i++){
						//términos independientes
						for(int j=0; j<this.getDimension(); j++){
							matrizIdentidad.getMatriz()[i][j]-=matrizAux.getMatriz()[i][k]*matrizIdentidad.getMatriz()[k][j]/matrizAux.getMatriz()[k][k];
						}
						//elementos de la matriz
						for(int j=k+1; j<this.getDimension(); j++){
							matrizAux.getMatriz()[i][j]-=matrizAux.getMatriz()[i][k]*matrizAux.getMatriz()[k][j]/matrizAux.getMatriz()[k][k];
						}
					}
				}
				//cálculo de las incógnitas, elementos de la matriz inversa
				for(int j=0; j<this.getDimension(); j++){
					matrizInversa.getMatriz()[this.getDimension()-1][j]=matrizIdentidad.getMatriz()[this.getDimension()-1][j]/matrizAux.getMatriz()[this.getDimension()-1][this.getDimension()-1];
					for(int i=this.getDimension()-2; i>=0; i--){
						matrizInversa.getMatriz()[i][j]=matrizIdentidad.getMatriz()[i][j]/matrizAux.getMatriz()[i][i];
						for(int k=this.getDimension()-1; k>i; k--){
							matrizInversa.getMatriz()[i][j]-=matrizAux.getMatriz()[i][k]*matrizInversa.getMatriz()[k][j]/matrizAux.getMatriz()[i][i];
						}
					}
				}
				return matrizInversa;
			}else{System.out.println("Su determinante es 0. No puede calcularse su Inversa");
			return null;}
		}else{System.out.println("No es una matriz cuadrada. No puede calcularse su Inversa");
		return null;}
	}	

	/**
	 * Método de resolución de SEL del tipo A*X=B
	 * @param matrizInversa
	 * @param terminosIndep
	 * @return VectorMath de soluciones del SEL
	 */
	public VectorMath resolverSistemaEcuacionesLineales(MatrizMath matrizInversa, VectorMath terminosIndep){
		VectorMath vectorIncognitas= new VectorMath(terminosIndep.getDimensionVector());
		for(int i=0; i<matrizInversa.getDimension(); i++){
			for(int j=0; j<matrizInversa.getDimension(); j++){
				vectorIncognitas.getVector()[i]+=matrizInversa.getMatriz()[i][j]*terminosIndep.getVector()[j];
			}
		}
		return vectorIncognitas;
	}
	
	/**
	 * Método que calcula el error en el procesamiento de SEL, según se calcule la Norma Dos de la diferencia entre:
	 *    Matriz Identidad con posibles errores surgidos de multiplicar la Matriz de Entrada por su Inversa, menos
	 *    la Matriz Identidad teórica.
	 * @param matriz
	 * @return error
	 */
	public Double calculoDeError(MatrizMath matriz){
		Double error=0.0;

		try {
			error=this.matrizIdentidad().restarMatrices(matriz.productoEntreMatrices(matriz.calcularMatrizInversa())).normaDos();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return error;
	}

	/**
	 * Devuelve el valor ubicado en las posiciones indicadas por i y j
	 * @param i numero de fila
	 * @param j numero de columna
	 * @return valor almacenado en (i,j)
	 */
	public double valorEnIndice(int i, int j){
		return this.matriz[i][j];
	}

	/**
	 * Realiza la norma dos de la matriz, tambien llamada norma de Frobenius
	 * @return norma
	 */
	public double normaDos() {
		double resultado=0.0;
		for (int i=0; i<this.getFila(); i++)
			for (int j=0; j<this.getColumna(); j++)
				resultado += valorEnIndice(i, j) * valorEnIndice(i, j);
		return Math.sqrt(resultado);
	}

	/**
	 * Métodos de multiplicación entre matrices
	 * @param b
	 * @return MatrizMath resultado
	 */
	public MatrizMath productoEntreMatrices(MatrizMath b){
		if(this.getColumna()==b.getFila()){
			MatrizMath matrizProducto=new MatrizMath(this.getDimension());
			for(int i=0; i<this.getDimension(); i++){
				for(int j=0; j<this.getDimension(); j++){
					for(int k=0; k<this.getDimension(); k++){
						matrizProducto.getMatriz()[i][j]+=this.getMatriz()[i][k]*b.getMatriz()[k][j];
					}
				}
			}
			return matrizProducto;
		}else{System.out.println("No es una matriz cuadrada. No puede calcularse su Producto");
		return null;}
	}

	/**
	 * Métodos de Suma y Resta de Matrices
	 * @param b
	 * @return MatrizMath resultado
	 */
	public MatrizMath restarMatrices(MatrizMath b){
		if((this.getFila()==b.getFila())&&(this.getColumna()==b.getColumna())){
			MatrizMath matrizResta=new MatrizMath(this.getDimension());//Llama al constructor que pide "dimension".
			for(int i=0; i<this.getDimension(); i++){
				for(int j=0; j<this.getDimension(); j++){
					matrizResta.getMatriz()[i][j]=this.getMatriz()[i][j]-b.getMatriz()[i][j];
				}
			}
			return matrizResta;
		}else{System.out.println("Las matrices no tienen el mismo \"orden\". No puede calcularse su Resta");
		return null;}
	}

	public MatrizMath sumarMatrices(MatrizMath b){
		if((this.getFila()==b.getFila())&&(this.getColumna()==b.getColumna())){
			MatrizMath matrizSuma=new MatrizMath(this.getDimension());//Llama al constructor que pide "dimension".
			for(int i=0; i<this.getDimension(); i++){
				for(int j=0; j<this.getDimension(); j++){
					matrizSuma.getMatriz()[i][j]=this.getMatriz()[i][j]+b.getMatriz()[i][j];
				}
			}
			return matrizSuma;
		}else{System.out.println("Las matrices no tienen el mismo \"orden\". No puede calcularse su Resta");
		return null;}
	}

    /**
     * Método que permite multiplicar una Matriz por una escalar
     * @param alfa
     * @return
     */
	public MatrizMath productoPorEscalar(Double alfa){
		MatrizMath matrizEscalar=new MatrizMath(this.getDimension());
		for(int i=0; i<this.getDimension(); i++){
			for(int j=0; j<this.getDimension(); j++){
				matrizEscalar.getMatriz()[i][j]=this.getMatriz()[i][j]*alfa;
			}
		}
		return matrizEscalar;
	}

	/**
	 * Getters y Setters
	 * @return
	 */
	public Integer getDimension() {
		return dimension;
	}
	public void setDimension(Integer dimension) {
		this.dimension = dimension;
	}
	public Double[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(Double[][] matriz) {
		this.matriz = matriz;
	}
	public Integer getFila() {
		return fila;
	}
	public void setFila(Integer fila) {
		this.fila = fila;
	}
	public Integer getColumna() {
		return columna;
	}
	public void setColumna(Integer columna) {
		this.columna = columna;
	}
} 
