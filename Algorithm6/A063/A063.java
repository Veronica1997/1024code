//Sort a K-Sorted Array 排序K排序阵列
/*给定一个近似排序的k排序数组，指定k值，则该数组中每个元素被错误排放的位置与其正确位置间的差距不超过k，通过堆排序算法对该数组进行重新排序。输入个数为10
输入：
1 4 5 2 3 7 8 6 10 9
2
输出：1 2 3 4 5 6 7 8 9 10*/
import java.util.Arrays;
import java.util.Scanner;
public class A063 {
	public static int[] sortElement(int[] array, int n ,int k) {
		if(n == 0 || n<k) return array;
		int[] heap = Arrays.copyOf(array, k);//建立只有K个元素的小堆
		for(int i=k/2-1;i>=0;i--) {
			heapCreate(heap,i,k);
		}
		for(int i=k;i<n;i++) {
			array[i-k] = heap[0];
			heap[0] = array[i];
			heapCreate(heap,0,k);
		}
	    for(int i = n-k;i < n;i++){  
            array[i] = heap[0];  
            //交换  
            int temp = heap[0];  
            heap[0] = heap[k-1];  
            heap[k-1] = temp;  
            //重新调整  
            heapCreate(heap, 0, --k);  
        }  
        return array;  
    }  
	//建立最小堆
	 private static void heapCreate(int[] heap,int i,int k){  
	        int temp = heap[i];  
	        for(int j = 2*i+1;j < k; j = 2*j+1){  
	            if((j+1 < k) && (heap[j] > heap[j+1]))  
	                j++;  
	            if(temp < heap[j])  
	                break;  
	            heap[i] = heap[j];  
	            i = j;  
	        }  
	        heap[i] = temp;  
	    }  
	      public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   int[] array = new int[10];
		   for(int i=0;i<10;i++) {
			   array[i] = scanner.nextInt();
		   }
		   int k = scanner.nextInt();
		   scanner.close();
		   for(int i=0;i<k;i++) {
		   sortElement(array,10,k); 
		   }
		   for(int i=0;i<10;i++) {
			   System.out.print(array[i]+" ");
		   }
    }
}

