// ʹ�÷���ʵ��ջ�ṹ��������ͬ���͵�ջ����ʵ����ջ��ջ����
public class j146 {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("��ƵѧJava");  //��ջ�������ַ���
        stack.push("ϸ˵Java");   //��ջ�������ַ���
        stack.push("Java�����ŵ���ͨ(��2��)"); //��ջ�������ַ���
        System.out.println("��ջ��ȡ���ַ�����");
        while (!stack.empty()) {
            System.out.println((String) stack.pop());//ɾ��ջ��ȫ��Ԫ�ز��������
        }
    }
}
