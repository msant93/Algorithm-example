package googl_Chall;

//creare un metodo in cui dato un array di interi e un elemento k
// si vuole restituire true solo se due elementi dell' array sommati danno k come risultato

public class Googl_Chall {



	public Googl_Chall() {

	}

	public static void main(String[] args) {
		int [] array_test = {7,9,6};
		int k = 16;

		System.out.println(checkSum (array_test,k));

	}

	public static boolean checkSum(int [] array, int k) {

		boolean checkSumArray = false;

		int indexSum=0;

		int kCheck=0;


		for (indexSum = 0; indexSum < array.length; indexSum++) {


			for (int i=0; i<array.length;i++ )


			{
				if (checkSumArray == true){
					break;
				}

				if (indexSum != i) {
				kCheck= array [indexSum] + array [i];
				}
				
				
				if (kCheck == k) {

					checkSumArray = true;
				}

			}


		}

		return checkSumArray;


	}

}
