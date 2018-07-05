//Trie Implementation | Insert, Search and Delete trie����ʵ��-�������ɾ��
/*ִ�в��룬������ɾ��
��Trie���ݽṹ��ʵ�ֲ��룬������ɾ������������������Сд��ĸ���
a-z��
ʲô��Trie���ݽṹ��
Trie��һ�ֻ����������ݽṹ�����ڸ�Ч�ʵ���д���������ַ����е�һ���ؼ��֡��������������ͬ��
���еĽڵ�洢��ýڵ����������Կ������״�ڵ�����е�λ�ö����������ڵ���Կ
�����͹ؼ�ֻ��ҶƬ���������Ҳ����Ϊǰ׺������Ϊ�ڵ�����к�������й�֮ͬ��
��ýڵ���������ַ�����ǰ׺�����Ҹ�����ַ�������������롰hello",��ѯ��hello��,ɾ����hel��,���yes*/
import java.util.*;
class Trie{
	private static final int char_size = 26;
	boolean isLeaf;
	List<Trie> children = null;
	Trie(){
		isLeaf = false;
		children = new ArrayList<>();
		for(int i=0;i<char_size;i++) {
			children.add(null);
		}
	}
	public void insert(String key) {
		Trie curr = this;
	for(int i=0;i<key.length();i++) {
		if(curr.children.get(key.charAt(i)- 'a' )== null) {
           curr.children.set(key.charAt(i)-'a', new Trie());
           curr = curr.children.get(key.charAt(i) - 'a');
		}
	}
	curr.isLeaf = true;
}
	public boolean search(String key) {
		Trie curr = this;
		for(int i=0;i<key.length();i++) {
			curr = curr.children.get(key.charAt(i) - 'a');
			if(curr == null)  return false;
		  }
		return curr.isLeaf;
	}
	public boolean delete(String key) {
		Trie curr = this;
		int count = 0;
		for(int i=0;i<key.length();i++) {
			curr = curr.children.get(key.charAt(i) - 'a');
			if(curr != null) {
				count++;
				}
			if(count == 1 || count == 0) { 
				curr = null;
				return false;
 		  }
	}
		return curr.isLeaf;
	}
};
public class A070 {
   public static void main(String[] args) {
	   Trie head = new Trie();
	   head.insert("hello");
	   if(head.search("hello")) {
	   System.out.println("yes");
	   System.out.println("yes");
	   }
	   if(head.delete("hel")) {
	   System.out.println("yes");  
	   }
   }
}
