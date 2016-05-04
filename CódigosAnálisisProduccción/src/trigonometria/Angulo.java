package trigonometria;

public class Angulo {
  Double grado;
  Double radian;
  
   public Angulo(Double grado){
	   this.setGrado(grado);
	   
   }
   
   public Double getGrado(){
	   return grado;
   }
   public Double getRadian(){
	   return radian;
   }
   
   public void setGrado(Double grado){
	   this.grado=grado;
   }
   
   public Double setRadian(Double grado){
	   return this.radian=Math.toRadians(grado);
   }
   
   
}
