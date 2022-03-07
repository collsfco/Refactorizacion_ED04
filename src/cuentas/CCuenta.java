/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;
/**
 *
 * @author FColls
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Primer constructor
     */

    public CCuenta()
    {
    }
    /**
     * Segundo constructor.
     * @param nom nombre del titular de la cuenta
     * @param cue número de cuenta.
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés de la cuenta.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    /**
     * Método setter que asigna el nombre.
     * @param nom nombre del Titular
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Método que devuelve nombre.
     * @return devuelve el nombre del titular llamando al método getNombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }
    
    /**
     * Método que devuelve el saldo.
     * @return devuelve el saldo de la cuenta llamando al método getSaldo
     */
    public double estado()
    {
        return getSaldo();
    }
   
    /**
     * Método para ingresar dinero en la cuenta.
     * @param cantidad es la cantidad de dinero que se quiere ingresar en la cuenta.
     * @throws Exception si la cantidad de dinero indicada es negativa se genera la excepción
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad es la cantidad de dinero que se quiere retirar de la cuenta.
     * @throws Exception si la cantidad de dinero indicada es negativa o el saldo es insuficiente se genera la excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener el número de cuenta
     * @return devuelve el número de cuenta llamando al método getCuenta.
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }
    
    /**
     * Getter y Setter
     */
    
    /**
     * Método para obtener el nombre del titular
     * @return devuelve el atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método para asignar el nombre del titular
     * @param nombre valor para ser asignado al atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método para obtener el tipo de interés de la cuenta.
     * @return devuelve el atributo tipoInterés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para asignar el tipo de interés de la cuenta
     * @param tipoInterés valor para ser asignado al atributo tipoInterés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
     /**
     * Método para obtener el número cuenta
     * @return devuelve el atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para asignar el número cuenta
     * @param cuenta valor para ser asignado al atributo cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo de la cuenta
     * @return devuelve el atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo de la cuenta
     * @param saldo devuelve el atributo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
