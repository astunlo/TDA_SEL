/**
 * Total a pagar, horas extras [JAVA] [POO]
=> escribir un programa en java que calcule el total a pagar de un empleado segun el numero de horas trabajadas. 
Si las horas son menores  a 40 se le paga cada hora a $200 como hora normal. 
Despues de las 40 horas se consideran horas extra, y si las horas son menores de 48 
cada hora extra se paga al doble de la hora normal, pero si las horas se pasan de las 48 
las primeras 8 horas extras se pagan al doble y el resto de horas extras se pagan al triple.
 */

package liquidadorDeSueldos;

public interface Liquidable {
    void liquidarSueldo();
    void liquidarAguinaldo();
    void liquidarVacaciones();
    void liquidacionFinal();    
}
