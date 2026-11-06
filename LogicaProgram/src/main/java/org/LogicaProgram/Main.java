package org.LogicaProgram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      Questões 001-100 — Condicionais e Operadores Lógicos (Fácil)

        /*Q12: Dada uma senha digitada, diga se ela tem pelo menos 8 caracteres (senha válida) ou não. (Fácil)*/

        /*Entrada: "abc123" Saída: Senha inválida (menos de 8 caracteres)*/

        String senha="abc123";

        String resu=(senha.length()>=8)?"Senha valida":"Senha não valida";
        
        System.out.println(resu);

    }
}
