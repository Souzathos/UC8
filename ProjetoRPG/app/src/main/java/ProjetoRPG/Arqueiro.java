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
    
     public Arqueiro(String nome) {
        super(nome, 0, 0, 0, 0);
        this.vida = rolarDados(3, 6);
        this.mana = rolarDados(1, 6);
        this.forca = rolarDados(1, 6);
        this.agilidade = rolarDados(1, 6) + 3; // RN18
    }


    public String usarHabilidade(Personagem inimigo) {
        if (this.mana >= 2) {
            this.mana -= 2;
            this.bonusTemporarioDeAcerto = 50; // RN19
            return nome + " prepara um TIRO PRECISO! (Próximo ataque com +50% de acerto)";
        } else {
            return nome + " não tem mana suficiente!";
        }
    }
}
