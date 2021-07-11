package promineoTechAssignmentsSback;

public class Week3CodingAssignmentSBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Question 1: 
 * Create an array of int called ages that contains 
 * the following values: 3, 9, 23, 64, 2, 8, 28, 93.
 */
	System.out.println("Question# 1(a - c):");
	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
// 1.a subtract first element from last element
	
	int firstElementMinusLastElementA = (ages[0] - ages[ages.length - 1]);
	
	System.out.println(firstElementMinusLastElementA);

//1.b Add new age to array and repeat step 1.a
	
	ages[ages.length - 1] = 88;
	
	int firstElementMinusLastElementB = (ages[0] - ages[ages.length - 1]);
	
	System.out.println(firstElementMinusLastElementB);
	
//1.c Loop to iterate through the array && calc average age. Print.	
	
	double sum = 0;
	
		for(int x : ages) {
			sum += x;
	}
	
	System.out.println(sum/ages.length);
	
/* Question 2: 
* Create an array of String called names that contains 
* the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
*/	
		System.out.println("\nQuestion# 2(a - c):");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
// 2.a Use a loop to iterate thru array & calc avg num of letters per name. Print.	
		
		int sum2 = 0;
		
			for(String str : names) {
				sum2 += str.length();
				
			}
			
		System.out.println(sum2 / names.length);

// 2.b Loop to iterate thru array & concat all names together use space/commas. Print.
		
		String sumOfNames = "";
		
			for (String str : names) {
			sumOfNames += str + " ";
		}
		
		System.out.println(sumOfNames);

/* Question 3: 
* How do you access the last element of any array?
*/	
		System.out.println("\nQuestion# 3:");
		
		System.out.println("To access the last element of any array, print to console: array[array.length -1]; ");
	
/* Question 4: 
* How do you access the first element of any array?
*/
		System.out.println("\nQuestion# 4:");
		
		System.out.println("To access the first element of any array, print to console: array[0]; ");

/* Question 5: 
* Create a new array of int called nameLengths. 
* Loop to iterate prev created names array.
* Add length of each name to nameLengths array.
*/
		System.out.println("\nQuestion# 5:");
		
		int[] nameLengths = new int [names.length];
		
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
		}
			for (int x : nameLengths) {
				System.out.println(x);
			}

/* Question 6: 
* Loop to iterate over nameLengths array. Calc sum of all elements in array. Print.
*/		
		System.out.println("\nQuestion# 6:");
	
		double sum3 = 0;
		
		for(int x : nameLengths) {
			sum3 += x;
	}
		System.out.println(sum3);	
		
/* Question 7: 
* Loop to iterate over nameLengths array. Calc sum of all elements in array. Print.
*/		
				System.out.println("\nQuestion# 7:");
		
				System.out.println(wordRepeat("NaNaNaNa", 5));
				
/* Question 8: 
* Write a method that takes two Strings firstName and lastName
* Return full name separated by a space
*/		
				System.out.println("\nQuestion# 8:");	
				
				System.out.println(fullName("Bat" , "man"));
	
/* Question 9: 
* Write a method that takes array of int 
* and returns true if sum of all ints array > 100
*/						
				System.out.println("\nQuestion# 9:");
				
				System.out.println(sumOfNumsGreaterThan100(nameLengths));
				
/* Question 10: 
* Write a method that takes array of double
* and returns avg of all elements in array 
*/	
				System.out.println("\nQuestion# 10:");
				
				double[] doubleElementsArray = {4.34, 6.09, 7.19, 3.21, 9.99, 0.01};
				
				System.out.println(averageDoubleElements(doubleElementsArray));

/* Question 11: 
* Write a method that takes two arrays of double
* and returns true if avg of elements in first array > avg of elements in second array 
*/
				System.out.println("\nQuestion# 11:");
				
				double[] doubleElementsArray2 = {5.32, 99.99, 0.87, 13.45, 67.08};
				
				System.out.println(firstArrGreaterAvgOrLess(doubleElementsArray, doubleElementsArray2));
				
/* Question 12: 
* Write a method called willBuyDrink that takes a boolean isHotOutside,
* and a double moneyInPocket, and returns true if it is hot outside 
* and if moneyInPocket > 10.50 
*/
				System.out.println("\nQuestion# 12:");				
				
				boolean isHotOutside = true;
				double moneyInPocket = 20.00;
				
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

/* Question 13: 
* Create a method of your own that solves a problem.
* In comments, write what the method does and why you created it. 
*/
				System.out.println("\nQuestion# 13:");	
				
				double product1 = 119.99; //cost of product 1
				double product2 = 47.89;  //cost of product 2
				double product3 = 80.00;  //cost of product 3
				double taxRate = 0.10;    //taxRate
				double orderTotal = orderTotal(product1, product2, product3, taxRate); //assigns orderTotal to calculate off method
				
				System.out.println("Your order total is: $" + orderTotal + "."); //prints, "Your order total is: $(orderTotal)."
				

	} //**end main method**
	
// methods under this comment
	
//Question 7 Method
		
	public static String wordRepeat(String word, int n) {
		String str = "";
		
		for(int i = 0; i < n; i++) {
			str += word;	
		}	
		return str;
	}
	
//Question 8 Method
	
	public static String fullName(String firstName, String lastName){
		String fullName = firstName + " " + lastName;
			return fullName;
	}

//Question 9 Method
	
	public static boolean sumOfNumsGreaterThan100 (int [] arr) {
		int sum = 0; 
		
			for (int x : arr) {
				sum += x;
			} 
				if (sum > 100) {
					return true;
				} else 
					return false;
	}
	
//Question 10 Method
	
	public static double averageDoubleElements(double[] arr) {
		double sum = 0;
		
		for (double x : arr) {
			sum += x;
		}
		return sum / arr.length;
	}

//Question 11 Method
	
	public static boolean firstArrGreaterAvgOrLess(double[] arr1, double[] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double x1 : arr1) {
			sum1 += x1;
		}
		for (double x2 : arr2) {
			sum2 += x2;
		}
		if ((sum1 / arr1.length) > (sum2 / arr2.length)) {
			return true;
		}
		return false;
	}

//Question 12 Method
	
	public static boolean willBuyDrink(boolean arg, double num) {
		if (arg == true && num > 10.50) {
			return true;
		}
			return false;
	}
	
	
	
//Question 13 Method
	
	public static double orderTotal(double product1, double product2, double product3, double taxRate) {
		
		double subTotal = product1 + product2 + product3; //calculates subtotal without tax
		
		double taxAmount = subTotal * taxRate; //calculates tax amount of subtotal 
		
		return subTotal + taxAmount; //returns subtotal + tax amount to equal order total
	}
	
} //**end class**
