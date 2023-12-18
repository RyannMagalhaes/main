package com.trabalho.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService service;

    @PostMapping
    public Imovel create(@RequestBody Imovel imovel) {
        return service.create(imovel);
    }

    @GetMapping
    public List<Imovel> readAll() {
        return service.readAll();
    }

    @PutMapping("/{id}")
    public Imovel update(@PathVariable String id, @RequestBody Imovel imovel) {
        return service.update(id, imovel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}