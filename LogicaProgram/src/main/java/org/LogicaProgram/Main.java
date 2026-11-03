package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q7: Dado o valor de uma compra, informe se o cliente ganha frete grátis (compras acima de R$ 200). (Fácil)*/

        /*Entrada: 250 Saída: Frete grátis*/


        Double[] valores={25.0,23.0,90.0,21.0,5.7,89.45};

        /*
        * [0]-Carne
        * [1]-Peixe
        * [2]-Picanha
        * [3]-Frango
        * [4]-Miojo sabor carne
        * [5]-Pouvo Fresco
        * */


        // x,x,x,x,x,x,x
        String dados="0,0,0,0,0,0,0,0";

        char[] dadosTratados=dados.replaceAll("\\D","").toCharArray();

        int soma=0;
        for(char valor : dadosTratados){
            switch (valor){
                case '0':
                    soma+=valores[0];
                    break;
                case '1':
                    soma+=valores[1];
                    break;
                case '2':
                    soma+=valores[2];
                    break;
                case '3':
                    soma+=valores[3];
                    break;
                case '4':
                    soma+=valores[4];
                    break;
                case '5':
                    soma+=valores[5];
                    break;
                default:
                    System.out.println("Deu erro");
            }
        }
        String rest=(soma>=200)?"Ganhou fréte grátis":"Não ganhou o fréte grátis";
        System.out.println(rest+": "+soma);

    }
}
