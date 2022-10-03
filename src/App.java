import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);       
 
        System.out.println("Digite suas 4 notas bimestrais: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        scan.close();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Sua media e: " + media);
    }
}
