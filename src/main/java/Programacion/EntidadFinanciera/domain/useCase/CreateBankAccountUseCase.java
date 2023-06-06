package Programacion.EntidadFinanciera.domain.useCase;

import Programacion.EntidadFinanciera.domain.models.BankAccount;

public class CreateBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;

    public CreateBankAccountUseCase(BankAccountRepository bankAccountRepository){
        this.bankAccountRepository=bankAccountRepository;
    }
    public void execute(BankAccount bankAccount){
        bankAccountRepository.save(bankAccount);
    }
}
