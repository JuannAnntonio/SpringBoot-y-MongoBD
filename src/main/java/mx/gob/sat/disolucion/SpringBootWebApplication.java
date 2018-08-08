package mx.gob.sat.disolucion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.gob.sat.disolucion.model.User;
import mx.gob.sat.disolucion.repository.UserRepository;

@SpringBootApplication
public class SpringBootWebApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (User obj : userRepo.busquedaXEdad(26)) {
			System.out.println(obj.getNombre());
		}
		for (User obj : userRepo.findAll()) {
			System.out.println(obj.getNombre());
		}
	}

}
