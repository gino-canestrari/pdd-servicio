package com.app.services;

import java.util.ArrayList;
import java.util.Date;

import com.app.models.Documento;

public class DocumentoServiceImpl implements DocumentoService {

  private ArrayList<Documento> listaDeDocumentos = new ArrayList<>();

  @Override
  public void listar() {
    if (!listaDeDocumentos.isEmpty()) {
      listaDeDocumentos.forEach((documento) -> {
        System.out.println("----------------------------");
        System.out.format("Indice: %1$s\n", listaDeDocumentos.indexOf(documento));
        System.out.format("Nombre: %1$s\n", documento.getNombre());
        System.out.format("Descripcion: %1$s\n", documento.getDescripcion());
        System.out.format("Emisor: %1$s\n", documento.getEmisor());
        System.out.format("Fecha: %1$s\n", documento.getFecha().toString());
        System.out.println("----------------------------");
      });
    }
  }

  @Override
  public void agregar(String nombre, String descripcion, String emisor, Date fecha) {
    if (!nombre.isEmpty() || !descripcion.isEmpty() || !emisor.isEmpty() || fecha != null) {
      listaDeDocumentos.add(new Documento(nombre, descripcion, emisor, fecha));
    }
  }

  @Override
  public void modificar(int indice, String nombre, String descripcion, String emisor, Date fecha) {
    if (!nombre.isEmpty() || !descripcion.isEmpty() || !emisor.isEmpty() || fecha != null) {
      listaDeDocumentos.set(indice, new Documento(nombre, descripcion, emisor, fecha));
    }
  }

  @Override
  public void eliminar(int indice) {
    listaDeDocumentos.remove(indice);
  }

}
