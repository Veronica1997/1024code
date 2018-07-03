import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j150 {
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 String a =input.nextLine();
		 input.close();
	       String[] b = a.split(" ");	 
	       ArrayList<String>  list = new ArrayList<String>();
	       for(int i=0;i<b.length;i++){
	          list.add(b[i]);
	       }       
	      
	       Collections.reverse(list);  
	       for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
    }
}

