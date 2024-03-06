/*
 * Desarrollo de Aplicaciones Multiplataforma modalidad e-learning
 * Curso 2023/2024. MÓDULO: ENTORNOS DE DESARROLLO
 * Realización de la Tarea para ED04 Alumno: Miguel Ángel S.R.
 */

package tarea4endes24;


public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    public double estado(){
        return this.saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   