package uniandes.edu.co.parranderos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import uniandes.edu.co.parranderos.modelo.Usuario;
import uniandes.edu.co.parranderos.repositorio.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public String usuarios(Model model) {
        model.addAttribute("usuarios",usuarioRepository.darUsuarios() );
        
        return "usuarios";
    }

    @GetMapping("/usuarios/new")
    public String usuarioForm(Model model) {
        model.addAttribute("usuario", new Usuario() );
        return "usuarioNuevo";
    }

    @PostMapping("/usuarios/new/save")
    public String usuarioGuardar(@ModelAttribute Usuario usuario){
        usuarioRepository.insertarUsuario(usuario.getLogin(), 
                                        usuario.getClave(), 
                                        usuario.getRol(), 
                                        usuario.getNumeroidentificacion(), 
                                        usuario.getTipoidentificacion(), 
                                        usuario.getNombre(), 
                                        usuario.getNacionalidad(), 
                                        usuario.getDireccionfisica(), 
                                        usuario.getDireccionelectronica(), 
                                        usuario.getTelefono(), 
                                        usuario.getCiudad(),
                                         usuario.getDepartamento(), 
                                         usuario.getCodigopostal(),
                                          usuario.getEsempleado(),
                                           usuario.getEscliente());
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/{id}/edit")
    public String usuarioEditarForm(@PathVariable("id")int id, Model model){
        
        Usuario usuario = usuarioRepository.darUsuario(id);

        if(usuario != null){
            model.addAttribute("usuario", usuario);
            return "usuarioEditar";
        }
        else{
            return "redirect:/bares";
        }    
    
    }

    @PostMapping("/usuarios/{id}/save")
    public String usuarioEditarGuardar(@PathVariable("id") int id, @ModelAttribute Usuario usuario) {
        usuarioRepository.actualizarUsuario(
                                            id,    
                                            usuario.getLogin(), 
                                            usuario.getClave(), 
                                            usuario.getRol(), 
                                            usuario.getNumeroidentificacion(), 
                                            usuario.getTipoidentificacion(), 
                                            usuario.getNombre(), 
                                            usuario.getNacionalidad(), 
                                            usuario.getDireccionfisica(), 
                                            usuario.getDireccionelectronica(), 
                                            usuario.getTelefono(), 
                                            usuario.getCiudad(),
                                            usuario.getDepartamento(), 
                                            usuario.getCodigopostal(),
                                            usuario.getEsempleado(),
                                            usuario.getEscliente());
    return "redirect:/usuarios";

                                        }
                                        
    @GetMapping("/usuarios/{id}/delete")
    public String usuarioEliminar(@PathVariable("id") int id){
        usuarioRepository.borrarUsuario(id);
        return "redirect:/usuarios";
    }
    
    
    
    
    
}
