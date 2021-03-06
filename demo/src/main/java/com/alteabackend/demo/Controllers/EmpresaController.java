package com.alteabackend.demo.Controllers;

import com.alteabackend.demo.Models.Empresa;
import com.alteabackend.demo.Repositories.EmpresaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class EmpresaController {
    @Autowired
    EmpresaRepository empresaRepository;

    @GetMapping("/empresas")
    public List<Empresa> getAllEmpresas(){
        return empresaRepository.getAllEmpresa();
    }

    @GetMapping("/empresas/{id}")
    public Empresa getEmpresa(@PathVariable(value="id") Long id){
        return empresaRepository.getEmpresa(id);
    }

    @PostMapping("/empresas")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaRepository.createEmpresa(empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public ResponseEntity<Empresa> deleteEmpresa(@PathVariable (value = "id") Long id){
        empresaRepository.deleteEmpresa(id);
        return ResponseEntity.ok().build();
    }
}