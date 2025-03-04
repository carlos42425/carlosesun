package com.example.demo.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.nominas;

public interface nominarepositorio extends JpaRepository<nominas, Long>  {
	

}
