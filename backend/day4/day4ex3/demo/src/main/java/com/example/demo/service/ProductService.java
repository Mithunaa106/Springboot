package com.example.demo.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    public boolean add(Product product)
    {
        try{
            rep.save(product);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    
    public List<Product> find()
    {
        return rep.findAll();
    }

    public Optional<Product> findId(int id)
    {
        return rep.findById(id);
    }
}
