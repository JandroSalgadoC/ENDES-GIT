/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4_PRACT1_Refactorizacion;

/**
 *
 * @author salga
 */
public class Zumo {
    private int litros;//contenido actual del deposito de zumo.
    private int precio_litro;
    private String sabor;
    private int litros_max;//capacidad máxima del deposito.
    
    /*Constructor por defecto*/
    public Zumo(){
        
    }
    
    /*Constructor con todos los atributos*/
    public Zumo(int litros, int precio_litro, String sabor, int litros_max) {
        this.litros = litros;
        this.precio_litro = precio_litro;
        this.sabor = sabor;
        this.litros_max = litros_max;
    }    

    /*Método que permite rellenar el deposito de zumo siempre y cuando 
    la capadidad no se sobrepase. Este método sera probado con JUnit.*/ 

    public void rellenar(int litros) throws Exception{

        if((this.getLitros() + litros )> this.getLitros_max()){
            throw new Exception("No se puede sobrepasar la capacidad del depósito");
        }

        this.setLitros(this.getLitros() + litros);    
        }

    /*Método que permite sacar litros del depósito de zumo siempre y cuando 
    el deósito contenga los litros necesarios, y el dinero introducido sea suficiente.*/
    public void sacarZumo(int litros, int dinero)throws Exception{
        if(this.getLitros()<litros){
            throw new Exception("No se puede sacar tanta cantidad del depósito");
        }
        if((litros*this.getPrecio_litro())>dinero){
            throw new Exception("El dinero es insuficiente");
        }
        this.setLitros(this.getLitros() - litros);
    }

    /*Método que devuelve la cantidad actual de litros del depçosito de zumo.*/
    public int obtenerLitros(){
        return this.getLitros();
    }

    /**
     * @return the litros
     */
    public int getLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(int litros) {
        this.litros = litros;
    }

    /**
     * @return the precio_litro
     */
    public int getPrecio_litro() {
        return precio_litro;
    }

    /**
     * @param precio_litro the precio_litro to set
     */
    public void setPrecio_litro(int precio_litro) {
        this.precio_litro = precio_litro;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the litros_max
     */
    public int getLitros_max() {
        return litros_max;
    }

    /**
     * @param litros_max the litros_max to set
     */
    public void setLitros_max(int litros_max) {
        this.litros_max = litros_max;
    }

}