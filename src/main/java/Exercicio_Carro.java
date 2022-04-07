import java.util.Scanner;

public class Exercicio_Carro  {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int A, B, soma;
        System.out.println("Digite o valor de A = ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B = " ); 
        B = sc.nextInt();     
        
        soma = A + B;
        
        System.out.println("SOMA = " + soma);
        
        sc.close();
        
       }
    
}
