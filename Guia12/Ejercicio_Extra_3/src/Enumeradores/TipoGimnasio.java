/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeradores;

/**
 *
 * @author Sebastián Cozzi
 */
public enum TipoGimnasio {

    CLASEA('A', "Gimnasio Completo", 50),
    CLASEB('B', "Gimnasio Básico", 30),
    NOTIENE(' ', "No tiene Gimnasio", 0);
    private char tipo;
    private String descripcion;
    private int precio;

    private TipoGimnasio() {
    }

    private TipoGimnasio(char tipo, String descripcion, int precio) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
