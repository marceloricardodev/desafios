import java.util.Scanner;

public class desafio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto 1: ");
        String nome1 = scanner.nextLine();
        System.out.print("Preço do produto 1: ");
        double preco1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nome do produto 2: ");
        String nome2 = scanner.nextLine();
        System.out.print("Preço do produto 2: ");
        double preco2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nome do produto 3: ");
        String nome3 = scanner.nextLine();
        System.out.print("Preço do produto 3: ");
        double preco3 = scanner.nextDouble();

        String nomeMaisBarato;
        double precoMaisBarato;

        if (preco1 <= preco2 && preco1 <= preco3) {
            nomeMaisBarato = nome1;
            precoMaisBarato = preco1;
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            nomeMaisBarato = nome2;
            precoMaisBarato = preco2;
        } else {
            nomeMaisBarato = nome3;
            precoMaisBarato = preco3;
        }

        System.out.println("O produto mais barato é: " + nomeMaisBarato + " (R$ " + precoMaisBarato + ")");

        scanner.close();
    }
}