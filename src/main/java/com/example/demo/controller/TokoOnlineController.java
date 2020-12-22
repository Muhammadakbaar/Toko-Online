package com.example.demo.controller;

import com.example.demo.repository.TokoOnlineRepository;
import com.example.demo.model.TokoOnline;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tokoonline")
public class TokoOnlineController {

    @Autowired
    public TokoOnlineRepository tokoOnlineRepository;

    @GetMapping(path = "/tampil")
    public List<TokoOnline> getPembelian() {
        return tokoOnlineRepository.findAll();
    }
    @PostMapping(path = "/tambah")
    public @ResponseBody TokoOnline addTokoOnline(@RequestBody  TokoOnline tokoOnline){
        return tokoOnlineRepository.save(tokoOnline);
    }
}
