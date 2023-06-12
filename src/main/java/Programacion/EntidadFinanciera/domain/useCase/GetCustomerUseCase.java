package Programacion.EntidadFinanciera.domain.useCase;

import Programacion.EntidadFinanciera.domain.models.Customer;
import Programacion.EntidadFinanciera.domain.useCase.AddCustomerUseCase;


public class GetCustomerUseCase {
	 private CustomerRepository CustomerRepository;

	    public GetCustomerUseCase(CustomerRepository CustomerRepository){
	        this.CustomerRepository=CustomerRepository;
	    }

	    public Customer execute(String codigoCustomer){
	        return CustomerRepository.findById(codigoCustomer);
	    }
}
