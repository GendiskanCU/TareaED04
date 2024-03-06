/*
 * Desarrollo de Aplicaciones Multiplataforma modalidad e-learning
 * Curso 2023/2024. MÓDULO: ENTORNOS DE DESARROLLO
 * Realización de la Tarea para ED04 Alumno: Miguel Ángel S.R.
 */

package tarea4endes24;


public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es: "+ saldoActual );
        
    
    }
}
