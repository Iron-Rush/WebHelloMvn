public class HelloWorld {
    public static void main(String[] args){
        System.out.println("HelloWorld");
        System.out.println("Hi Man");
        System.out.println("Nice To Meet You");
        countNum();
        HelloWorld hw = new HelloWorld();


    }
    public static void countNum(){
        double num = CountTools.add(9.99,0.01);
        System.out.println(num);
    }
}
