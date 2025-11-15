/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Dados {
     // Rola N dados de X lados e soma o resultado
    public static int rolar(int quantidade, int lados) {
        int total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += (int)(Math.random() * lados) + 1;
        }
        return total;
    }
}
