package co.edu.umanizales.usuarios.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.umanizales.usuarios.model.Administrador;
import co.edu.umanizales.usuarios.model.UsuarioEstandar;
import co.edu.umanizales.usuarios.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    // Inyección de dependencias del servicio
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/admin")
    public ResponseEntity<Administrador> crearAdministrador(@RequestBody Administrador admin) {
        Administrador nuevoAdmin = usuarioService.crearAdministrador(admin);
        return new ResponseEntity<>(nuevoAdmin, HttpStatus.CREATED);
    }

    @PostMapping("/estandar")
    public ResponseEntity<UsuarioEstandar> crearUsuarioEstandar(@RequestBody UsuarioEstandar usuario) {
        UsuarioEstandar nuevoUsuario = usuarioService.crearUsuarioEstandar(usuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }
}
