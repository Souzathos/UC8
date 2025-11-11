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
public class Personagem {
    String nome;
    int vida;
    int mana;
    int forca;
    int agilidade;

    public Personagem(String nome, int vida, int mana, int forca, int agilidade) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.agilidade = agilidade;
    }

    private int atacar(Personagem inimigo) {
        inimigo.vida -= this.forca;
        return inimigo.vida;
    }
    
    private void usarHabilidade(Personagem inimigo) {
        
    }
    
    static void usarItem(){
        int pocaoCura = 25;
        int pocaoMana = 40;
        
    }
    
    static void fugir() {
    
    }
    
    static int rolarDados(int quantidade, int dados) {
        
        int quantidadeAleatoria = (int) (Math.random() * 2) + 1;
        //Gera um numero aleatorio entre 0 e o numero de dados passado na hora de chamar a classe
        int numeroAleatorio = (int) (Math.random() * 6) + 1;
        //Multiplica a quantidade dos dados pelo numero que caiu no dado
        int jogada = quantidade * numeroAleatorio;
        return jogada;
    }


    static void calcularChanceDeAcerto(Personagem inimigo){
       
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
