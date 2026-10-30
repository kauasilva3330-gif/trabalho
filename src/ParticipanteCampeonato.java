public class ParticipanteCampeonato extends Participante {
    private String nomeCampeonato;
    private String jogo;

    public ParticipanteCampeonato(String nome, String email,
                                  String nomeCampeonato, String jogo) {
        super(nome, email, "Campeonato");
        this.nomeCampeonato = nomeCampeonato;
        this.jogo = jogo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Campeonato: " + nomeCampeonato);
        System.out.println("Jogo: " + jogo);
    }
}
