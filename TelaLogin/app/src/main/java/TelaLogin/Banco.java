/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaLogin;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ATHOSFELIPENASCIMENT
 */
public class Banco {
    //Lista que simula banco de dados
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    // Método para adicionar um usuario
    public static void adicionarUsuario(Usuario usuario) {
     usuarios.add(usuario);
    }
    
    //Método para retornar os usuarios
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    // Método para buscar usuário pelo email e senha
    public static Usuario autenticar(String email, char[] senha) {
        for(Usuario user : usuarios) {
           if(user.getEmail().equals(email) && Arrays.equals(user.getSenha(), senha)) {
               return user;
           }
        }
        return null;
    }
    
    // Atualizar dados de um usuário
    public static boolean atualizarUsuario(String emailAntigo, String novoNome, String novoEmail, char[] novaSenha) {
        for(Usuario user : usuarios){
        if(user.getEmail().equals(emailAntigo)) {
                user.setNome(novoNome);
                user.setEmail(novoEmail);
                user.setSenha(novaSenha);
                return true;
            }
        }
        return false;
    }
    
    
    // Remover usuário
    public static boolean deletarUsuario(String email) {
        for(Usuario user : usuarios ) {
            if(user.getEmail().equals(email)) {
                usuarios.remove(user);
                return true;
            }
        }
        return false;
    }

}
