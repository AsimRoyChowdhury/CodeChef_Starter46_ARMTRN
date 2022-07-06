import java.util.ArrayList;
import java.util.Scanner;


class CodeChefCC {

          public static void main(String[] args){
                  Scanner sc = new Scanner(System.in);
                  int t = sc.nextInt();
                  int x; 
	        long arr[];
                  while(t-- > 0){
		x = sc.nextInt();
		arr = new long[x];
		long att = 0, deff = 0, num;
		int count = 0, noOf500 = 0;

		for(int i = 0; i<x; i++){
			arr[i] = sc.nextLong();
		}

		num = arr[0];

		for(long i : arr){
			if(num == i){
				count += 1;
			}
		}

		if(count == x){
			if(num <= 500){
				att = num;
				deff = (1000-num)*(x-1);
			}
			else {
				deff = 1000-num;
				att = num * (x-1);
			}
			
		}
		else{
			for(long i : arr){
				if(i>500){
					att += i;
				}
				else if(i==500){
					noOf500 += 1;
				}
				else {
					deff = deff + (1000-i);
				}
			}
			if(noOf500%2 == 0){
				att += ((noOf500/2)*500);
				deff += ((noOf500/2)*500);
			}
			else{
				if(att > deff){
					deff += (((noOf500/2) + 1)*500);
					att += ((noOf500/2)*500);
				}
				else{
					att += (((noOf500/2) + 1)*500);
					deff += ((noOf500/2)*500);
				}
			}
		}


		System.out.println(att*deff);
	}
	        
          }         

}          
