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
public class Categoria {
    
    private int idcategoria;
    private String caNombre;

    public Categoria() {
    }
    
    

    public Categoria(int idcategoria, String caNombre) {
        this.idcategoria = idcategoria;
        this.caNombre = caNombre;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCaNombre() {
        return caNombre;
    }

    public void setCaNombre(String caNombre) {
        this.caNombre = caNombre;
    }
    
    
    
}
