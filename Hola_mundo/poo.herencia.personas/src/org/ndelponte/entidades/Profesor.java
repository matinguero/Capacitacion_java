package org.ndelponte.entidades;


	public class Profesor extends Persona{  
	    @Override
		public String saludar() {
			// TODO Auto-generated method stub
			return super.saludar() + " soy un profesor de " + this.asignatura;
		}
		private String asignatura;  
	    public String getAsignatura() {  
	        return asignatura;  
	    }  
	    public void setAsignatura(String asignatura) {  
	        this.asignatura = asignatura;  
	    }  
	    public Profesor(String asignatura) {  
	        super();  
	        this.asignatura = asignatura;  
	        System.out.println("Creando el profesor!");  
	    }
		public Profesor() {
		  
			System.out.println("Profesor: Inicializando constructor....");  
		
			
		}  
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}
	
	
	
	

