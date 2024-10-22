package co.edu.umanizales.usuarios.service;

import co.edu.umanizales.usuarios.model.Administrador;
import co.edu.umanizales.usuarios.model.UsuarioEstandar;

public interface UsuarioService {
    Administrador crearAdministrador(Administrador admin);
    UsuarioEstandar crearUsuarioEstandar(UsuarioEstandar usuario);
}
