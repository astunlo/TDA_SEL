package trigonometria;

public class Angulos {
    
	public void tipoDeAngulo(Angulo e){
    	
    	if(e.getGrado()==90.0){
    		System.out.println("El ángulo ingresado de " + e.getGrado() + "° es RECTO\n");
    	}else{
    		  if(e.getGrado()<90&&e.getGrado()>=0){
    			  System.out.println("El ángulo ingresado de " + e.getGrado() + "° es AGUDO\n"); 
    		  }else{
    			  if(e.getGrado()>90&&e.getGrado()<180){
        			  System.out.println("El ángulo ingresado de " + e.getGrado() + "° es OBTUSO\n"); 
    		        }else{
    	    			  if(e.getGrado()==180){
    	        			  System.out.println("El ángulo ingresado de " + e.getGrado() + "° es LLANO\n"); 
    	    		       }else{
    	    	    			  if(e.getGrado()>180&&e.getGrado()<360){
    	    	        			  System.out.println("El ángulo ingresado de " + e.getGrado() + "° es CONCAVO\n"); 
    	    	    		       }else{
    	    	    	    			  if(e.getGrado()==360){
    	    	    	        			  System.out.println("El ángulo ingresado de " + e.getGrado() + "° es ENTERO\n"); 
    	    	    	    		       }else{
    	    	    	    	    			  if(e.getGrado()>360){
    	    	    	    	        			  System.out.println("El ángulo ingresado de " + e.getGrado() + "° es MAYOR A 360\n"); 
    	    	    	    	    		       }else{System.out.println("fuera de rango");}
    	                                         }
                                         }
    	                         }
    	    			  }
    		        }
    		  }
    	}

	public void parejaDeAngulos(Angulo a, Angulo b){
		
		if((a.getGrado()+ b.getGrado())==90){
			System.out.println("El 1er ángulo de " + a.getGrado() + "° + el segundo de " + b.getGrado() + "° son COMPLEMENTARIOS\n");
		}else{
			  if((a.getGrado()+b.getGrado())==180){
				  System.out.println("El 1er ángulo de " + a.getGrado() + "° + el segundo de " + b.getGrado() + "° son SUPLEMENTARIOS\n");
			  }else{System.out.println("La suma de ambos ángulos (" + a.getGrado() + "° y " + b.getGrado() + "°) NO da ni 90° ni 180°\n");
			        System.out.println("No corresponde Complementario ni Suplementario\n");
			       }			
		     }
		}
	
	public void senCosTan(Angulo a){
		Double valor= a.setRadian(a.getGrado());
		valor= Math.sin(valor);
		System.out.println("El seno de " + a.getGrado() + "° es : " + valor);
		valor= Math.cos(a.getRadian());
		System.out.println("El coseno de " + a.getGrado() + "° es : " + valor);
		valor= Math.tan(a.getRadian());
		System.out.println("La tangente de " + a.getGrado() + "° es : " + valor);
	}
	
	public void arcoSenCosTan(Double a){
		Double valor= Math.asin(a);
		Double angulo= Math.toDegrees(valor);
		System.out.println("El arcoseno de " + a + "es un ángulo de: " + angulo + "°");
		valor= Math.acos(a);
		angulo= Math.toDegrees(valor);
		System.out.println("El arcocoseno de " + a + "es un ángulo de: " + angulo + "°");
		valor= Math.atan(a);
		angulo= Math.toDegrees(valor);
		System.out.println("El arcotangente de " + a + "es un ángulo de: " + angulo + "°");
	}
}
