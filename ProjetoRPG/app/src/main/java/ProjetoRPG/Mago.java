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
    
    public Mago(String nome) {
        super(nome, 0, 0, 0, 0);
        this.vida = rolarDados(3, 6);
        this.forca = rolarDados(1, 6);
        this.agilidade = rolarDados(1, 6);
        this.mana = rolarDados(1, 6) + 3; // RN16
    }

    @Override
    public void usarHabilidade(Personagem inimigo) {
        if (this.mana >= 2) {
            this.mana -= 2;
            int dano = (this.forca * 2) + rolarDados(1, 6);
            inimigo.vida -= dano;
            System.out.println(nome + " lança uma magia poderosa e causa " + dano + " de dano!");
        } else {
            System.out.println("Mana insuficiente!");
        }
    }
}
