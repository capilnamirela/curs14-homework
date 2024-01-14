public class Course3Loops{
	public static void main(String[] args){

		int[] intArray = new int[5];
		intArray[0] = 4;
		System.out.println(intArray[0]);
		System.out.println(intArray[3]);

		int[] altArray = new int[]{1,44,66,3};
		System.out.println(altArray[2]);
		System.out.println(altArray[3]);

		
		int size = altArray.length;
		System.out.println("The size is " + size);

		int[] simpleArray = {4,33,22,1};
		System.out.println(simpleArray[3]);

		for(int i = 0; i < 5; i++){
			System.out.println("i: "+i);
		
		}
		
		//for(int j = 0; j < 5; ++j){
		//	System.out.println("j: "+j);
		//		}

		for(int index = 0; index <simpleArray.length; index++){

			System.out.println(simpleArray[index]);
		}

		for(int value : altArray){

			System.out.println(value);
		}


		String[] names = {"Mircea","George","Ionel"};
		for(String name : names){
			System.out.println(name);
		
		}





		
	}

}