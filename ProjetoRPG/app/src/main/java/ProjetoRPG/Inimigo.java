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
    
     public Inimigo(String nome) {
        super(nome,
              Dados.rolar(5, 20),   // vida
              Dados.rolar(4, 20),   // mana
              Dados.rolar(3, 20),   // forca
              Dados.rolar(2, 20));  // agilidade
    }

    
    public String usarHabilidade(Personagem inimigo) {
        return nome + " não possui habilidades especiais.";
    }
}
