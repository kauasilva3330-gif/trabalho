/**
 * Classe base que representa qualquer participante do evento geek.
 * Os atributos sao privados para proteger os dados (encapsulamento).
 */
public class Participante {
    private static int proximoId = 1;

    private final int id;
    private String nome;
    private String email;
    private String tipoParticipacao;

    public Participante(String nome, String email, String tipoParticipacao) {
        this.id = proximoId++;
        setNome(nome);
        setEmail(email);
        setTipoParticipacao(tipoParticipacao);
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ficar vazio.");
        }
        this.nome = nome.trim();
    }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Informe um e-mail valido.");
        }
        this.email = email.trim();
    }

    public String getTipoParticipacao() { return tipoParticipacao; }

    public void setTipoParticipacao(String tipoParticipacao) {
        if (tipoParticipacao == null || tipoParticipacao.trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo de participacao nao pode ficar vazio.");
        }
        this.tipoParticipacao = tipoParticipacao.trim();
    }

    public void exibirDados() {
        System.out.println("Codigo: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Participacao: " + tipoParticipacao);
    }
}
