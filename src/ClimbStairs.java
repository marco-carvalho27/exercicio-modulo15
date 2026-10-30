import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao;

        do{

            System.out.print("Digite em qual degrau você deseja chegar: ");
            int n = Integer.parseInt(input.nextLine());

            new ClimbCalc(n);

            System.out.print("\nDeseja continuar? (S/N): ");
            opcao = String.valueOf(input.nextLine().charAt(0));

        }while(opcao.equalsIgnoreCase("S"));
    }
}