public class A {
        static{
            System.out.println("A1、static属性块");
        }
        {
            System.out.println("A2、属性块");
        }
        public A(){
            System.out.println("A3、构造方法");
        }
}
