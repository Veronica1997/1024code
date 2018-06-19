import java.util.Scanner;
//使用冒泡排序对输入数组进行排序，它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。输入个数为7
public class A003 {
	public static void main(String[] args){
        int a[]=new int[7]; 
        Scanner input = new Scanner(System.in);
        for(int k=0;k<a.length;k++) {
        	a[k]=input.nextInt();
        }	 
        int temp=0;//中间值
        //-------冒泡排序法
        //外层循环,它决定一共走几趟
        for(int i = 0;i<a.length-1;i++){
            //内层循环,开始逐个比较
            //如果我们发现前一个数比后一个数大,则交换
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]) {
                    //换位
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
    }
        for(int n=0;n<a.length;n++) {
        	System.out.print(a[n]+" ");
        }
    }
}
