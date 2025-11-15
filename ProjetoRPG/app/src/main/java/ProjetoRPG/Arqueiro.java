/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Arqueiro extends Personagem{
    
     public Arqueiro(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }


    public String usarHabilidade(Personagem inimigo) {
        if (this.mana >= 2) {
            this.mana -= 2;
            this.bonusTemporarioDeAcerto = 50; // RN19
            return nome + " prepara um TIRO PRECISO! (+50% de acerto no próximo ataque)";
        } else {
            return nome + " não tem mana suficiente!";
        }
    }
}
