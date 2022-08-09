package banco.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import banco.dio.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
	
}
