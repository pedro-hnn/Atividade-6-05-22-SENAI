/*

Crie uma classe Calcular e os atributos numero1, numero2 e operador. Crie os métodos que achar necessário.

use o ToString para mostrar os valores apenas na chamada do objeto;
 */

public class Calcular {
    private Double num1;
    private Double num2;

    public Calcular(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double FazerSoma(){
        return this.num1 + this.num2;
    }

    public Double FazerSubtracao(){
        return this.num1 - this.num2;
    }

    public Double FazerMultiplicacao(){
        return this.num1*this.num2;
    }

    public Double FazerDivisao(){
        return this.num1/this.num2;
    }

    public String toString() {
        return "Primeiro Número = "+this.num1+"\nSegundo Número = "+num2;
    }
}
