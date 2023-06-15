package arrays_Day_1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class PascalsTriangle {

	private static int getFactorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*getFactorial(n-1);
	}
	private static int getCombination(int n,int r) {
		int nFactorial = getFactorial(n);
		int rFactorial = getFactorial(r);
		int n_rFactorial = getFactorial(n-r);
		
		return nFactorial/(rFactorial * n_rFactorial);
	}
	
	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		
		
		for(int i=0;i<rows;i++) {
			List<Integer> temp = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				temp.add(getCombination(i, j));
			}
//			System.out.println(temp);
			ans.add(temp);
			
		}
		
		
		System.out.println(ans);
	}

}
