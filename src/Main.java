public class Main {
    public static void main(String[] args) {
        Participante[] participantes = {
            new ParticipanteCampeonato("Lucas Almeida", "lucas@email.com",
                "Copa Geek", "Valorant"),
            new ParticipanteCosplay("Ana Souza", "ana@email.com",
                "Mikasa Ackerman", "Attack on Titan"),
            new ParticipantePalestra("Pedro Santos", "pedro@email.com",
                "Desenvolvimento de jogos", "Marina Costa")
        };

        System.out.println("===== OPERACAO CRACHA GEEK =====");
        for (Participante participante : participantes) {
            System.out.println("\n------------------------------");
            participante.exibirDados();
        }
        System.out.println("\nTotal de participantes cadastrados: " + participantes.length);
    }
}
