/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class BatalhaMetodos {
    
    private Personagem jogador;
    private Personagem inimigo;

    public BatalhaMetodos(Personagem jogador, Personagem inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public Personagem getJogador() { return jogador; }
    public Personagem getInimigo() { return inimigo; }
    
    
    public String jogadorAtaca() {
    // jogador ataca o inimigo
    String resultado = jogador.atacar(inimigo);

    // adiciona vida atual do inimigo
    resultado += " " + inimigo.getNome() + " tem " + inimigo.getVida() + " de vida";

    // se morreu
    if (inimigo.getVida() <= 0) {
        resultado += ". " + inimigo.getNome() + " foi derrotado!";
    }

    return resultado;
}
    
    public String jogadorUsaHabilidade() {
    jogador.usarHabilidade(inimigo);

    String msg = "Habilidade usada! " 
                + inimigo.getNome() + " tem " + inimigo.getVida() + " de vida";

    if (inimigo.getVida() <= 0) {
        msg += ". " + inimigo.getNome() + " foi derrotado!";
    }

    return msg;
    }
}
    