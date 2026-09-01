import java.util.*;

public class desafio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] perguntas = {
                "Em que período histórico se passa Hogwarts Legacy?",
                "Quais são plataformas em que Hogwarts Legacy foi lançado?",
                "Quais estúdios estão ligados a Hogwarts Legacy?",
                "O que o jogador pode personalizar no seu personagem?",
                "Quais atividades existem na jogabilidade do jogo?"
        };

        String[][] textos = {
                {"Século XIX", "Final da década de 1890", "Idade Média", "Ano 2000"},
                {"PC", "PlayStation", "Nintendo 64", "Sega Genesis"},
                {"Avalanche Software", "Warner Bros. Games", "Ubisoft", "Electronic Arts"},
                {"A casa de Hogwarts", "A aparência física", "Um nível fixo, sem escolha", "Um nome obrigatório fixo"},
                {"Preparar poções", "Voar em vassoura", "Dirigir carros", "Nadar em piscina olímpica"}
        };

        boolean[][] corretas = {
                {true, true, false, false},
                {true, true, false, false},
                {true, true, false, false},
                {true, true, false, false},
                {true, true, false, false}
        };

        int acertos = 0;
        char[] letras = {'A', 'B', 'C', 'D'};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("\nPergunta " + (i + 1) + ": " + perguntas[i]);

            List<Integer> ordem = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
            Collections.shuffle(ordem, random);
            Set<Character> letrasCorretas = new HashSet<>();

            for (int j = 0; j < 4; j++) {
                int indiceOriginal = ordem.get(j);
                System.out.println(letras[j] + ") " + textos[i][indiceOriginal]);
                if (corretas[i][indiceOriginal]) {
                    letrasCorretas.add(letras[j]);
                }
            }

            System.out.print("Sua resposta (A/B/C/D): ");
            char resposta = scanner.nextLine().trim().toUpperCase().charAt(0);

            if (letrasCorretas.contains(resposta)) {
                System.out.println("Correto!");
                acertos++;
            } else {
                System.out.println("Errado.");
            }
        }

        System.out.println("\nVocê acertou " + acertos + " de " + perguntas.length + " perguntas.");

        scanner.close();
    }
}