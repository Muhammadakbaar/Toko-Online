package com.example.demo.repository;

import com.example.demo.model.TokoOnline;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface TokoOnlineRepository extends JpaRepository<TokoOnline, Integer>{

}
