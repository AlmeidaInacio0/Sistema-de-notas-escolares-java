import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //pegar as duas primeiras notas

    System.out.println("Digite a priemeira nota B1");
    float nota1 = scanner.nextFloat();

    System.out.println("Digite a segunda nota B1");
    float nota2 = scanner.nextFloat();
    //adic e div por 2

        float resultadoB1 = (nota1 + nota2) /2;

        System.out.println(resultadoB1);

        //Sistema de media
        if (resultadoB1 >=6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


        //pegar as notas do segundo bimestre


        System.out.println("Digite a priemeira nota do B2");
        float nota3 = scanner.nextFloat();

        System.out.println("Digite a segunda nota do B2");
        float nota4 = scanner.nextFloat();

        float resultadoB2 = (nota3 + nota4) /2;

        System.out.println(resultadoB2);

        //Sistema de media
        if (resultadoB2 >=6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
            //Sistema de resultados finais 

        float resultadoFinal = (resultadoB1 + resultadoB2) /2;

        if (resultadoFinal>=6){
            System.out.println("passou de ano");
        }
        else {
            System.out.println("Reprovou");
        }
        System.out.println(resultadoFinal);




    }
}