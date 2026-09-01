import java.util.Scanner;

public class desafio_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Reserva de ingresso ===");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(scanner.nextLine().trim());

        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            System.out.println(nome + ", é proibida a entrada de menores de idade.");
            System.out.println("Faltam " + anosFaltantes + " ano(s) para você completar 18 anos e ter acesso ao clube.");
            System.out.println("Tente novamente mais tarde.");
        } else {

            System.out.print("Você é estudante de Python? (S/N): ");
            String estudante = scanner.nextLine().trim().toUpperCase();

            System.out.println("Você deseja:");
            System.out.println("1. Padrão");
            System.out.println("2. VIP");
            System.out.print("Resposta: ");
            int tipoIngresso = Integer.parseInt(scanner.nextLine().trim());

            double valor;
            String nomeIngresso;

            if (tipoIngresso == 1) {
                valor = 20.00;
                nomeIngresso = "Padrão";
            } else {
                valor = 50.00;
                nomeIngresso = "VIP";
            }

            if (estudante.equals("S")) {
                valor = valor / 2;
            }

            System.out.println("\n=== Comprovante ===");
            System.out.println(nome + ", sua reserva foi feita com sucesso!");
            System.out.println("Ingresso: " + nomeIngresso);

            if (estudante.equals("S")) {
                System.out.println("Por ser estudante de Python, você recebeu 50% de desconto.");
            }

            System.out.println("Valor a pagar: R$ " + valor);
            System.out.println("Pague no local.");
        }

        scanner.close();
    }
}