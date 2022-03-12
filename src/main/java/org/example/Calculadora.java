package org.example;

public class Calculadora {
    double operandoA, operandoB;
    Operacoes op;

    public void setOperandoA(double operandoA) {

        this.operandoA = operandoA;
    }

    public void setOperandoB(double operandoB) {

        this.operandoB = operandoB;
    }

    public void setOperacao (char operador){
        switch (operador) {
            case '+':
                this.op = new Soma();
                break;
            case '-':
                this.op = new Subtracao();
                break;
            case '*':
                this.op = new Multiplicacao();
                break;
            case '/':
                this.op = new Divisao();
                break;
            default:
                System.out.println("Operação Inválida");
        }

    }

    public double calculaOperacao(){

        return this.op.operacao(this.operandoA, this.operandoB);
    }
}
