/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Refrigerante extends Produto{
   
    String tamanho;

    public Refrigerante(String marca, String tamanho, double preco, int quantidade) {
        super(marca, preco, quantidade);

        this.tamanho = tamanho;
    }
    
}
