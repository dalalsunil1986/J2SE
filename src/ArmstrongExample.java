package aArmstrong;

//Let's see the java program to check Armstrong Number.
class ArmstrongExample {
	public static void main(String[] args) {
		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
}
/*
 * Input: 153
 * 
 * Output: Armstrong number
 * 
 * Input: 22
 * 
 * Output: not Armstrong number
 * 
 * 
 */

/*
 * Let's try to understand why 153 is an Armstrong number.
 * 
 * 153 = (1*1*1)+(5*5*5)+(3*3*3) where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 So:
 * 1+125+27=153 Let's try to understand why 371 is an Armstrong number.
 * 
 * 371 = (3*3*3)+(7*7*7)+(1*1*1) where: (3*3*3)=27 (7*7*7)=343 (1*1*1)=1 So:
 * 27+343+1=371
 * 
 */
