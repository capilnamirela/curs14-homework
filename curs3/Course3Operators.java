public class Course3Operators{
	public static void main(String[] args){
		int a = 2 + 2;
		System.out.println(a);

		String testString = "Sunt la cursul" + a;
		System.out.println(testString);

		int substraction = 10-7;
		System.out.println(substraction);

		int multiplication = 6 * 21;
		System.out.println(multiplication);

		int division = 66/21;
		System.out.println(division);

		int remider = 66%21;
		System.out.println(remider);

		int test = 7%2;
		System.out.println(test);

		int b = 4;
		//b++ <=> b=b+1;
		b++;
		System.out.println("b " + b);
		System.out.println("b " + b++); // tipareste 4 - dupa afisare incrementeaza
		System.out.println("b " + ++b); // tipareste 5 - incrementeaza inainte de afisare

		//c--; --c; c=c-1;
		int c = 5;
		System.out.println("c " + --c);

		boolean myBoolean  = true;
		System.out.println(myBoolean);
		System.out.println(!myBoolean);

		boolean equality = b == c;
		System.out.println(equality);

		boolean difference = b !=c;
		System.out.println(difference);

		boolean lessThen = b <= c;
		System.out.println(lessThen);

		boolean graterThen = b >= c;
		System.out.println(graterThen);

		System.out.println("-------------------------------");

		int first = 5;
		int second = 44;
		int third = 33;

		compareVariable(first, second, third);

	}

	public static void compareVariable(int a, int b, int c){

		boolean resultAnd = c < b && c > a;
		System.out.println(resultAnd);

		boolean resultOr = c > b || c > a;
		System.out.println(resultOr);


	}
}