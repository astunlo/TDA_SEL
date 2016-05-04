package herencia_polimorfismo;
/**
 * @author Gastón
 * Modele una Empresa con empleados. Una empresa conoce a todos sus empleados. Los empleados pueden
ser de planta permanente o temporaria, además hay gerentes, que también son empleados de planta
permanente, pero siguen un régimen salarial particular.
Cuando un empleado es de planta permanente cobra la cantidad de horas trabajadas por $30, más
antigüedad ($10 por año de antigüedad), más salario familiar. Cuando es de planta temporaria, no cobra
antigüedad y cobra la cantidad de horas trabajadas por $20, más salario familiar. El salario familiar es $20
por cada hijo, los empleados casados además cobran $10 por su esposa/o.
Un gerente cobra de manera similar a un empleado de planta permanente pero su hora trabajada vale $40,
por antigüedad se le pagan $15 por año, mientras que el salario familiar es el mismo que el de los
empleados de planta permanente y temporal.

Defina e implemente el mensaje montoTotal() en la clase Empresa, que retorna el monto total que la
empresa debe pagar en concepto de sueldos a sus empleados.
Realice la implementación del sistema completo en Java.
Provea una clase TestEmpresa para instanciar y testear su sistema. En el método main de esa clase cree el
siguiente escenario y envíe a la empresa el mensaje montoTotal() para obtener la liquidación total.
• Una empresa, con el CUIT y Razón Social que desee, y con los cuatro empleados que se describen a
continuación.
• Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin hijos.
• Un empleado de Planta Permanente (que no sea gerente) con 80 horas trabajadas, con esposa, 2 hijos y 6
años de antigüedad.
• Un empleado de Planta Permanente (que no sea gerente) con 160 horas trabajadas, sin esposa, sin hijos y
con 4 años de antigüedad.
• Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de antigüedad
 *
 */

interface Pagable {
	Double SALARIOHIJO=20.0;
	Double SALARIOESPOSA=10.0;
	
    void cobrarSalario();
    Double cobrarMontoAntigüedad();
    Double cobrarSalarioFamiliar();
	
}
