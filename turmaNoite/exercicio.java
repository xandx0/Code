package turmaNoite;
import java.util.Scanner;
public class exercicio {
    public static void main(String[]args){
        Scanner tecla=new Scanner(System.in);
        float N1, N2;
        float media;
        System.out.println("digite a primeira nota");
        N1=tecla.nextFloat();
        System.out.println("digite o segunda nota");
        N2=tecla.nextFloat();
        media=(N1+N2)/2;
        System.out.println("Sua media é: "+ media);
    }
}
