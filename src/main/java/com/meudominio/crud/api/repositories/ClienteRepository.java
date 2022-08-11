package com.meudominio.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meudominio.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
