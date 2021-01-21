package charpter4_2;

public class Father {
    private void test() {
        System.out.println("我是Father类的test方法");
    }

    public void  test2(){
        System.out.println("我是Father类的test2方法");
        test();
    }
}
