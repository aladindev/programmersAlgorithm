
public class Main {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		s.solution(12345);
		
	}

}

class Solution {
    public int[] solution(long n) {
        
    	String s = String.valueOf(n);
    	long tmpN = n;
        int[] answer = new int[s.length()];
        
        for(int i = 0 ; i < answer.length ; i++) {
        	answer[i] = (int) (tmpN%10);
        	tmpN = tmpN/10;
        }
        return answer;
    }
}


