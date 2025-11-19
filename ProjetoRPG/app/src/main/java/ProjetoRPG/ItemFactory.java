/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoRPG;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class ItemFactory {
     public static Item gerarItemAleatorio() {

        int sorte = (int)(Math.random() * 4);  // 0 a 3

        switch (sorte) {
            case 0:
                return new Item(
                    "Poção de Cura",
                    Dados.rolar(2, 6),  // cura 2d6
                    0,
                    0,
                    0
                );

            case 1:
                return new Item(
                    "Poção de Mana",
                    0,
                    Dados.rolar(2, 4), // mana 2d4
                    0,
                    0
                );

            case 2:
                return new Item(
                    "Poção de Força",
                    0,
                    0,
                    Dados.rolar(1, 4), // buff de 1d4
                    0
                );

            case 3:
                return new Item(
                    "Poção de Veneno",
                    0,
                    0,
                    0,
                    Dados.rolar(1, 6) // tira força do inimigo
                );
        }

        return null; 
    }
}
