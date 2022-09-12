package com.app.services;

import java.util.Date;

public interface DocumentoService {

  public void listar();

  public void agregar(String nombre, String descripcion, String emisor, Date fecha);

  public void modificar(int indice, String nombre, String descripcion, String emisor, Date fecha);

  public void eliminar(int indice);

}
