package com.oscarblas.irecycle;

public class Direcciones {
    /**GET and SET, CONSTRUCCTOR de los datos con la cual se llenan los cardView**/
    private int imagen;
    private String nombre,tipo,direccion;
    private int button_ima;


    public Direcciones(int imagen, String nombre, String tipo, String direccion, int button_ima) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.button_ima = button_ima;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getButton_ima() {
        return button_ima;
    }

    public void setButton_ima(int button_ima) {
        this.button_ima = button_ima;
    }
}
