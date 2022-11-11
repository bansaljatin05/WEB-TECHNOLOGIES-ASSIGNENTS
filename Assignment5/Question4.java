package assignment5;
// question 4 : "YES" the following code snippet will run and the output will be 24
// as "a" is a static variable and at creation of each object its value is incremented
// in the constructor and when obj3.m1() is called its incremented one more time
public class Question4 {
    static int a = 20;
    Question4() {
        a++;
    }
    void m1() {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Question4 obj = new Question4();
        Question4 obj2 = new Question4();
        Question4 obj3 = new Question4();
        obj3.m1();
    }
}
