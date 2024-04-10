/**Apliquemos lo aprendido en el proyecto de Billetera Virtual:

1- Declararemos una superclase FormaDePago con el método void
realizarPago():

2- Luego se crean subclases TarjetaDeCrédito y Moneda que heredan
de FormaDePago. La particularidad del pago con tarjeta es poder
elegir cantidad de cuotas, mientras que Moneda puedes elegir el
tipo de moneda.

3- En la clase Billetera se debe declarar una referencia de tipo
FormaDePago: FormaDePago metodoPago;

4- De esta manera podremos asignar el método de pago según se
necesite:

metodoPago = new TarjeraDeCredito();

metodoPago = new Moneda();

Y utilizar polimorfismo al llamar: metodoPago.realizarPago();

Tiempo: 30 minutos
 * 
 */

package ejercicioenclase.POO_0804;

/**
 * 
 */
public class wallet {

	/**
	 * 
	 */
	public wallet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
