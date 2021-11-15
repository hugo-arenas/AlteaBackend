package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.Usuario;

public interface UsuarioRepository {
    public int countUsuario();
    public List<Usuario> getAllUsuario();
    public Usuario createUsuario(Usuario usuario);
    public boolean deleteUsuario(long id);
    public Usuario getUsuario(long id);
    public boolean updateUsuario(Usuario nuevoUsuario);
    public Usuario getUserByToken(String token);
    public Usuario logIn(Usuario user);
    public String logOut(Usuario user);
}
