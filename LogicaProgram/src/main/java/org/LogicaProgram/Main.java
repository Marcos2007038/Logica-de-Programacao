package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q11: Dado o peso e a altura de uma pessoa, calcule o IMC e diga se está na faixa de peso normal (18.5 a 24.9). (Fácil)*/

        /*Entrada: peso 70, altura 1.75 Saída: IMC 22.9 — Peso normal*/

        /*imc=peso(kg)/altura(m)^2*/

        float altura=1.70f;
        float peso=85f;

        float imc = peso/(altura*altura);

        if(imc>=18.5 && imc<=24.9){
            System.out.println("Faixa de imc ideial: "+imc);
        }else{
            System.out.println("Sua faixa n esta muito legal não: "+imc);
        }

    }
}
