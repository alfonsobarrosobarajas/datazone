package com.datazone.services;

import com.datazone.models.Kit;
import com.datazone.repository.CRUD;
import com.datazone.repository.KitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitService extends CRUD<Kit, KitRepository> {

    public KitService(KitRepository repository) {
        super(repository);
    }

    @Override
    public List<Kit> list() {
        return repository.findAll();
    }

    @Override
    public Kit get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Kit o) {
        repository.save(o);
    }

    @Override
    public void update(Kit o, int id) {

        o.setId(id);
        repository.save(o);
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }
}
