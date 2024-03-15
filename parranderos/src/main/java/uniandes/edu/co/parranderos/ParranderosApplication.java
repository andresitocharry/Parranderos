package uniandes.edu.co.parranderos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uniandes.edu.co.parranderos.modelo.Bar;
import uniandes.edu.co.parranderos.modelo.Bebida;
import uniandes.edu.co.parranderos.modelo.PuntoAtencion;
import uniandes.edu.co.parranderos.modelo.Usuario;
import uniandes.edu.co.parranderos.repositorio.BarRepository;
import uniandes.edu.co.parranderos.repositorio.BebidaRepository;
import uniandes.edu.co.parranderos.repositorio.OficinaRepository;
import uniandes.edu.co.parranderos.repositorio.PuntoAtencionRepository;
import uniandes.edu.co.parranderos.repositorio.UsuarioRepository;

import org.springframework.boot.CommandLineRunner;

import java.sql.Time;
import java.util.*;

@SpringBootApplication
public class ParranderosApplication{

	public static void main(String[] args) {
		SpringApplication.run(ParranderosApplication.class, args);
	}

}
