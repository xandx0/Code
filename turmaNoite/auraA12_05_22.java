package turmaNoite;
import java.util.Scanner;
public class auraA12_05_22 {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int numAlu = 5;
        double[] notaAlu = new double[numAlu];
        for(int i=0; i<numAlu;++i){
            System.out.println("Digite a nota do "+(i+1)+" aluno: ");
            notaAlu[i]=a.nextDouble();
        }
    }
}
