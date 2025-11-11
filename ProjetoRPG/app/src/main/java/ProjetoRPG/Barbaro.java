/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Barbaro extends Personagem{
    
    public Barbaro(String nome) {
         super(nome, 0, 0, 0, 0);
         this.vida = rolarDados(3, 6);
         this.mana = rolarDados(1, 6);
         this.forca = rolarDados(1, 6) + 2; // RN14
         this.agilidade = rolarDados(1, 6);
     }

     @Override
     public void usarHabilidade(Personagem inimigo) {
         if (this.mana >= 1) {
             this.mana -= 1;
             int dano = (int) ((this.forca + rolarDados(1, 6)) * 1.5);
             inimigo.vida -= dano;
             System.out.println(nome + " entra em FÚRIA e causa " + dano + " de dano!");
         } else {
             System.out.println("Mana insuficiente!");
         }
     }
     
    
}
