package uberChall;

// Given an array of integers, returns a new array such that each element at index i of the 
//new array is the product of all the numbers in the original array except the one at i

public class UberChall {

	public UberChall() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int [] array = {5,2,3,4,5};

	/*	for (int i=0; i<array.length;i++) {
			System.out.println(modifyArrayDiv(array)[i]);	
		} */
		
		for (int i=0; i<array.length;i++) {
			System.out.println(modifyArrayNoDiv(array)[i]);	
		}
	}

	
	//method with division

	public static int [] modifyArrayDiv (int [] arrayInput) {
		
		int arrayReverse [] = new int [arrayInput.length];

		int sum=1;
		
		for (int i=0; i<arrayInput.length; i++ ) {
			
			sum = sum * arrayInput[i];
					
		}
		
		
		for (int j=0; j < arrayReverse.length; j++ ) {
			
			arrayReverse [j] = sum/arrayInput[j];
			
		}


		return arrayReverse;

	}
	
	
	//method without division
	
	public static int [] modifyArrayNoDiv (int [] arrayInput) {
		
		int arrayReverse [] = new int [arrayInput.length];


		
		for (int i=0; i<arrayReverse.length; i++ ) {
			
			for (int j=0;j < arrayInput.length;j++ ) {
				
				if (j!=i) {
					
					if (arrayReverse [i]==0) {
						
						arrayReverse [i]=1;
					}
					arrayReverse [i]= arrayReverse [i] * arrayInput[j];
					
				}
				
			}
					
		}
		
		return arrayReverse;
		
	}
	
}
