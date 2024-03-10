package ruijosecj.crudclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ruijosecj.crudclientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
