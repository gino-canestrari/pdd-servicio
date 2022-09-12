
package com.app;

import com.app.services.UsuarioServiceImpl;

public class App {
  public static void main(String[] args) {

    UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();

    usuarioService.agregar("Fulano", "Detal", "fdetal@gmail.com", "CEO");
    usuarioService.agregar("Mengano", "Detal", "mdetal@gmail.com", "Gerente");

    System.out.println("\n[AGREGAR]");
    usuarioService.listar();

    usuarioService.modificar(1, "Mengano", "Detal", "mdetal@gmail.com", "Gerente");

    System.out.println("\n[MODIFICAR]");
    usuarioService.listar();

    usuarioService.eliminar(0);

    System.out.println("\n[ELIMINAR]");
    usuarioService.listar();

  }
}
