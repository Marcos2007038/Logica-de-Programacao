package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q3: Dado um número inteiro, diga se ele é positivo, negativo ou zero. (Fácil)*/

        /*Entrada: -7 Saída: Negativo*/


        int numero=0;

        if(numero>0){
            System.out.println("Zero");
        } else if (numero<0) {
            System.out.println("Negativo");
        }else if (numero>0) {
            System.out.println("Positivo");
        }else{
            System.out.println("Não é número");
        }


    }
}
