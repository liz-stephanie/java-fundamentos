import java.util.Arrays;
import java.util.ArrayList;
public class BasicTest {
	public static void main(String[] args){
		Basic basic = new Basic();
		// First Method / Exercise
		System.out.println("Primer Metodo / Ejercicio");
		ArrayList<Integer> a = basic.OneToNum(255);
		for (Integer element : a){
			System.out.println(element);
		}
		// Second Method / Exercise
		System.out.println("Segundo Metodo / Ejercicio");
		basic.OddsToNum(255);
		// Third Method / Exercise
		System.out.println("Tercer Metodo / Ejercicio");
		basic.SumToNum(255);
		// Fourth Method / Exercise
		System.out.println("Cuarto Metodo / Ejercicio");
		int[] arr4 = {1,2,4,6,3,5};
		basic.printArray(arr4);
		// Fifth Method / Exercise
		System.out.println("Quinto Metodo / Ejercicio");
		int[] arr5 = {2,-5,10,-21,5};
		System.out.println(basic.returnMax(arr5));
		// Sixth Method / Exercise
		System.out.println("Sexto Metodo / Ejercicio");
		int[] arr6 = {2,10,3};
		System.out.println(basic.getAverage(arr6));
		// Seventh Method / Exercise
		System.out.println("Septimo Metodo / Ejercicio");
		System.out.println(basic.OddsToArray(255));
		// Eigth Method / Exercise
		System.out.println("Octavo Metodo / Ejercicio");
		int[] arr7 = {2,7,-8,6};
		System.out.println(basic.GreaterThan(arr7,-10));
		// Nineth Method / Exercise
		System.out.println("Noveno Metodo / Ejercicio");
		int[] arr8 = {1,2,3,4,5};
		System.out.println(Arrays.toString(basic.sqrtArr(arr8)));
		// Tenth Method / Exercise
		System.out.println("Decimo Metodo / Ejercicio");
		int[] arr9 = {1,2,-6,4,-124,3};
		System.out.println(Arrays.toString(basic.rmNegatives(arr9)));
		// Eleventh Method / Exercise
		System.out.println("Onceno Metodo / Ejercicio");
	 	int[] arr10 = {1,5,10,-2};
		System.out.println(Arrays.toString(basic.minMaxAvg(arr10)));
		// Twelfth Method / Exercise
		System.out.println("Duodecimo Metodo / Ejercicio");
		int[] arr11 = {1,2,4,8,10,12};
		System.out.println(Arrays.toString(basic.switchPositions(arr11)));
	}
}

