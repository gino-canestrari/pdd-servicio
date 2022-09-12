
package com.app.services;

public interface UsuarioService {

  public void listar();

  public void agregar(String nombre, String apellido, String email, String puesto);

  public void modificar(int indice, String nombre, String apellido, String email, String puesto);

  public void eliminar(int indice);

}
