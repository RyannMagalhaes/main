package com.trabalho.redis;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImovelRepository extends MongoRepository<Imovel, String> {
}