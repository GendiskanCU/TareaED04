/*
 * Desarrollo de Aplicaciones Multiplataforma modalidad e-learning
 * Curso 2023/2024. MÓDULO: ENTORNOS DE DESARROLLO
 * Realización de la Tarea para ED04 Alumno: Miguel Ángel S.R.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
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
    
    static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) throws Exception{
        cuenta.retirar(cantidad);
    }
    
    static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) throws Exception{
        cuenta.ingresar(cantidad);
    }
}
