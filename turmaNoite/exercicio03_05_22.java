package turmaNoite;
import java.util.Scanner;
public class exercicio03_05_22 {
    public static void main(String[]args){
        try (Scanner tecla = new Scanner(System.in)) {
            float N1, N2, media;
            System.out.println("Nome do aluno: ");
            String nome = tecla.nextLine();
            System.out.println("Digite a primeira nota.");
            N1 = tecla.nextFloat();
            System.out.println("Digite a segunda nota.");
            N2 = tecla.nextFloat();
            media =(N1+N2)/2;
            if(media<6){
                System.out.println(nome+" Aluno Reprovado.");
            }else{
                System.out.println(nome+" Aluno Aprovado");
            }
        }
    }
}
