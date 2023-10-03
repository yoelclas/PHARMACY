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
public class Proveedor {

    private String provRuc;
    private String provRazonSocial;
    private String provRepresentante;
    private String provDireccion;
    private String provCorreo;
    private String provWeb;
    private String provCelular;

    public Proveedor() {
    }

    public Proveedor(String provRuc, String provRazonSocial, String provRepresentante, String provDireccion, String provCorreo, String provWeb, String provCelular) {
        this.provRuc = provRuc;
        this.provRazonSocial = provRazonSocial;
        this.provRepresentante = provRepresentante;
        this.provDireccion = provDireccion;
        this.provCorreo = provCorreo;
        this.provWeb = provWeb;
        this.provCelular = provCelular;
    }

    public String getProvRuc() {
        return provRuc;
    }

    public void setProvRuc(String provRuc) {
        this.provRuc = provRuc;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getProvRepresentante() {
        return provRepresentante;
    }

    public void setProvRepresentante(String provRepresentante) {
        this.provRepresentante = provRepresentante;
    }

    public String getProvDireccion() {
        return provDireccion;
    }

    public void setProvDireccion(String provDireccion) {
        this.provDireccion = provDireccion;
    }

    public String getProvCorreo() {
        return provCorreo;
    }

    public void setProvCorreo(String provCorreo) {
        this.provCorreo = provCorreo;
    }

    public String getProvWeb() {
        return provWeb;
    }

    public void setProvWeb(String provWeb) {
        this.provWeb = provWeb;
    }

    public String getProvCelular() {
        return provCelular;
    }

    public void setProvCelular(String provCelular) {
        this.provCelular = provCelular;
    }
    
    

}
