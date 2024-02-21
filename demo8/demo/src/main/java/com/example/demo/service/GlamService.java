package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Glam;
import com.example.demo.repository.GlamRepo;
import java.util.List;
import java.util.Optional;

@Service
public class GlamService {
    @Autowired GlamRepo repo;
    public Glam post(Glam g){
        return repo.save(g);
    }
    public List<Glam> get(){
        return repo.findAll();
    }
    public Optional<Glam> getByid(int id){
        return repo.findById(id);
    }
    public String delete(int id){
        repo.deleteById(id);
        return "deleted";
    }
    public Glam put(int id,Glam gl){
        Glam g=repo.findById(id).orElse(null);
        if(g!=null){
            g.setId(gl.getId());
            g.setCosmeticname(gl.getCosmeticname());
            g.setCosmeticBrand(gl.getCosmeticBrand());
            g.setCosmeticPrice(gl.getCosmeticPrice());
            return repo.saveAndFlush(g);
        }
        else{
            return null;
}
}
}