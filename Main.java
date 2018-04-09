interface It1{
    void m1(); // public abstract method
    void m2();
    void m3();
}
class Test implements It1{
    public void m1(){System.out.println("m1 method");}
    public void m2(){System.out.println("m2 method");}
    public void m3(){System.out.println("m3 method");}

    public static void main(String args[]){
        Test t = new Test();
        t.m1();
        t.m2();
        t.m3();
        It1 i = new Test();
        i.m1();
        i.m2();
        i.m3();
    }
}