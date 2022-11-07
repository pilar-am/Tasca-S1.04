package n1exercici2;

public class CalculoDni {

	/*
	 * 
Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el n�mero com a par�metre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perqu� el test rebi 
un espectre de dades ampli i validi si el c�lcul �s correcte per a 10 n�meros de DNI predefinits.

	 */
	
    public static char calcularLletra(int dni){
        String caracters="TRWAGMYFPDXBNJZSQVHLCKE";
        int residu = dni%23;
        return caracters.charAt(residu);
    }
	
}
