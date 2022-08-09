package banco.dio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import banco.dio.model.ClienteModel;
import banco.dio.repository.ClienteRepository;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	private final ClienteRepository repository;
	
	public ClienteController(ClienteRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/listarTodos")
	public ResponseEntity<List<ClienteModel>> listarTodos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente){
		return ResponseEntity.ok(repository.save(cliente));
	}
}
