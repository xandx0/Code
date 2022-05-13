package turmaNoite;
import java.util.Scanner;
public class deverDeCasa25_04_22 {
    public static void main(String[] args){
        Scanner tecla= new Scanner(System.in);
        String nome, ender, sexo;
        int idade;
        System.out.println("Qual é seu nome? ");
        nome = tecla.nextLine();
        System.out.println("Qual é seu sexo? ");
        sexo = tecla.nextLine();
        System.out.println("Qual é sua idade? ");
        idade = tecla.nextInt();
        System.out.println("Onde você mora?");
        ender = tecla.nextLine();
        ender = tecla.nextLine();
        System.out.println("\nSEU DADOS\n"+"Nome: "+ nome +"\nSexo: "+ sexo +"\nIdade: "+ idade +"\nEndereço: "+ender);
    }
}
