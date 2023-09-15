/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author ygonz
 */
public class Usuario {

    private String uDni;
    private String uNombre;
    private String uApellido;
    private String uDireccion;
    private String uclave;
    private String uCelular;
    private int uTipo;
    private String tienda;

    public Usuario() {
    }

    public Usuario(String uDni, String uNombre, String uApellido, String uDireccion, String uclave, String uCelular, int uTipo, String tienda) {
        this.uDni = uDni;
        this.uNombre = uNombre;
        this.uApellido = uApellido;
        this.uDireccion = uDireccion;
        this.uclave = uclave;
        this.uCelular = uCelular;
        this.uTipo = uTipo;
        this.tienda = tienda;
    }

    public String getuDni() {
        return uDni;
    }

    public void setuDni(String uDni) {
        this.uDni = uDni;
    }

    public String getuNombre() {
        return uNombre;
    }

    public void setuNombre(String uNombre) {
        this.uNombre = uNombre;
    }

    public String getuApellido() {
        return uApellido;
    }

    public void setuApellido(String uApellido) {
        this.uApellido = uApellido;
    }

    public String getuDireccion() {
        return uDireccion;
    }

    public void setuDireccion(String uDireccion) {
        this.uDireccion = uDireccion;
    }

    public String getUclave() {
        return uclave;
    }

    public void setUclave(String uclave) {
        this.uclave = uclave;
    }

    public String getuCelular() {
        return uCelular;
    }

    public void setuCelular(String uCelular) {
        this.uCelular = uCelular;
    }

    public int getuTipo() {
        return uTipo;
    }

    public void setuTipo(int uTipo) {
        this.uTipo = uTipo;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

}
