package co.edu.umanizales.usuarios.service;

import org.springframework.stereotype.Service;
import co.edu.umanizales.usuarios.model.Administrador;
import co.edu.umanizales.usuarios.model.UsuarioEstandar;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public Administrador crearAdministrador(Administrador admin) {
        // Lógica para crear un administrador (puedes implementar lógica de base de datos aquí)
        System.out.println("Creando Administrador: " + admin.getNombre());
        return admin;
    }

    @Override
    public UsuarioEstandar crearUsuarioEstandar(UsuarioEstandar usuario) {
        // Lógica para crear un usuario estándar (puedes implementar lógica de base de datos aquí)
        System.out.println("Creando Usuario Estándar: " + usuario.getNombre());
        return usuario;
    }
}
