
public class Main {

	public static void main(String[] args) {
		
	}

}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
    	
    	//전제조건 두 배열의 사이즈는 같다.
        int answer = 0;
        
        for(int i = 0 ; i < absolutes.length ; i++) {
        	if(signs[i]) answer += absolutes[i];
        	else answer -= absolutes[i];
        }
        return answer;
    }
}