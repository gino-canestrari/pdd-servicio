
package com.app.services;

public interface EtiquetaService {

  public void listar();

  public void agregar(String nombre, String descripcion);

  public void modificar(int indice, String nombre, String descripcion);

  public void eliminar(int indice);

}
