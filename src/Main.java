import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Luta de Herois");
        System.out.print("Digite o nome:  ");
        String nome = sc.nextLine();
        System.out.print("Digite o Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        AtackHeros atack = new AtackHeros();
        String resultado  = atack.Atack(tipo);

        System.out.println("O " +tipo+ " atacou usando " +resultado);

    }
}