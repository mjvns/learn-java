import java.util.*;
class p8 {
    public static void main(String args[]){
        ArrayList<String> l = new ArrayList<String>();// correct
        List<String> l1 = new ArrayList<String>(); // correct
        Collection<String> l2= new ArrayList<String>(); //correct
        //ArrayList<Object> l3= new ArrayList<String>(); this statement is not valid since polymorphism is only for Base Type and not for Parameter Type
    }
}
