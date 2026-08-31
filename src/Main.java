// Desafio 01

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Voce esta com fome? S (se sim) ou N (se não): ");
    String fome = scanner.nextLine().trim().toLowerCase();

    if (fome.equals("s")) {
        System.out.print("Você tem dinheiro? S (se sim) ou N (se não): ");
        String dinheiro = scanner.nextLine().trim().toLowerCase();

        if (dinheiro.equals("s")) {
            System.out.println("Vá até a Buger King, fica pertinho e é uma boa pedida!");
        } else {
            System.out.println("To sem dinheiro");
        }
    } else {
        System.out.println("To satisfeito");
    }

    scanner.close();
}
