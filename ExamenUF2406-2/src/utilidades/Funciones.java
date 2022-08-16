package utilidades;
/**
 * Son varias funciones 
 * @author $ Charo Castro
 *
 */
public class Funciones {
	
	/**
	 * Esta función devuelve el número del medio que es correlativo
	 * @param num1 int
	 * @param num2 int
	 * @param num3 int
	 * @return devolvería el número que esta en medio de los dos.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * calcula el año bisiesto entre los años 1700 y 2500
	 * @param anyo date
	 * @return devuelve el año bisiesto si es divisible por 4 y si no es divisible ni por 100 ni 400
	 * el año no sería bisiesto.
	 */

	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
			
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
}
