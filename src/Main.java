
public class Main {

	public static void main(String[] args) {
		int[] array = {5, 1, 10, 15, 20, 3, 8};
		
		int largest = array[0];
		int smallest = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}else if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		
		System.out.println("The largest number in the array is: " + largest);
		System.out.println("The smallest number is the array is: " + smallest);

	}

}
