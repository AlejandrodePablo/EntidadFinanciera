package Programacion.EntidadFinanciera.domain.models;

public class Movements {
	private int NºCuenta;
	private Customer customer;
	private Movements movements;
	private String ProductoContratado;
	private int saldo;
	
	public Integer getNºCuenta() {
		return NºCuenta;
	}
	
	public void setNºCuenta(Integer nºCuenta) {
        NºCuenta = nºCuenta;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movements getMovements() {
        return movements;
    }

    public void setMovements(Movements movements) {
        this.movements = movements;
    }

    public String getProductoContratado() {
        return ProductoContratado;
    }

    public void setProductoContrtado(String productoContrtado) {
        ProductoContratado = productoContrtado;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}

