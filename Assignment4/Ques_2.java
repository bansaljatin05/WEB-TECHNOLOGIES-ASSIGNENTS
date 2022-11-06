package Assignment4;
class Employee{

    String Name;
    int Year;
    String Address;
    Employee(String name,int years, String address) {
       this.Name = name;
       this.Year = years;
       this.Address = address;
    }

    void print_details()
    {
        System.out.println(this.Name+ "      " +this.Year + "            "     +this.Address);
    }


}
public class Ques_2 {
    public static void main(String args[])
    {
        System.out.println("Name" +   "    Year of Joining     " + "Address" );

        Employee e1=new Employee("Robert", 1994, "64C-WallsStreat");

        e1.print_details();

        Employee e2=new Employee("Sam", 2000, "68D-WallsStreat");

        e2.print_details();

        Employee e3=new Employee("John", 1999, "26B-WallsStreat");

        e3.print_details();

    }
}
