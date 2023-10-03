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
public class Producto {

    private String pSerie;
    private String pDescripcion;
    private String pObservacion;
    private String digemi;
    private String pCondicion;
    private int idcategoria;
    private int idmarca;
    private int idmedida;

    public Producto() {
    }

    public Producto(String pSerie, String pDescripcion, String pObservacion, String digemi, String pCondicion, int idcategoria, int idmarca, int idmedida) {
        this.pSerie = pSerie;
        this.pDescripcion = pDescripcion;
        this.pObservacion = pObservacion;
        this.digemi = digemi;
        this.pCondicion = pCondicion;
        this.idcategoria = idcategoria;
        this.idmarca = idmarca;
        this.idmedida = idmedida;
    }

    public String getpSerie() {
        return pSerie;
    }

    public void setpSerie(String pSerie) {
        this.pSerie = pSerie;
    }

    public String getpDescripcion() {
        return pDescripcion;
    }

    public void setpDescripcion(String pDescripcion) {
        this.pDescripcion = pDescripcion;
    }

    public String getpObservacion() {
        return pObservacion;
    }

    public void setpObservacion(String pObservacion) {
        this.pObservacion = pObservacion;
    }

    public String getDigemi() {
        return digemi;
    }

    public void setDigemi(String digemi) {
        this.digemi = digemi;
    }

    public String getpCondicion() {
        return pCondicion;
    }

    public void setpCondicion(String pCondicion) {
        this.pCondicion = pCondicion;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public int getIdmedida() {
        return idmedida;
    }

    public void setIdmedida(int idmedida) {
        this.idmedida = idmedida;
    }

    
    
}
