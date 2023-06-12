package Programacion.EntidadFinanciera.domain.useCase;

import Programacion.EntidadFinanciera.domain.models.Customer;

public interface CustomerRepository {
	
	public void save(Customer Customer);

    public Customer findById(String codigoPostal);

    public void delete(String codigoPostal);
}

