package a071;
//Longest Common Prefix in given set of strings (using Trie) ������һ���ַ�������Ĺ���ǰ׺��ʹ��Trie��
/*�ڸ�����һ���ַ����в��������ǰ׺��LCP��
keys = [��codable��, ��code��, ��coder��, ��coding��]
�����ǰ׺ ��cod��
�����The longest common prefix is cod*/
import java.util.*;

class Tries{
	boolean isLeaf = false;
	Map<Character,Tries> character = new HashMap<>();
}

public class A071 {
   private static void insert(Tries head,String str) {
	   Tries curr = head;
	   for(int i=0;i<str.length();i++) {
		   if(!curr.character.containsKey(str.charAt(i))) {
			   curr.character.put(str.charAt(i), new Tries());
		   }
		   curr = curr.character.get(str.charAt(i));
	   }
	   curr.isLeaf = true;
   }
   public static String findLCP(List<String> keys) {
	   Tries head = new Tries();
	   for(String s : keys) {
		  insert(head,s);
	   }
	   StringBuilder lcp = new StringBuilder();
	   Tries curr = head;
	   while(curr != null && !curr.isLeaf &&(curr.character.size() == 1) ) {
		   Iterator<Map.Entry<Character, Tries>> it = curr.character.entrySet().iterator();
		   if(it.hasNext()) {
			   Map.Entry<Character, Tries>entry = it.next();
			   lcp.append(entry.getKey());
			   curr = entry.getValue();
		   }
	   }
	   return lcp.toString();
   }
   public static void main(String[] args) {
	   List<String> keys = Arrays.asList("codable", "code", "coder", "coding") ;
	   System.out.println("The longest common prefix is"+" "+findLCP(keys));
   }
}

