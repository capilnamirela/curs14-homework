public class ExtraMile1{
	public static void main(String[] args){
	myFirstByte();
	myFirstShort();
	myFirstInt();
	myFirstLong();
	myFirstFloat();
	myFirstDouble();
	myFirstBoolean();
	myFirstChar();
	}

	public static void myFirstByte(){
		byte myFirstByte = 127;
		System.out.println(myFirstByte);
	}

	public static void myFirstShort(){
		short myFirstShort = 32_000;
		System.out.println(myFirstShort);
	}	

	public static void myFirstInt(){
		int myFirstInt = 125_456;
		System.out.println(myFirstInt);
	}

	public static void myFirstLong(){
		long myFirstLong = 12915621358L;
		System.out.println(myFirstLong);
	}
	
	public static void myFirstFloat(){
		float myFirstFloat = 43/31F;
		System.out.println(myFirstFloat);
	}

	public static void myFirstDouble(){
		double myFirstDouble = 456/77D;
		System.out.println(myFirstDouble);
	}
		
	public static void myFirstBoolean(){
		boolean myFirstTrueBoolean = true;
		boolean myFirstFalseBoolean = false;

		System.out.println(myFirstTrueBoolean);
		System.out.println(myFirstFalseBoolean);
	}	
				
	public static void myFirstChar(){
		char myFirstChar = 'f';
		System.out.println(myFirstChar);

	}
}