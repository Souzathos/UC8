/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public abstract class Personagem {
    String nome;
    int vida;
    int mana;
    int forca;
    int agilidade;
    protected int bonusTemporarioDeAcerto = 0;

    public Personagem(String nome, int vida, int mana, int forca, int agilidade) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.agilidade = agilidade;
    }

    // métodos principais
    public abstract String usarHabilidade(Personagem inimigo);

    public String atacar(Personagem inimigo) {
        String msg = this.nome + " tenta atacar " + inimigo.nome + "!\n";
        if (calcularAcerto(inimigo)) {
            int dano = this.forca + rolarDados(1, 6);
            inimigo.vida -= dano;
            msg += "O ataque acerta e causa " + dano + " de dano!";
        } else {
            msg += "O ataque erra o alvo!";
        }
        return msg;
    }

    public boolean calcularAcerto(Personagem inimigo) {
        int chance = 50 + (this.agilidade - inimigo.agilidade) * 5;
        chance += this.bonusTemporarioDeAcerto;

        if (chance < 10) chance = 10;
        if (chance > 95) chance = 95;

        this.bonusTemporarioDeAcerto = 0;

        int sorte = (int) (Math.random() * 100) + 1;
        return sorte <= chance;
    }

    public int rolarDados(int qtd, int lados) {
        int total = 0;
        for (int i = 0; i < qtd; i++) {
            total = (int) (Math.random() * lados) + 1; 
        }
        return total;
    }

    public String fugir(Personagem inimigo) {
        int chanceFuga = 50 + (this.agilidade - inimigo.agilidade) * 5;
        if (chanceFuga < 10) chanceFuga = 10;
        if (chanceFuga > 95) chanceFuga = 95;

        int sorte = (int) (Math.random() * 100) + 1;
        if (sorte <= chanceFuga) {
            return nome + " conseguiu fugir do combate!";
        } else {
            return nome + " tentou fugir, mas falhou!";
        }
    }

    // Getters
    public boolean estaVivo() {
        return vida > 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    
}
