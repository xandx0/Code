package turmaNoite;
import java.util.Scanner;
public class Aula03_05_22 {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        String nome = tecla.nextLine();
        System.out.println("Qual é sua idade?");
        int idade = tecla.nextInt();
        if(idade<18){
            System.out.println(nome+" Você é menor de idade.");
        }else{
            System.out.println(nome+" Você é maior de idade.");
        }
    }
}
