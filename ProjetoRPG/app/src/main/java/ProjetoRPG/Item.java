/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Item {
    private String nome;
    private int vidaCurada;
    private int manaCurada;
    private int buffForca;
    private int nerfarInimigo;

    public Item(String nome, int vidaCurada, int manaCurada, int buffForca, int nerfarInimigo) {
        this.nome = nome;
        this.vidaCurada = vidaCurada;
        this.manaCurada = manaCurada;
        this.buffForca = buffForca;
        this.nerfarInimigo = nerfarInimigo;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaCurada() {
        return vidaCurada;
    }

    public int getManaCurada() {
        return manaCurada;
    }

    public int getBuffForca() {
        return buffForca;
    }

    public int getNerfarInimigo() {
        return nerfarInimigo;
    }
}
