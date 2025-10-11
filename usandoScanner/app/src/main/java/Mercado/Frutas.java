/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Frutas extends Produto{
    String validade;

    public Frutas(String marca, String validade , double preco, int quantidade) {
        super(marca, preco, quantidade);
        this.validade = validade;
    }
    
    
}
