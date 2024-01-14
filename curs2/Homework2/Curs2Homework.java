public class Curs2Homework{
	public static void main(String[] args){

		short paramShort = 25;
		int paramInt = 2_500;
		long paramLong = 12_567L;
		double paramDouble = 125.24D;

		double sumaParametri = sumVariables(paramShort, paramInt, paramLong, paramDouble);

		System.out.println("Suma variabilelor este: " + sumaParametri);
	}

	public static double sumVariables(short param1, int param2, long param3, double param4){
		return (double) param1 + (double) param2 + (double) param3 + param4;
	}
}

//Tipul de date acceptat de variabila sumaParametri este double, deoarece daca s-ar utiliza 
//unul din celelalte tipuri de date (short, int, long), s-ar pierde din valorile parametrilor 
//care permit stocarea unor valori mai mari