package week04;

public class javaWeek04 {

	public static void main(String[] args) {
		System.out.println("Test print line.");
		// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			// a. Programmatically subtract the value of the first element in the array from the value in the last element of the array.
		System.out.println(ages[ages.length - 1] - ages[0]);
			// b. Create a new array of int called ages2 with 9 elements.
		int[] ages2 = {3, 8, 11, 19, 27, 31, 50, 59, 67};
				// i. Ensure there are 9 elements in ages2 (as per the example).
				// ii. Repeat the subtraction from Step 1.a.
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
				//		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
				//
			//		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int agesSum = 0;
		for (int i = 0; i < ages.length; i++) {
		    agesSum += ages[i];
		}
		double agesAve = agesSum / ages.length;
		System.out.println("The average ages is " + agesAve);
		//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam" , "Tommy" , "Tim" , "Sally" , "Buck" , "Bob"};
			//		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int namesSum = 0;
		for(int i = 0; i < names.length; i++) {
			namesSum += names[i].length();
		}
		double namesAve = (double) namesSum / names.length;
		System.out.println("The average length of the names is " + namesAve);
		
			//		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
		    allNames += names[i];
		    if (i < names.length - 1) {
		        allNames += " "; // Add a space after each name except the last one
		    }
		}
		System.out.println(allNames);
		//		3. How do you access the last element of any array?
		System.out.println("The last element of an array is access by doing \"array(array.length - 1)\"");
		//		4. How do you access the first element of any array?
		System.out.println("The last element of an array is access by doing \"array(0)\"");
		//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		int nameLengthsSum = 0;
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
		    nameLengthsSum += nameLengths[i];
		}
		//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("The sum of characters in names is " + nameLengthsSum);
		//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		String repeated = repeatWord("Hello", 3);
	    System.out.println(repeated); 
		//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String fullName = fullName("Max", "Verstappen");
		System.out.println(fullName);
		//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] testNums = {30, 40, 50};
		int[] testNums2 = {1, 24, 11, 9};
	    System.out.println("is the sum > 100 " + isSum100(testNums));
	    System.out.println("is the sum > 100 " + isSum100(testNums2));
		//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] testDouble = {1.1111, 2.40, 99.999, 101.0101, 3.14159};
		System.out.println("sum of doubles: " + aveArr(testDouble));
		//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] testDouble2 = {100.1, 77.7777, 2.123456, 7.12345};
		System.out.println("is the sum of test1 > sum of test2: " + arrComp(testDouble, testDouble2));
		//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("will i buy a drink: "+ willBuyDrink(true, 99.99));
		System.out.println("will i buy a drink: "+ willBuyDrink(true, 0.10));

		//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		double[] q1LapTimes = {93.616, 92.851, 92.330, 93.046, 92.584, 92.361, 93.556, 92.740, 93.864, 93.057, 92.950, 93.536, 93.550, 93.973, 93.564, 93.611, 93.795, 93.601, 93.986, 94.033, 93.339, 94.051, 94.062, 94.152, 94.154, 94.228};
		System.out.println("the fastest driver in q1 was: " + fastestDriver(q1LapTimes));
	}
	//7
	public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
	//8
	public static String fullName(String first, String last) {
		String full = first + " " + last;
		return full;
	}
	//9
	public static boolean isSum100(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum > 100;
    }
	//10
	public static double aveArr(double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
	//11
	public static boolean arrComp(double[] nums1, double[] nums2) {
        double sum1 = 0;
        for (double num : nums1) {
            sum1 += num;
        }
        double sum2 = 0;
        for (double num : nums2) {
            sum2 += num;
        }
        
        return (sum1 > sum2);
    }
	//12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
    
    public static int fastestDriver(double[] lapTimes) {
    	int fastest = 0;
    	for(int i = 1; i < lapTimes.length; i++) {
    		if(lapTimes[fastest] > lapTimes[i]) {
    			fastest = i;
    		}
    	}
    	return fastest;
    }

}
