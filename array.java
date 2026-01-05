

class array {
	public static void main (String[] args){
		

		String[] fruits = {"apple", "orange", "banana", "coconut"};

		//we can choose what elements of the array using this index. Remember: apple=0 orange=1 banana=2 coconut=3
		System.out.println(fruits[1]);

		//we can overwrite the value at index 1 so now index 1 will have pinapple instead of orange
		fruits[1] = "pinapple";

		//this show us how many elements are there in the array
		int numOfFruits = fruits.length;
		System.out.println("Number of fruits: " + numOfFruits);

		//If you want to print all the elements of an Array
		for(int i = 0; i < fruits.length; i++){
			System.out.println(fruits[i]);
		}



		
	}
} 