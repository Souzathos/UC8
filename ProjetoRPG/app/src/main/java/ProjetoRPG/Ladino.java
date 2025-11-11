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
    
    public Ladino(String nome) {
        super(nome, 0, 0, 0, 0);
        this.vida = rolarDados(3, 6);
        this.forca = rolarDados(1, 6);
        this.agilidade = rolarDados(1, 6) + 4; // RN20
        this.mana = rolarDados(1, 6);
    }

    @Override
    public void usarHabilidade(Personagem inimigo) {
        double sorte = Math.random() * 100;

        if (sorte <= 70) {
            System.out.println(nome + " usa EVASÃO e escapa do combate!");
            inimigo.vida = 0; // encerra o combate
        } else {
            int dano = (forca + rolarDados(1, 6)) / 2;
            inimigo.vida -= dano;
            System.out.println(nome + " contra-ataca e causa " + dano + " de dano!");
        }
    }
}
