public class tester {
    public static void main(String[]args){
        IntSet s1 = new IntSet();
        s1.add(5);
        s1.add(4);
        System.out.println("--------------------");
        System.out.println(s1.repOk());
        System.out.println("--------------------");
        s1.add(3);
        s1.add(2);
        s1.add(1);
        s1.add(5);
        System.out.println("--------------------");
        System.out.println(s1.repOk());
        System.out.println("--------------------");
        

    }
}
