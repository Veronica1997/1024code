//Trie Implementation | Insert, Search and Delete trie树的实现-插入查找删除
/*执行插入，搜索和删除
在Trie数据结构上实现插入，搜索和删除操作。假设输入由小写字母组成
a-z。
什么是Trie数据结构？
Trie是一种基于树的数据结构，用于高效率地重写大量数据字符串中的一个关键字。与二叉搜索树不同，
树中的节点存储与该节点相关联的密钥，在树状节点的树中的位置定义了它所在的密钥
关联和关键只与叶片相关联。它也被称为前缀树，因为节点的所有后代都具有共同之处
与该节点相关联的字符串的前缀，并且根与空字符串相关联。插入“hello",查询”hello“,删除”hel“,输出yes*/
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
