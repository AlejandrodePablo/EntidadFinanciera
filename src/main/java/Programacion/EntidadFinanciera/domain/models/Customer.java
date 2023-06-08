package Programacion.EntidadFinanciera.domain.models;

public class Customer extends People {
	    private String direccion;
	    private String poblacion;
	    private Integer CP;

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getPoblacion() {
	        return poblacion;
	    }

	    public void setPoblacion(String poblacion) {
	        this.poblacion = poblacion;
	    }

	    public Integer getCP() {
	        return CP;
	    }

	    public void setCP(Integer CP) {
	        this.CP = CP;
	    }
	}

