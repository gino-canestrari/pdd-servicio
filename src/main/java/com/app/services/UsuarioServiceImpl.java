package com.app.services;

import java.util.ArrayList;

import com.app.models.Usuario;

public class UsuarioServiceImpl implements UsuarioService {

  private ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();

  @Override
  public void listar() {
    if (!listaDeUsuarios.isEmpty()) {
      listaDeUsuarios.forEach((usuario) -> {
        System.out.println("----------------------------");
        System.out.format("Indice: %1$s\n", listaDeUsuarios.indexOf(usuario));
        System.out.format("Nombre: %1$s\n", usuario.getNombre());
        System.out.format("Apellido: %1$s\n", usuario.getApellido());
        System.out.format("Email: %1$s\n", usuario.getEmail());
        System.out.format("Puesto: %1$s\n", usuario.getPuesto());
        System.out.println("----------------------------");
      });
    }
  }

  @Override
  public void agregar(String nombre, String apellido, String email, String puesto) {
    if (!nombre.isEmpty() || !apellido.isEmpty() || !email.isEmpty() || !puesto.isEmpty()) {
      listaDeUsuarios.add(new Usuario(nombre, apellido, email, puesto));
    }
  }

  @Override
  public void modificar(int indice, String nombre, String apellido, String email, String puesto) {
    if (!nombre.isEmpty() || !apellido.isEmpty() || !email.isEmpty() || !puesto.isEmpty()) {
      listaDeUsuarios.set(indice, new Usuario(nombre, apellido, email, puesto));
    }
  }

  @Override
  public void eliminar(int indice) {
    listaDeUsuarios.remove(indice);
  }

}
