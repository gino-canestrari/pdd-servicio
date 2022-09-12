package com.app.services;

import java.util.ArrayList;

import com.app.models.Etiqueta;

public class EtiquetaServiceImpl implements EtiquetaService {

  private ArrayList<Etiqueta> listaDeEtiquetas = new ArrayList<>();

  @Override
  public void listar() {
    if (!listaDeEtiquetas.isEmpty()) {
      listaDeEtiquetas.forEach((etiqueta) -> {
        System.out.println("----------------------------");
        System.out.format("Indice: %1$s\n", listaDeEtiquetas.indexOf(etiqueta));
        System.out.format("Nombre: %1$s\n", etiqueta.getNombre());
        System.out.format("Descripcion: %1$s\n", etiqueta.getDescripcion());
        System.out.println("----------------------------");
      });
    }
  }

  @Override
  public void agregar(String nombre, String descripcion) {
    if (!nombre.isEmpty() || !descripcion.isEmpty()) {
      listaDeEtiquetas.add(new Etiqueta(nombre, descripcion));
    }
  }

  @Override
  public void modificar(int indice, String nombre, String descripcion) {
    if (!nombre.isEmpty() || !descripcion.isEmpty()) {
      listaDeEtiquetas.set(indice, new Etiqueta(nombre, descripcion));
    }
  }

  @Override
  public void eliminar(int indice) {
    listaDeEtiquetas.remove(indice);
  }

}
