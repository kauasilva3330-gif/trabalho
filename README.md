# Desafio POO I — Operação Crachá Geek

Projeto Java para cadastrar e exibir participantes de um evento geek.

## Organização do código — Checkpoint A
- `src/Participante.java`: classe base, com identificador, nome, e-mail e tipo de participação.
- `src/ParticipanteCampeonato.java`: dados específicos de campeonato e jogo.
- `src/ParticipanteCosplay.java`: dados específicos de personagem e universo.
- `src/ParticipantePalestra.java`: dados específicos de palestra e palestrante.
- `src/Main.java`: cria os três objetos e exibe os dados no console.

## Teste dos objetos — Checkpoint B

| Objeto | Tipo | Dados específicos |
|---|---|---|
| Lucas Almeida | Campeonato | Copa Geek; Valorant |
| Ana Souza | Cosplay | Mikasa Ackerman; Attack on Titan |
| Pedro Santos | Palestra | Desenvolvimento de jogos; Marina Costa |

## Comportamento esperado — Checkpoint C
O programa instancia três objetos de tipos diferentes. Os dados de cada participante são armazenados nos atributos e exibidos no console pelo método `exibirDados()`. O método é sobrescrito nas classes especializadas para exibir também os dados específicos de cada tipo. Assim, o programa demonstra encapsulamento, herança e polimorfismo.

## Conceitos de orientação a objetos
- **Encapsulamento:** os atributos são privados e acessados por getters/setters públicos.
- **Validação:** nome e tipo de participação não podem ficar vazios; o e-mail passa por uma validação simples.
- **Herança:** as classes especializadas herdam de `Participante`.
- **Polimorfismo:** o método `exibirDados()` apresenta informações diferentes conforme o tipo de participante.

## Como executar
É necessário ter o JDK instalado. Na pasta do projeto, execute:

```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

Os três cadastros serão exibidos no console.

## Desenho manuscrito obrigatório — Checkpoint D
Faça o desenho à mão em uma folha e digitalize/fotografe para anexar à entrega. Inclua:

**Participante**
- Atributos privados: `id: int`, `nome: String`, `email: String`, `tipoParticipacao: String`
- Métodos públicos: construtor, getters/setters e `exibirDados(): void`

**ParticipanteCampeonato extends Participante**
- Atributos: `nomeCampeonato: String`, `jogo: String`
- Método: `exibirDados(): void`

**ParticipanteCosplay extends Participante**
- Atributos: `personagem: String`, `universo: String`
- Método: `exibirDados(): void`

**ParticipantePalestra extends Participante**
- Atributos: `temaPalestra: String`, `palestrante: String`
- Método: `exibirDados(): void`

Use `-` para atributos privados e `+` para métodos públicos. Desenhe as setas de herança das três classes especializadas apontando para `Participante`.

> A entrega final deve incluir o código-fonte, este README, o link do repositório e o desenho manuscrito anexado. Teste a execução antes de enviar.
