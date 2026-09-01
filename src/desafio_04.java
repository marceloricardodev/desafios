import java.util.Scanner;

public class desafio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é pedestre ou motorista?");
        System.out.println("1. Pedestre");
        System.out.println("2. Motorista");
        System.out.print("Resposta: ");
        int opcao = Integer.parseInt(scanner.nextLine().trim());

        if (opcao == 1) {
            System.out.print("Você está na faixa de travessia de pedestres?S (se sim) ou N (se não): ");
            String faixa = scanner.nextLine().trim().toUpperCase();

            System.out.print("O sinal está vermelho para os carros?S (se sim) ou N (se não): ");
            String semaforo = scanner.nextLine().trim().toUpperCase();

            if (faixa.equals("S") && semaforo.equals("S")) {
                System.out.println("Você pode atravessar a rua.");
            } else {
                System.out.println("Você NÃO pode atravessar a rua.");
            }

        } else if (opcao == 2) {
            System.out.print("Você está usando cinto de segurança?S (se sim) ou N (se não): ");
            String cinto = scanner.nextLine().trim().toUpperCase();

            System.out.print("Você bebeu alguma bebida alcoólica?S (se sim) ou N (se não): ");
            String bebida = scanner.nextLine().trim().toUpperCase();

            System.out.print("O sinal está verde para os carros?S (se sim) ou N (se não): ");
            String semaforo = scanner.nextLine().trim().toUpperCase();

            if (cinto.equals("S") && bebida.equals("N") && semaforo.equals("S")) {
                System.out.println("Você pode dirigir.");
            } else {
                System.out.println("Você NÃO pode dirigir.");
            }

        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}