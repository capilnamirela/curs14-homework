public class Course3IfStatement{
	public static void main(String[] args){
		learnIf();

	}

	public static void learnIf(){
		int a = 4;
		int b = 32;

		if (a >= 4){
			System.out.println("a is bigger or equal than 4");
		}


		if (a > 4){
			System.out.println("a is bigger than 4");
		} else {
			System.out.println("a is not bigger than 4");
		}


		if(b > 50){
			System.out.println(" 50 < b < infinite ");
		} else if(b == 50) {
			System.out.println(" b = 50 ");
		} else {
			System.out.println(" b < 50 ");
		}


		if (a<10 && b<50){
			System.out.println("a<10 si b<50");
		}

		if (a<10){
			if (b>50){
			System.out.println("a<10 si  b<50 var 2");
		}
		System.out.println("the code continue1");
		}

		System.out.println("the code continue");

	}
}