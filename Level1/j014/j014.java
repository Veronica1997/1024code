import java.util.Scanner;  
 
public class j014 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("������Ҫѡ����ע��");  
        if(sc.hasNextInt()){  
            int n = sc.nextInt();  
            if (n >0 ){  
                for(int i = 1; i <= n; i++){  
                    for (int j = 1; j <= 7; j++){  
                        int num = (int) (Math.random() * 10);  
                        System.out.print(num + "  ");  
                    }  
                    System.out.println();  
                }  
            }  
            else{  
                System.out.println("������󣡣�");  
            }              
        }  
        else {  
            System.out.println("������󣡣�");  
        }  
        sc.close();  
    }  
}  