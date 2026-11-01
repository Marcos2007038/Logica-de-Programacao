package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q4: Dada a nota final de um aluno (0 a 10), diga se ele foi aprovado (nota maior ou igual a 6) ou reprovado. (Fácil)*/

        /*Entrada: 7.5 Saída: Aprovado*/


        float nota=7.5f;

        if(nota>=6.0f && nota<=10.0f){
            System.out.println("Aprovado");
        } else if (nota>=0.0f && nota<=6.0f) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Entrada inválido, apenas de 0 até 10");
        }


    }
}
