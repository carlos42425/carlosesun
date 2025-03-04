package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.empleado;
import com.example.demo.modelo.nominas;
import com.example.demo.repositorio.empleadosrepositorios;
import com.example.demo.repositorio.nominarepositorio;

@RestController
@RequestMapping("/ver/nomina")
public class nominacontrolador {

	    @Autowired
	    private nominarepositorio repositorioN;
	    
	    @Autowired
	    private empleadosrepositorios repositorioE;

	    @GetMapping("/listaN")
	    public List<nominas> listarnominas() {
	        return repositorioN.findAll();
	    }
	    
	    @GetMapping("/guardarE")
	    public List<nominas> guardarNomina() {
	    	
	    	empleado emplea = this.repositorioE.findById((long) 1058198154).get(); 
	    	
	        nominas empleado = new nominas(1,1354646, 1399, 100, 12000,12355, "12/12/2024", emplea);
	        this.repositorioN.save(empleado);
	        return this.repositorioN.findAll();
	        //asdfghjkl
	        //alejo por charllotte
	    }
}

