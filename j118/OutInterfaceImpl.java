public class OutInterfaceImpl implements OutInterface {
    private OutInterface.Inner inner = new Inner();
 
    @Override
    public void method_1() {
        inner.print();
    }
 
    @Override
    public void method_2() {
        inner.print();
    }
 
    public static void main(String[] args) {
        OutInterface oif = new OutInterfaceImpl();
        oif.method_1();
        oif.method_2();
    }
}
