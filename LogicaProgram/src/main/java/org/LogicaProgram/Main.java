package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q9: Dados dois números, diga qual dos dois é o maior. (Fácil)*/

        /*Entrada: 8, 3 Saída: 8 é maior*/

        double dadoA=8f;
        double dadoB=3f;

        if(dadoA==dadoB){
            System.out.println("Os dois tem o mesmo valor!");
            return;
        }

        String rest=(dadoA>dadoB)?"O dado A é maior: "+dadoA:"O dado B é maior: "+dadoA;
        System.out.println(rest);

    }
}
