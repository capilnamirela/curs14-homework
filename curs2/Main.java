public class Main{
	public static void main(String[] args){
		System.out.println("Hi");
		int myFirstInt = 4;
		System.out.println(myFirstInt);
		int mySecondInt = 77;
		System.out.println(mySecondInt);

		int sumOfNumbers = 64+88;
		System.out.println(sumOfNumbers);

		sumWithNoReturn(myFirstInt, mySecondInt);
		sumWithNoReturn(235, 565);

		int result = sumWithReturn(10,20);
		System.out.println(result);

		printSomething();

		String myFirstString = "Ana are mere";
		System.out.println(myFirstString);
		System.out.println("Ana are " + myFirstInt + " mere");
	}

	// scrie o functie care primeste 2 parametrii si afiseaza suma lor

	public static void sumWithNoReturn(int param1, int param2){
		System.out.println(param1 + param2);
	}

	// scrie o functie care primeste 2 parametrii si returneaza suma lor
	public static int sumWithReturn(int var1, int var2){
		return  var1 + var2;
	}

	// scrie o functie care nu primeste niciun parametru si afiseaza "am reusit"
	public static void printSomething(){
		System.out.println("am reusit");
	}
}