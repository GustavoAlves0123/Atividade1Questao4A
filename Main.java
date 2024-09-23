class Jogo {
    int codigo;
    String nome;
    String tipo;
    double tamanho;

    public Jogo(int codigo, String nome, String tipo, double tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    void iniciar() {
        System.out.println("O jogo " + nome + " foi iniciado.");
    }

    void encerrar() {
        System.out.println("O jogo " + nome + " foi encerrado.");
    }
}

class Tela {
    int codigo;
    String descricao;
    String tipo;
    double tamanho;

    public Tela(int codigo, String descricao, String tipo, double tamanho) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    void ligar() {
        System.out.println("A tela foi ligada.");
    }

    void desligar() {
        System.out.println("A tela foi desligada.");
    }
}

class Processador {
    int codigo;
    String descricao;
    String tipo;
    double velocidade;

    public Processador(int codigo, String descricao, String tipo, double velocidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    void acelerar() {
        System.out.println("Processador acelerado.");
    }

    void desacelerar() {
        System.out.println("Processador desacelerado.");
    }
}

class Memoria {
    int codigo;
    String tipo;
    double capacidade;

    public Memoria(int codigo, String tipo, double capacidade) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    void alocar() {
        System.out.println("Memória alocada.");
    }

    void desalocar() {
        System.out.println("Memória desalocada.");
    }
}

class Celular {
    int codigo;
    String modelo;
    String marca;
    List<Jogo> jogosInstalados;
    Tela tela;
    Processador processador;
    Memoria memoria;

    public Celular(int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.jogosInstalados = new ArrayList<>();
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
    }

    void ligar() {
        tela.ligar();
        System.out.println("Celular " + modelo + " ligado.");
    }

    void desligar() {
        tela.desligar();
        System.out.println("Celular " + modelo + " desligado.");
    }

    void chamar() {
        System.out.println("Chamando...");
    }

    void instalarJogo(Jogo jogo) {
        jogosInstalados.add(jogo);
        System.out.println("Jogo " + jogo.nome + " instalado no celular " + modelo);
    }

    void listarJogos() {
        System.out.println("Jogos instalados no celular " + modelo + ":");
        for (Jogo jogo : jogosInstalados) {
            System.out.println(jogo.nome);
        }
    }
}