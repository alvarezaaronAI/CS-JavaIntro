/**
 * Author: Aaron Alvarez
 * Description: Magic Numbers
 */
package Homework05;
public class HW05P06 {

	public static void main(String[] args) {
		for (int mN = 1; mN<10000; mN++){
		int sum = 0;
		String a = " ";
			for (int mN2 = 1;  mN2<mN; mN2++){
				if (mN%mN2 == 0){
					sum +=  mN2;
					a +=  mN2 + " + ";
				}
			}
				if (mN == sum){
					System.out.println(sum + " =" + a);
				}	
		}
	}
}