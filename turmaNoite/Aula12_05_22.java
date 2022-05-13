package turmaNoite;
import java.util.Scanner;
public class Aula12_05_22 {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
            System.out.println("Digite o valor de 1 a 5: ");
            int num = a.nextInt();
            switch(num){
                case 1:
                System.out.println("Seu número é 1.");
                break;
                case 2:
                System.out.println("Seu número é 2.");
                break;
                case 3:
                System.out.println("Seu número é 3.");
                break;
                case 4:
                System.out.println("Seu número é 4.");
                break;
                case 5:
                System.out.println("Seu número é 5.");
                break;
                default:
                System.out.println("Seu número não corresponde.");
                
            }
        
        
    }
}
