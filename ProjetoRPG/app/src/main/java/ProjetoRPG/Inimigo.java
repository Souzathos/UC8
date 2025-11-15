/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Inimigo extends Personagem{
    
    public Inimigo(String nome, int vida, int mana, int forca, int agilidade) {
        super(nome, vida, mana, forca, agilidade);
    }

    
    public String usarHabilidade(Personagem inimigo) {
        return nome + " não possui habilidades especiais.";
    }
}
