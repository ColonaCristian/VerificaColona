/**
 * <u> 4ai</u>
 * @author <mark> Colona</mark>
 *
 */


public class ColonaClass {

	public ColonaClass() {
		
	}
	/**
	 * 
	 * @param b
	 * @param e
	 * @return
	 */
	public float cognomeMet (int b, int e) {
		int val1=1;
		for (int i=1; i<=b; i++){
		val1 = val1 * b;
		}
		return val1;
		}
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
	ColonaClass c=new ColonaClass();
	System.out.println(c.cognomeMet(2, 2));
	}
	

}
