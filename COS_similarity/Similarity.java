package COS_similarity;

public class Similarity {
	/* main function is only a test function. Giving an example for using Compute function
	 * to compute the Cosine similarity of two arrays.
	 */
	public static void main(String[] args) {
		double[] arr_a = {1,0,2};
		double[] arr_b = {0,0,1};
		System.out.println(Compute(arr_a, arr_b));
		Compute(arr_a, arr_b);
	}
	
	public static double Compute(double[] arr_a, double[] arr_b) {
		double angle = 0;
		double angle_1 = 0; // the Radian of angle
		double angle_2 = 0; // the degree measure of angle
		double a_len = 0;
		double b_len = 0;
		// Calculate a*b
		for (int i = 0; i < arr_a.length; i++) {
			angle += arr_a[i] * arr_b[i];
			a_len += arr_a[i] * arr_a[i];
			b_len += arr_b[i] * arr_b[i];
		}
		//Calculate||a|*|b||
		a_len = sqrt(a_len);
		b_len = sqrt(b_len);
		
		angle = angle / (a_len * b_len);
		//If one of array distance is 0, we set the outcome equals to 0
		if (a_len * b_len ==0) {
			angle = 0;
		}

		angle_1 = Math.acos(angle);                  // the Radian of angle
		angle_2 = Math.acos(angle) * 180 / Math.PI;  // the degree measure of angle
		return angle_2; //You can choose one as return from angle_1 or angle_2
	}

	private static double sqrt(double doub) {
		if (doub <= 0) {
			return 0;
		}
		
		return Math.sqrt(doub);
	}
}
