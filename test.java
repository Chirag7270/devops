public class test{

    void verify(){
        int age = 20;
        if(age < 18){
            System.out.println("No,You are not eligible to vote");
        }else if(age>=18)
        {
            System.out.println("Yes,You are eligible to vote");
        }
    }
    public static void main(String[] args){
        System.out.println("This is a test file");
        int age = 20;
        String name = "Chirag";
        System.out.println("My name is "+name+" and "+"my age is "+age);
    }
}