public class ParticipanteCosplay extends Participante {
    private String personagem;
    private String universo;

    public ParticipanteCosplay(String nome, String email,
                               String personagem, String universo) {
        super(nome, email, "Cosplay");
        this.personagem = personagem;
        this.universo = universo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Personagem: " + personagem);
        System.out.println("Universo: " + universo);
    }
}
