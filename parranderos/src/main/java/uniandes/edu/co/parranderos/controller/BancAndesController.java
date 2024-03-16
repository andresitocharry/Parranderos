package uniandes.edu.co.parranderos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uniandes.edu.co.parranderos.modelo.Usuario;
import uniandes.edu.co.parranderos.repositorio.UsuarioRepository;

@Controller
public class BancAndesController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @PostMapping("/login")
    public String login(@RequestParam("login") String login,
                    @RequestParam("clave") String clave,
                    @RequestParam("rol") String role,
                    Model model){
        
        // Buscar el usuario en la base de datos por login y contraseña
        
        Usuario usuario = usuarioRepository.encontrarUsuarioConCredenciales(login,clave);
        System.out.println(login);
        System.out.println(clave);
        System.out.println(role);
        System.out.println();
        //si la contraseña o el login no eexisten, la consulta da null entonces vemos que el resultado sea disntinto de null y que el usuario haya puesto bien su rol
        if (usuario != null && usuario.getRol().equals(role)) {
            // Autenticar al usuario almacenando su información en la sesión
            model.addAttribute("usuario",usuario);
            
            return "redirect:/home"; // Redirigir a la página de inicio
        } else {

            // Si el usuario no existe o los datos son incorrectos, mostrar un mensaje de error
            return "redirect:/error";
        }
    }

    @GetMapping("home")
    public String home(Model model) {
        // Obtener el nombre de usuario
        Usuario user = (Usuario) model.getAttribute("usuario");
        String nombreUsuario = user.getNombre();
        
        // Pasar el nombre de usuario como atributo
        model.addAttribute("nombreUsuario", nombreUsuario);
        
        // Devolver la vista home.jsp
        return "home";
    }
    

}