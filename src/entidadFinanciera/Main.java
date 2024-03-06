/*
 * Desarrollo de Aplicaciones Multiplataforma modalidad e-learning
 * Curso 2023/2024. MÓDULO: ENTORNOS DE DESARROLLO
 * Realización de la Tarea para ED04 Alumno: Miguel Ángel S.R.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Clase Main. Implementa la funcionalidad de creación de una nueva cuenta
 * bancaria y las operaciones de ingresar o retirar una cantidad de la misma
 * así como consultar el saldo actual
 * @author Miguel Ángel S.R.
 * @version 0.1
 */
public class Main {

    /**
     * Método main. Crea una nueva cuenta bancaria y trata de realizar operaciones
     * sobre ella controlando las posibles excepciones que se pudieran producir
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Objeto CCuenta con la cuenta bancaria a crear
         */
        CCuenta objetoCuenta;
        /**
         * Variable para almacenar el saldo de la cuenta en un momento determinado
         */
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
                
        try {
            probarRetirar(objetoCuenta, 2000, 0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            probarIngresar(objetoCuenta, 500, 0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es: "+ saldoActual );
    }
    
    /**
     * Método que trata de realizar la retirada de una cantidad en la cuenta
     * recibida, lanzando una excepción si la operación no ha sido posible
     * @param cuenta Objeto CCuenta en el que realizar la operación
     * @param cantidad Cantidad a retirar (double)
     * @param cantidadEsperada
     * @throws Exception No ha sido posible realizar la retirada
     */
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) throws Exception{
        cuenta.retirar(cantidad);
    }
    
    /**
     * Método que trata de ingresar una cantidad en la cuenta recibida, lanzando
     * una excepción si la operación no se ha podido realizar
     * @param cuenta Objeto CCuenta en el que realizar la operación
     * @param cantidad Cantidad a ingresar (double)
     * @param cantidadEsperada
     * @throws Exception No ha sido posible realizar el ingreso
     */
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) throws Exception{
        cuenta.ingresar(cantidad);
    }
}
