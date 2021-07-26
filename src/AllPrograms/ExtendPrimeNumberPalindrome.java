package AllPrograms;

import java.util.ArrayList;
import java.util.List;

public class ExtendPrimeNumberPalindrome {
public static void main(String[] args) {
	int sum=0;
	List<Integer> integers=new ArrayList<Integer>();
	for (int i = 2; i <= 1000; i++) {
		int flag = 1;
		for (int j = 2; j <= i / 2; ++j) {
			if (i % j == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			integers.add(i);
			System.out.println(i);
	}
	
	for(int i=2;i<integers.size();i++) {
		 int temp=i;    
		  while(i>0){    
		   int r=i%10;    
		   sum=(sum*10)+r;    
		   i=i/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ::"+integers.get(i));    
		     
		
	}
}  
	
}

