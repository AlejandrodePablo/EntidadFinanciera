package Programacion.EntidadFinanciera.domain.useCase;

import Programacion.EntidadFinanciera.domain.models.Customer;
import Programacion.EntidadFinanciera.domain.useCase.AddCustomerUseCase;

public class AddCustomerUseCase {

	private CustomerRepository CustomerRepository;

    public AddCustomerUseCase(CustomerRepository CustomerRepository){
        this.CustomerRepository=CustomerRepository;
    }

    public void execute(Customer Customer){
    	CustomerRepository.save(Customer);
    }
	
}
