public class p10 {
    public static void main(String args[]){
        String str = new String("Hello");
        str.concat(" World!");

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");

        System.out.println(str);
        System.out.println(sb);
    }
}

/*
D:\Java Programs\HelloWorld\src>java p10
        Hello
        Hello World!
*/
