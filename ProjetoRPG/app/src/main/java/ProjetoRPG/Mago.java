/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Mago extends Personagem{
    
    public Mago(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }


    public String usarHabilidade(Personagem inimigo) {
        if (this.mana >= 2) {
            this.mana -= 2;
            int dano = (this.forca * 2) + Dados.rolar(1, 6);
            inimigo.vida -= dano;
            return nome + " lança uma MAGIA poderosa e causa " + dano + " de dano!";
        } else {
            return nome + " não tem mana suficiente!";
        }
    }
}
