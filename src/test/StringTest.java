package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int count = 1;
		    int ptr = 0;
		    
		    String s = "aabbbccAcaaadd";
		    char[] str = s.toCharArray();
		    
		    //Character[] str = {'c', 'c', 'b'};
		    
		    String result = "";
		    while(ptr < str.length){
		        if(ptr + 1 == str.length){
		             result += str[ptr] + String.valueOf(count); // a2
		             break;
		        }
		        if(str[ptr] == str[ptr+1]){
		            count += 1;  // 2
		        }else{
		            result += str[ptr] + String.valueOf(count); // a2b3
		            count = 1;
		        }
		        ptr++; // 1
		    }
		    
		    System.out.println(result);
	}
	
	

}
