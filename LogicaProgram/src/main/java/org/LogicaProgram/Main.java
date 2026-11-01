package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q2: Dada a idade de uma pessoa, informe se ela é maior de idade (18 anos ou mais). (Fácil)*/

        /*Entrada: 20 Saída: Maior de idade*/

        int idade=0;

        if(idade<0){
            System.out.println("Ainda não foi nascido!");
            System.exit(0);
        }

        if(idade>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }


    }
}
