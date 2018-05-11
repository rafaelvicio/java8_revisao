package java8_revisao;

import java.util.Arrays;
import java.util.List;

public class Capitulo2 {
	
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Rafael Augusto", 150);
		Usuario usuario2 = new Usuario("Maria Isabel", 120);
		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);
		
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		for(Usuario usuario: usuarios) {
			System.out.println(usuario.getNome());
		}
	}

}
