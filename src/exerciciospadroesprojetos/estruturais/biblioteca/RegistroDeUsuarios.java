package exerciciospadroesprojetos.estruturais.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class RegistroDeUsuarios {
    private Map<String, String> usuarios = new HashMap<>();

    public void registrarUsuario(String nome) {
        usuarios.put(nome, nome);
        System.out.println("Usuário registrado: " + nome);
    }

    public boolean usuarioExiste(String nome) {
        return usuarios.containsKey(nome);
    }
}