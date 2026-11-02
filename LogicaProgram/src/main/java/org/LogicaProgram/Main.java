package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q6: Dado um ano, diga se ele é bissexto (divisível por 4, mas não por 100, exceto se também for divisível por
400). (Fácil)*/

        /*Entrada: 2024 Saída: Bissexto*/

        int ano=2024;

        if(ano<=0){
            System.out.println("Não é valido");
            return;
        }

        if(((ano%4==0) && ano%100!=0) || (ano%400==0)){
            System.out.println("É bissexto");
        }else{
            System.out.println("Não é bissexto");
        }

    }
}
