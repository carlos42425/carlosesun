package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

import com.example.demo.modelo.empleado; // 
import com.example.demo.repositorio.empleadosrepositorios; 

import java.util.List; 

@RestController 
@RequestMapping("/ver/e1/") 
public class empleadocontrolador {

    @Autowired 
    private empleadosrepositorios repositorio; 

    @GetMapping("/ListaE") 
    public List<empleado> verTodosEmpleados(){ 
        return repositorio.findAll(); 
    }
    
    @GetMapping("/{id}")
	public empleado obtenerEmpleadoPorId(@PathVariable Long id) {
	    return repositorio.findById(id).orElse(null);
	}
	
	@GetMapping("/guardar")
	public empleado guardarEmpleado () {
		empleado e = new empleado(123456789L, "Carlos", "Fernandez", "cf225213@gmail.com");
	    return repositorio.save(e);

	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarEmpleado(@PathVariable Long id) {
	    repositorio.deleteById(id);
	    return "empleado de id " + id + " fue eliminado";
	}

	@GetMapping("/actualizar/{id}")
	public String actualizarEmpleado(@PathVariable Long id) {
		empleado e = repositorio.findById(id).get();
		
		e.setApellido("rodriguez");
		repositorio.save(e);
		return "empleado de id "+id + "Se le cambió el apellido";
	}
	@GetMapping("/buscarPorEmail")
	public empleado buscarPorEmail(){
		  
	return this.repositorio.findByEmail("cf225213@gmail.com");
	    }

	  @GetMapping("/buscarporNombre")
	    public List <empleado> buscarPorNombre(){
		  
	        return this.repositorio.findBynombre("carlos");
	    }
	  @GetMapping("/buscarporApellidos")
	    public List < empleado> buscarPorApellidos(){
		  
	     return this.repositorio. findByapellido("lemus");
	    
	
	
	
		
	
	}
    
    
	
	
}
    
