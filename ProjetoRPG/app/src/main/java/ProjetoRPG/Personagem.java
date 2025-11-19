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
        String msg = nome + " tenta atacar " + inimigo.nome + "!\n";

        if (calcularAcerto(inimigo)) {
            int dano = forca + Dados.rolar(1, 6);
            inimigo.vida -= dano;
            msg += "O ataque acerta e causa " + dano + " de dano!";
        } else {
            msg += "O ataque erra o alvo!";
        }

        return msg;
    }

    // ===== Chance de acerto =====
    public boolean calcularAcerto(Personagem inimigo) {
        int chance = 50 + (this.agilidade - inimigo.agilidade) * 5;

        chance += bonusTemporarioDeAcerto;

        if (chance < 10) chance = 10;
        if (chance > 95) chance = 95;

        bonusTemporarioDeAcerto = 0; // limpa o bônus após usar

        int sorte = (int)(Math.random() * 100) + 1;

        return sorte <= chance;
    }

    // ===== Rolar dado usando a classe Dados =====
    public int rolarDados(int qtd, int lados) {
        return Dados.rolar(qtd, lados);
    }


    // ===== Fugir =====
    public String fugir(Personagem inimigo) {
        int chanceFuga = 50 + (this.agilidade - inimigo.agilidade) * 5;

        if (chanceFuga < 10) chanceFuga = 10;
        if (chanceFuga > 95) chanceFuga = 95;

        int sorte = (int)(Math.random() * 100) + 1;

        if (sorte <= chanceFuga) {
            return nome + " conseguiu fugir!";
        } else {
            return nome + " tentou fugir, mas falhou!";
        }
    }
    
    public String usarItem(Item item) {
        String log = getNome() + " usou " + item.getNome() + "! ";

        if (item.getVidaCurada() > 0) {
            this.vida += item.getVidaCurada();
            log += "Recuperou " + item.getVidaCurada() + " de vida. ";
        }

        if (item.getManaCurada() > 0) {
            this.mana += item.getManaCurada();
            log += "Recuperou " + item.getManaCurada() + " de mana. ";
        }

        if (item.getBuffForca() > 0) {
            this.forca += item.getBuffForca();
            log += "Ganhou +" + item.getBuffForca() + " de força. ";
        }

        return log;
    }

    
     // Getters e utilitários
    public boolean estaVivo() { 
      return vida > 0; 
    }
    public String getNome() {
        return nome; 
    }
    public int getVida() {
        return vida; 
    }
    public int getMana() {
        return mana; 
    }
    
    public int getForca() {
        return forca;
    }
    
    public int getAgilidade(){
        return agilidade;
    }
}
