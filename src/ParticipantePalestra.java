public class ParticipantePalestra extends Participante {
    private String temaPalestra;
    private String palestrante;

    public ParticipantePalestra(String nome, String email,
                                String temaPalestra, String palestrante) {
        super(nome, email, "Palestra");
        this.temaPalestra = temaPalestra;
        this.palestrante = palestrante;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tema da palestra: " + temaPalestra);
        System.out.println("Palestrante: " + palestrante);
    }
}
