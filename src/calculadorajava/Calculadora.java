/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorajava;

/**
 *
 * @author Ron
 */
public class Calculadora {
    
    private float digito1;
    private float digito2;
    
    
    public Calculadora (){

}

public Calculadora (float digitol, float digito2) {

    this.digito1 = digitol;
    this.digito2 = digito2;
}
//metodos operaciones artimeticas basicas
public float sumar () {
    float suma = this.digito1 + this.digito2;
    return suma; }

public float restar () {
    float resta = this.digito1 - this.digito2;
    return resta; }

public float multiplicar () {
    float multiplicacion = this.digito1 * this.digito2;
    return multiplicacion; }

public double dividir () {
    double division = (double)this.digito1 / (double)this.digito2;
    return division; }

    public float getOperandol() {
        return digito1;
    }

    public void setOperandol(float digitol) {
        this.digito1 = digitol;
    }

    public float getOperando2() {
        return digito2;
    }

    public void setOperando2(float digito2) {
        this.digito2 = digito2;
    }

}
