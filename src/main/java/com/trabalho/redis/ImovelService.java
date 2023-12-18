package com.trabalho.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;

    public Imovel create(Imovel imovel) {
        return repository.save(imovel);
    }

    @Cacheable(value = "imoveis")
    public List<Imovel> readAll() {
        return repository.findAll();
    }

    public Imovel update(String id, Imovel imovel) {
        Optional<Imovel> optionalImovel = repository.findById(id);
        if (optionalImovel.isPresent()) {
            Imovel existingImovel = optionalImovel.get();
            existingImovel.setEndereco(imovel.getEndereco());
            existingImovel.setTipoImovel(imovel.getTipoImovel());
            existingImovel.setArea(imovel.getArea());
            existingImovel.setPreco(imovel.getPreco());
            return repository.save(existingImovel);
        } else {
            return null;
        }
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}