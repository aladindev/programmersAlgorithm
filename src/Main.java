
public class Main {

	public static void main(String[] args) {
		
		
		System.out.println((double)10/4);
		
	}

}


class Solution {
    public double solution(int[] arr) {

    	int sum = 0;
    	for(int a : arr) sum+=a;
    	
    	// 소수점 처리를 위한 캐스
        double answer = (double)sum/arr.length;
        return answer;
    }
}


