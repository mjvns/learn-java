//User defined Generic Class demo
class Generic<T>{
    T obj;
    Generic(T obj){
        this.obj = obj;
    }

    void show(){
        System.out.println("The type of object is: "+obj.getClass().getName());
    }

    T getObj(){
        return obj;
    }
}
class p9 {
    public static void main(String args[]){
        Generic<String> g1 = new Generic<String>("Vijay Kumar");
        System.out.println("The Class Name is "+ g1.getClass().getName());
        g1.show();
        String str = g1.getObj();
        System.out.println("The value of String is "+g1.getObj());

        Generic<Integer> g2 = new Generic<Integer>(10);
        System.out.println("The Class Name is "+ g2.getClass().getName());
        g2.show();
        Integer n = g2.getObj();
        System.out.println("The value of Integer is "+n);

        Generic<Double> g3 = new Generic<Double>(10.5);
        System.out.println("The Class Name is "+ g3.getClass().getName());
        g3.show();
        Double d = g3.getObj();
        System.out.println("The value of Double is "+d);
    }
}
