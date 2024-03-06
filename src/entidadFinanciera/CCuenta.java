/*
 * Desarrollo de Aplicaciones Multiplataforma modalidad e-learning
 * Curso 2023/2024. MÓDULO: ENTORNOS DE DESARROLLO
 * Realización de la Tarea para ED04 Alumno: Miguel Ángel S.R.
 */

package entidadFinanciera;

/**
 * Clase CCuenta. Implementa los atributos y métodos para la gestión
 * de una cuenta bancaria
 * @author Miguel Ángel S.R.
 * @version 0.9a
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    /**
     * Cadena de texto con el IBAN de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés aplicable en caso de descubierto
     */
    private double tipoInterés;
    
    /**
     * Constante con el mensaje de error cuando se intente ingresar una
     * cantidad negativa
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que recibe el nombre del titular, el IBAN, el saldo
     * inicial y el tipo de interés aplicable en caso de descubierto 
     * @param nom Nombre del titular (String)
     * @param cue Número IBAN de la cuenta (String)
     * @param sal Saldo inicial (double)
     * @param tipo Tipo de interés (double)
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
    * Método que devuelve el nombre del titular de la cuenta
    * @return Nombre del titular
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece o modifica el nombre del titular de la cuenta
     * @param nombre Nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el número IBAN de la cuenta
     * @return Nº IBAN
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que establece o modifica el número IBAN de la cuenta
     * @param cuenta Nº IBAN
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta
     * @return Saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que establece o modifica el saldo de la cuenta
     * @param saldo Nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés aplicable en caso de descubierto
     * @return El tipo de interés (double)
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que establece o modifica el tipo de interés aplicable por descubierto
     * @param tipoInterés El tipo de interés (double)
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    
    /**
     * Método que devuelve el saldo actual de la cuenta
     * @return Saldo actual (double)
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Método que trata de ingresar la cantidad recibida en la cuenta
     * incrementando su saldo. Lanza una excepción si se intenta
     * ingresar una cantidad negativa
     * @param cantidad Cantidad a ingresar (double)
     * @throws Exception No se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }
    

    /**
     * Método que trata de retirar de la cuenta la cantidad recibida como
     * parámetro, reduciendo el saldo si la operación se ha podido llevar a
     * cabo. Lanza una excepción si se intenta retirar una cantidad negativa
     * o si no hay suficiente saldo
     * @param cantidad Cantidad a retirar (double)
     * @throws Exception No se pueden retirar cantidades negativas y el
     * saldo ha de ser mayor o igual a la cantidad a retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   