package ejercicioenclase.POO_0304;

public class CuentaBancaria {

//  aqui van los atributos

	private String nombrecliente;
    private String numerodecuenta;
    private double tipodeinteres;
    private double saldo;

    
    
//constructor por defecto o vacio
	
  	public CuentaBancaria() {
  		
  	}
// aqui va el constructor principal
  	
    public CuentaBancaria(String nombrecliente,String numerodecuenta,double tipodeinteres, double saldo) {
    	this.nombrecliente = nombrecliente;
        this.numerodecuenta = numerodecuenta;
        this.tipodeinteres = tipodeinteres;
        this.saldo = saldo;
    }
// constructor  copia
    
    
    public CuentaBancaria(CuentaBancaria cuentita) {
    
        this.nombrecliente = cuentita.nombrecliente;
        this.numerodecuenta = cuentita.numerodecuenta;
        this.tipodeinteres = cuentita.tipodeinteres;
        this.saldo = cuentita.saldo;
    }

	public String getnombrecliente() {
		return nombrecliente;
	}

	public void setnombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getnumerodecuenta() {
		return numerodecuenta;
	}

	public void setnumerodecuenta(String numerodecuenta) {
		this.numerodecuenta	 = numerodecuenta;
	}

	public double gettipodeinteres() {
		return tipodeinteres;
	}

	public void settipodeinteres(double tipodeinteres) {
		this.tipodeinteres = tipodeinteres;
	}

	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
    
	    
	
}