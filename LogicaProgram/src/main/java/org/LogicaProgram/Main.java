package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q5: Dados os três lados de um triângulo, diga se ele é equilátero (todos os lados iguais). (Fácil)*/

        /*Entrada: 5, 5, 5 Saída: É equilátero*/


        String valoreEq=" 1.5, 15, 15 ";

        String[] valorTriangulo=valoreEq.split(",");


        if(valorTriangulo.length != 3){
            System.out.println("Input inválido");
        }else{

            float ladoA=Float.parseFloat(valorTriangulo[0].trim());
            float ladoB=Float.parseFloat(valorTriangulo[1].trim());
            float ladoC=Float.parseFloat(valorTriangulo[2].trim());

            if(ladoA==ladoB && ladoB==ladoC){
                System.out.println("É equilátero");
            }else {
                System.out.println("Não é equilátero");
            }

        }





    }
}
