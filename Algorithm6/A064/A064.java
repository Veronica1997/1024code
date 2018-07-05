//Find first k non-repeating characters in a string in single traversal 在单次遍历中查找字符串中前k个只一次出现的字符
/*在单次遍历中查找字符串中前K个只一次出现的字符
输入一个字符串，通过仅执行一次遍历，找到前K个不重复的字符。
例如：
输入字符串与K的值：
ABCDBAGHCHFAC
3
输出：
D G F
*/
import java.util.*;
public class A064{
    private static class Pair{
        private int count;
        private int index;
        Pair(int count, int index) {
            this.count = count;
            this.index = index;
        }
        public int getCount() {
            return count;
        }
        public int getIndex() {
            return index;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public void setIndex(int index) {
            this.index = index;
        }
    }
    //找到前k个不重复字母的方法
    public static void nonRepeating(String str, int k){
    	//创建map对象
        Map<Character, Pair> map = new HashMap<>();

        for (int i = 0 ; i < str.length(); i++){
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), new Pair(1, i));
            }
            else {
                Pair pair = map.get(str.charAt(i));
                pair.setCount(pair.getCount() + 1);
                pair.setIndex(i);
            }
        }
        PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
        for (Map.Entry<Character,Pair> entry: map.entrySet()){
            int count = entry.getValue().getCount();
            int index = entry.getValue().getIndex();
            if (count == 1){
                if (--k >= 0) {
                    pq.add(index);
                }else if (index < pq.peek()) {
                    pq.poll();
                    pq.add(index);
                }
            }
        }
        int[] arr = new int[pq.size()];
        int n = arr.length;
        while (!pq.isEmpty()){
            int max_index = pq.poll();
            arr[n-1] = max_index;
            n--; 
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(str.charAt(arr[i])+" ");
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int k = input.nextInt();
        input.close();
        nonRepeating(str, k);
    }
}
