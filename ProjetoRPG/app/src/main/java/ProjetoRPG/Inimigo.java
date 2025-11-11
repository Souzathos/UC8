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
        super(nome, 0, 0, 0, 0);
        this.vida = rolarDados(2, 6);
        this.forca = rolarDados(1, 6);
        this.agilidade = rolarDados(1, 6);
        this.mana = 0;
    }

    @Override
    public void usarHabilidade(Personagem inimigo) {
        // inimigo genérico não tem habilidade
    }
}
