package turmaNoite;
import java.util.Scanner;
public class Aula04_05_22{
    public static void main(String[]args){
        Scanner Aula= new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        String nome=Aula.nextLine();
        System.out.println("Qual sua idade?");
        int idade= Aula.nextInt();
        if(idade<1){
            System.out.println("Idade não é válida");
        }else if(idade<18){
            System.out.println(nome+" Você é menor de idade.");
        }else{
            System.out.println(nome+" Você é maior de idade.");
        }
    }
}