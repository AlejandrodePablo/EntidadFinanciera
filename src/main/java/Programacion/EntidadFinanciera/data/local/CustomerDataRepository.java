package Programacion.EntidadFinanciera.data.local;

import Programacion.EntidadFinanciera.domain.*;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDataRepository {

	  private CustomerFileDataSource CustomerFileDataSource;
	    private Conexion conexion;
	    public CustomerDataRepository(CustomerFileDataSource CustomerFileDataSource){
	        this.CustomerFileDataSource=CustomerFileDataSource;
	    }

	    @Override
	    public void save(Customer Customer) throws SQLException {

	        String consulta="INSERT INTO Customer(id, direccion, poblacion, codigoPostal, dni, nombre, apellidos,  VALUES(?, ?, ?, ?, ?)";
	        PreparedStatement statement = conexion.prepareStatementFunction(consulta);
	        statement.setString(1, Customer.getId());
	        statement.setString(2, Customer.getdireccion());
	        statement.setObject(3, Customer.getpoblacion());
	        statement.setObject(4, Customer.getcodigoPostal());
	        statement.setObject(5, Customer.getdni());
	        statement.setObject(6, Customer.getnombre());
	        statement.setObject(7, Customer.getapellidos());
	        statement.executeUpdate();
	        statement.close();
	    }
	
	
	
}
