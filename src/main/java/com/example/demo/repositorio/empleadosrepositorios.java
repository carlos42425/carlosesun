package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.modelo.empleado;

public interface empleadosrepositorios extends JpaRepository<empleado,Long> {
	public empleado findByEmail(String email);
	
	public List <empleado> findBynombre(String nombre);
	public List <empleado> findByapellido(String apellido);

	
	

}



