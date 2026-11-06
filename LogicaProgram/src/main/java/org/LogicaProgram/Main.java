package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q13: Dado o número de um mês (1 a 12), diga a qual estação do ano ele pertence no hemisfério sul (considere
dezembro, janeiro e fevereiro como verão). (Fácil)*/

        /*Entrada: 1 Saída: Verão*/

        int input=-4;

        if(input<=0 || input >12){
            System.out.println("Input inválido");
            return;
        }

        String resu="";

        if(input == 1 || input==2 || input==12){
            resu="Verão";

        }else if(input >= 3 && input <=5){
            resu="Outono";

        } else if (input >= 6 && input <=9) {
            resu="inverno";
        }else{
            resu="Primavera";
        }

        System.out.println(resu);

    }
}
