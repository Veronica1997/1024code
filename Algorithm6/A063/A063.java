//Sort a K-Sorted Array ����K��������
/*����һ�����������k�������飬ָ��kֵ�����������ÿ��Ԫ�ر������ŷŵ�λ��������ȷλ�ü�Ĳ�಻����k��ͨ���������㷨�Ը�����������������������Ϊ10
���룺
1 4 5 2 3 7 8 6 10 9
2
�����1 2 3 4 5 6 7 8 9 10*/
import java.util.Arrays;
import java.util.Scanner;
public class A063 {
	public static int[] sortElement(int[] array, int n ,int k) {
		if(n == 0 || n<k) return array;
		int[] heap = Arrays.copyOf(array, k);//����ֻ��K��Ԫ�ص�С��
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
            //����  
            int temp = heap[0];  
            heap[0] = heap[k-1];  
            heap[k-1] = temp;  
            //���µ���  
            heapCreate(heap, 0, --k);  
        }  
        return array;  
    }  
	//������С��
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

