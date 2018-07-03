import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class j149 {
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
	       List<String> list = new ArrayList<String>();	       
	       list.add(input.nextLine());	       
	       input.close();
	       for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
    }
}
