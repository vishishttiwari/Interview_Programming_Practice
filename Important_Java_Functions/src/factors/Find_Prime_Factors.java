package factors;
import java.util.*;

public class Find_Prime_Factors {
	
	public static void main(String[] args) {
		Integer[] temp = findPrimeFactors(7);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	static Integer[] findPrimeFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (n%i == 0 && checkPrime(i)) factors.add(i);
		}
		Integer[] result = new Integer[factors.size()];
		factors.toArray(result);
		return result;
	}
	
	static boolean checkPrime(int number) {
        boolean status = true;
        if (number <= 1) status = false;
        for (int i = 2; i < number - 1; i++) {
            if (number%i == 0) status = false;
        }
        return status;
    }
}
