/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Ladino extends Personagem{
    
      public Ladino(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }


    public String usarHabilidade(Personagem inimigo) {
        double sorte = Math.random() * 100;
        if (sorte <= 70) {
            inimigo.vida = 0;
            return nome + " usa EVASÃO e escapa do combate!";
        } else {
            int dano = (forca + Dados.rolar(1, 6)) / 2;
            inimigo.vida -= dano;
            return nome + " contra-ataca e causa " + dano + " de dano!";
        }
    }
}
