
public class Main {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println("" + s.solution(12));
		
	}

}


class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int idx = 1;
        for( idx = 1 ; idx<=n ; idx++) {
        	if(n%idx == 0) {
        		answer += idx;
        		System.out.println(answer);
        	}
        }
        return answer;
    }
}


