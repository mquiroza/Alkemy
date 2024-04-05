/**
 * 
 */
package ejercicioenclase.POO_0304;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria ctaban = new CuentaBancaria();
		
		ctaban.setnombrecliente("roy fooker");
		ctaban.setnumerodecuenta("123");
		ctaban.settipodeinteres(15);
		ctaban.setsaldo(1000);
		
		CuentaBancaria ctaban2 = new CuentaBancaria();
		
		ctaban2.setnombrecliente("rick hunter");
		ctaban2.setnumerodecuenta("124");
		ctaban2.settipodeinteres(15);
		ctaban2.setsaldo(500);

      
		System.out.println(ctaban.getnombrecliente() + "  " + ctaban.getnumerodecuenta() + " " + ctaban.getsaldo() + " ");
	    System.out.println(ctaban2.getnombrecliente() + "  " + ctaban2.getnumerodecuenta() + " " + ctaban2.getsaldo() + " ");
		
		
	}


	
}
