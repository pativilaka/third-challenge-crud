package com.vilaka.crudclient.repository;

import com.vilaka.crudclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
