package com.history.player;

import com.main.*;
import com.itens.*;
import com.history.monsters.*;
import java.io.IOException;

public class Personagem extends SerVivoComLevel {

    private String classe;
    private int idade;
    private int experienciaAtual;
    private int dinheiro;
    private int forca;
    private int inteligencia;
    private int constituicao;
    private int destreza;
    private int pontosPassivos;
    private int pontosAtivos;
    private int pontosAtributos;
    private ArmaDeCorte maoEsquerda = null;
    private ArmaDeCorte maoDireita = null;
    private Monstro inimigo = null;
    private ItemDeCura bolso1 = null;
    private ItemDeCura bolso2 = null;
    public int danoG;

    public Personagem() {

    }
    
    public void fichaPlayer() {
        System.out.println("\t\t\t>SUA FICHA\n");
        System.out.println(">Nome: " + this.nome);
        System.out.println(">Classe: " + this.classe);
        System.out.println(">Idade: " + this.idade);
        System.out.println(">Vida: " + this.vida + "/" + this.vidaCheia);
        System.out.println(">Level: " + level);
        System.out.println(">Experiencia(exp): " + this.experienciaAtual + "/" + obterExperienciaMaxima());
        System.out.println(">Dinheiro: " + this.dinheiro);
        System.out.println("\n\n\t\t\t>STATUS\n");
        if (this.pontosAtributos > 0) {
            System.out.println("\n\t\t>Pontos para gastar: " + this.pontosAtributos + "\n");
            System.out.println("   >for(+): " + this.forca + "   >int(+): " + this.inteligencia + "   >const(+): " + this.constituicao + "   >dex(+): " + this.destreza);
        } else {
            System.out.println("   >for: " + this.forca + "   >int: " + this.inteligencia + "   >const: " + this.constituicao + "   >dex: " + this.destreza);
        }
    }

    public void personagemNovo() throws IOException, InterruptedException {
        this.dinheiro = 100;
        this.level = 1;
        this.experienciaAtual = 0;
        this.forca = 5;
        this.constituicao = 5;
        this.destreza = 5;
        this.inteligencia = 5;
        this.pontosAtributos = 5;
        this.pontosPassivos = 2;
        this.pontosAtivos = 1;
        this.vidaCheia = 0;
        this.vida = 0;

        this.distribuirAtributos();

        switch (RpgImd.classeNumero) {
            case 1:
                this.vidaCheia = RpgImd.gerador.nextInt(20) + 101 + this.constituicao;
                break;
            case 2:
                this.vidaCheia = RpgImd.gerador.nextInt(20) + 101 + (this.constituicao / 2);
                break;
            case 3:
                this.vidaCheia = RpgImd.gerador.nextInt(20) + 101 + (this.constituicao / 3);
                break;
            default:
                this.vidaCheia = 100 + this.constituicao;
                break;
        }
        this.vida = this.vidaCheia;
    }

    public void distribuirAtributos() throws IOException, InterruptedException {
        if (this.pontosAtributos > 0) {
            int distribuir;
            do {
                RpgImd.imprimirCabecalho();
                System.out.println("\t\t>Distribuir Atributos\n\n");
                System.out.println(">Digite \"1\" para forca\n>Digite \"2\" para inteligencia\n>Digite \"3\" para constituicao\n>Digite \"4\" para destreza\n>Digite \"0\" para sair");
                System.out.println("\n\n>Voce ainda tem " + this.pontosAtributos + " pontos para gastar");
                RpgImd.imprimirRodape();
                distribuir = RpgImd.leitor.nextInt();
                switch (distribuir) {
                    case 1:
                        this.forca = this.forca + 1;
                        this.pontosAtributos = this.pontosAtributos - 1;
                        break;
                    case 2:
                        this.inteligencia = this.inteligencia + 1;
                        this.pontosAtributos = this.pontosAtributos - 1;
                        break;
                    case 3:
                        this.constituicao = this.constituicao + 1;
                        this.pontosAtributos = this.pontosAtributos - 1;
                        break;
                    case 4:
                        this.destreza = this.destreza + 1;
                        this.pontosAtributos = this.pontosAtributos - 1;
                        break;
                }

            } while ((this.pontosAtributos != 0) && (distribuir != 0));

            RpgImd.imprimirCabecalho();

            if (this.pontosAtributos < 1) {
                System.out.println(">Voce distribuiu todos os pontos");
            } else {
                System.out.println(">Voce ainda tem \"" + this.pontosAtributos + "\" pontos para distribuir");
                System.out.println(">Se quiser continuar distribuindo e so digitar \"3\"");
            }
        } else {
            System.out.println(">Voce nao tem pontos de atributos para distribuir");
        }

    }

    public void morto() {
        System.out.println("\t\t>Voce morreu, seu boboca");
        System.out.println("\t\n\t>Seu personagem antes da morte\n\n\n");
        System.out.println(">Seu nome era: " + this.nome);
        System.out.println(">Sua idade era: " + this.idade);
        System.out.println(">Seu dinheiro era de: " + this.dinheiro);
        System.out.println(">Seu Level: " + level);
        System.out.println(">Sua experiencia era: " + this.experienciaAtual + "/" + obterExperienciaMaxima());
        System.out.println(">Sua Forca: " + this.forca);
        System.out.println(">Sua constituicao: " + this.constituicao);
        System.out.println(">Sua inteligencia: " + this.inteligencia);
        System.out.println(">Seus pontos de atributos: " + this.pontosAtributos);
        System.out.println(">Seus pontos passivos: " + this.pontosPassivos);
        System.out.println(">Seus pontos Ativos: " + this.pontosAtivos);
    }

    public void uparVida() {
        switch (RpgImd.classeNumero) {
            case 1:
                this.vidaCheia = this.vidaCheia + this.constituicao + 10;
                break;
            case 2:
                this.vidaCheia = this.vidaCheia + (this.constituicao / 2) + 5;
                break;
            case 3:
                this.vidaCheia = this.vidaCheia + (this.constituicao / 3) + 2;
                break;
            default:
                this.vidaCheia = this.vidaCheia + (this.constituicao / 2);
                break;
        }
        this.vida = this.vidaCheia;
    }

    public boolean upou() {
        if ((this.experienciaAtual >= obterExperienciaMaxima()) && (this.experienciaAtual != 0)) {
            return true;
        }
        return false;
    }

    public void uparExp() {
        //player tem 35/30 experiencia
        this.experienciaAtual -= obterExperienciaMaxima();
        //player tem 5/45
        //lvl: 1
        level += 1;
        //lvl: 2
    }

    public void uparPontos() {
        this.pontosAtributos = this.pontosAtributos + 3;
        this.pontosPassivos = this.pontosPassivos + 2;
        this.pontosAtivos = this.pontosAtivos + 1;

        switch (RpgImd.classeNumero) {
            case 1:
                this.constituicao = this.constituicao + 2;
                this.inteligencia = this.inteligencia + 1;
                this.destreza = this.destreza + 1;
                this.forca = this.forca + 3;
                break;
            case 2:
                this.constituicao = this.constituicao + 2;
                this.inteligencia = this.inteligencia + 1;
                this.destreza = this.destreza + 3;
                this.forca = this.forca + 1;
                break;
            case 3:
                this.constituicao = this.constituicao + 1;
                this.inteligencia = this.inteligencia + 3;
                this.destreza = this.destreza + 2;
                this.forca = this.forca + 1;
                break;
            default:
                this.constituicao = this.constituicao + 1;
                this.inteligencia = this.inteligencia + 1;
                this.destreza = this.destreza + 1;
                this.forca = this.forca + 1;
                break;
        }
    }

    public void LevelUp() {
        while (this.experienciaAtual >= obterExperienciaMaxima()) {
            uparPontos();
            uparExp();
            uparVida();
        }
    }

    public int dificuldade() {
        int difi = this.destreza / 10;
        return difi;
    }

    public int dano() {
        int danone = 1;
        switch (RpgImd.classeNumero) {
            case 1:
                danone = this.forca / 10;
                break;
            case 2:
                danone = this.destreza / 10;
                break;
            case 3:
                danone = this.inteligencia / 10;
                break;
        }
        return danone;
    }

    public void AtaqueBasico() {
        RpgImd.d10();

        switch (RpgImd.classeNumero) {

            case 1:
                if (RpgImd.dadod10 > (5 - dificuldade())) {
                    RpgImd.d10();
                    this.danoG = this.dano() + RpgImd.dadod10;
                    System.out.print("Voce causou " + this.danoG + " de dano");
                    this.inimigo.setVida(this.forca / 2);
                } else {
                    System.out.print("Voce errou o ataque");
                }
                break;

            case 2:
                if (RpgImd.dadod10 > (5 - dificuldade())) {
                    RpgImd.d10();
                    this.danoG = this.dano() + RpgImd.dadod10;
                    System.out.print("Voce causou " + this.danoG + " de dano");
                    this.inimigo.setVida(this.destreza / 3);
                } else {
                    System.out.print("Voce errou o ataque");
                }
                break;

            case 3:
                if (RpgImd.dadod10 > (5 - dificuldade())) {
                    RpgImd.d10();
                    this.danoG = this.dano() + RpgImd.dadod10;
                    System.out.print("Voce causou " + this.danoG + " de dano");
                    this.inimigo.setVida(this.inteligencia);
                } else {
                    System.out.print("Voce errou o ataque");
                }
                break;

            default:
                if (RpgImd.dadod10 > (6 - dificuldade())) {
                    RpgImd.d10();
                    this.danoG = this.dano() + RpgImd.dadod10;
                    System.out.print("Voce causou " + this.danoG + " de dano");
                } else {
                    System.out.print("Voce errou o ataque");
                }
                break;
        }

    }

    public String getClasse() { //demonstra a classe do Personagem
        return this.classe;
    }

    public void setClasse(String classe) { //define a classe do personagem
        this.classe = classe;
    }

    public String getNome() { //demonstra o nome do personagem
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() { //demonstra a idade do personagem
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getLevel() { //demonstra o level do personagem
        return Math.round(Math.floor(level));
    }

    public void setLevel(int localLevel) {
        level = localLevel;
    }

    public int getExperiencia() { //demonstra a experienciaAtual do personagem
        return this.experienciaAtual;
    }

    public void setExperiencia(int experienciaAtual) {
        this.experienciaAtual = experienciaAtual;
    }

    public int getDinheiro() { //demonstra o dinheiro do personagem
        return this.dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVida() { //demonstra a vida do personagem
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
