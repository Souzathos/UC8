/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

import java.util.ArrayList;
import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;


public class Mercado {
    
    // Pao pao = new Pao("Pullman", 11.99)
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList();
        System.out.println("=== Bem vindo(a) ao nosso mercado! ===");
        Scanner sc = new Scanner(System.in);
        
        boolean controlador = true;
        while(controlador){
        System.out.println("1 - comprar \n2 - sair \nEscolha uma opção :");
        String opcao;
        opcao = sc.nextLine();
        switch(opcao){ 
            case "1": 
                int quantidade;
                double preco;
                String marca;
                String validade;
                String tamanho;
                boolean controlador2 = true;
                double somaTotal = 0;
                
                while(controlador2){
                     System.out.println("Qual produto deseja adicionar? \n1 - Pão \n2 - Refrigerante \n3 - Frutas \n4 - Finalizar compra " );
                    int opcaoProduto = sc.nextInt();
                    
                    switch(opcaoProduto){
                        case 1:
                            sc.nextLine();
                            System.out.println("Digite a marca do produto: ");
                            marca = sc.nextLine();
                            System.out.println("Digite a validade do produto: ");
                            validade = sc.nextLine();
                            System.out.println("Digite o preço do produto:");
                            preco = sc.nextDouble();
                            System.out.println("Digite a quantidade que você irá comprar: ");
                            quantidade = sc.nextInt();
                            Pao pao = new Pao(validade, marca, preco, quantidade);
                            carrinho.add(pao);
                            System.out.println(marca + " adicionado ao carrinho com sucesso! \nValor final dos produtos: " + (preco * quantidade));
                            somaTotal += (preco*quantidade);
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.println("Digite a marca do refrigerante: ");
                            marca = sc.nextLine();
                            System.out.println("Digite o tamanho do refrigerante: ");
                            tamanho = sc.nextLine();
                            System.out.println("Digite o preço do produto:");
                            preco = sc.nextDouble();
                            System.out.println("Digite a quantidade que você irá comprar: ");
                            quantidade = sc.nextInt();
                            Refrigerante refri = new Refrigerante(marca, tamanho, preco, quantidade);                          
                            carrinho.add(refri);
                            System.out.println(marca + " adicionado ao carrinho com sucesso! \nValor final dos produtos: " + (preco * quantidade));
                            somaTotal += (preco*quantidade);
                            break;
                        
                        case 3: 
                            sc.nextLine();
                            System.out.println("Digite qual fruta você deseja: ");
                            marca = sc.nextLine();
                            System.out.println("Digite a validade do produto: ");
                            validade = sc.nextLine();
                            System.out.println("Digite o preço do produto:");
                            preco = sc.nextDouble();
                            System.out.println("Digite a quantidade que você irá comprar: ");
                            quantidade = sc.nextInt();
                            Frutas fruta = new Frutas(validade, marca, preco, quantidade);
                            carrinho.add(fruta);
                            System.out.println(marca + " adicionado ao carrinho com sucesso! \nValor final dos produtos: " + (preco * quantidade));
                            somaTotal += (preco*quantidade);
                            break;
                            
                        case 4:
                            System.out.println("Compra finalizada!");
                            
                            controlador2 = false;
                            break;
                        
                        default: 
                            System.out.println("Opção inválida...");
                            break;
                    }   
                    
                }
                String itens = "";
                for(int i = 0; i < carrinho.size(); i++){
                    // 1 - Nome
                    itens += "\n" + (i + 1) + " - " + carrinho.get(i).quantidade + " " + carrinho.get(i).marca;
                         
                }
                System.out.println("Suas compras foram:  " + itens);  
                System.out.println("Valor total do carrinho: " + somaTotal);
               
                break;
                    
            case "2":
                System.out.println("Obrigado! volte sempre");
                System.out.println("Saindo...");               
                controlador = false;
                break;
                
            default: 
                System.out.println("Opção inválida...");
                break;
            }
           
        }
        
    }
}
