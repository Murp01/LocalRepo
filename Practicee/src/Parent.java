
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this step just print in output
		System.out.println("Starting to learn java again");
		
		
		//add to numbers
		int a = 2;
		int b = 3;
		
		int sum = a + b;
		
		System.out.println(sum);
		System.out.println("sum is " + sum);
		
		//calling validateMethod from 'Basic2" class
		
		Methods M = new Methods();
		/*class object - new object name - method name.  New = memory allocation operator
		 * 
		 */
		M.validateHeader();
		

	}

}
