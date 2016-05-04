package inversa;

import java.util.Arrays;

public class VectorMath {
	private Integer dimensionVector;
	private Double[] vector;
	Integer tope=0;

	public VectorMath(Integer dimension){
		this.setDimensionVector(dimension);
		this.setVector(new Double[dimensionVector]);	
		for(int i=0; i<vector.length; i++)
			vector[i]=0.0;
	}

	public void cargarVector(){
		System.out.println("Tamaño del vector = " + dimensionVector);
		for(int i=0; i<vector.length; i++){
			System.out.println("Ingrese elemento [" + i + "] = " );	
			vector[i]=Matriz.teclado.nextDouble();
		}
		this.imprimirVector();
	}

	public void imprimirVector(){
		System.out.println("Vector: ");
		for(int i=0; i<vector.length; i++)
			System.out.println(vector[i] + " ");
	}


	public Integer getDimensionVector() {
		return dimensionVector;
	}

	public void setDimensionVector(Integer dimensionVector) {
		this.dimensionVector = dimensionVector;
	}

	public Double[] getVector() {
		return vector;
	}

	public void setVector(Double[] vector) {
		this.vector = vector;
	}

	//resta de dos vectores
	public VectorMath resta(VectorMath b){
		if((this.getDimensionVector()==b.getDimensionVector())){
			VectorMath vResta=new VectorMath(this.getDimensionVector());//Llama al constructor que pide "dimension".
			for(int i=0; i<this.getDimensionVector(); i++){
				vResta.getVector()[i]=this.getVector()[i]-b.getVector()[i];
			}
			return vResta;
		}else{System.out.println("Los vectores no tienen el mismo \"orden\". No puede calcularse su Resta");
		return null;}
	}

	public Double normaDos() {
		Double resultado = 0.0;
		for (int i=0; i<this.getDimensionVector(); i++)
			  resultado += this.getVector()[i] * this.getVector()[i];
		return Math.sqrt(resultado);
	}


	@Override
	public String toString() {
		return "Vector = " + Arrays.toString(vector) + " ";
	}


}

