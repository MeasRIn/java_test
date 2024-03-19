package java_midterm;
import java.util.Scanner;

public class Lecturer {
       private int id;
       private String name;
       private double salary;
       private float rate;
       private float hour;
       
       // Manager methods
       
       public Lecturer(){
           this.id = 0;
           this.name = null;
           this.salary = 0f;
           this.rate = 0f;
           this.hour = 0f;
       }
       
       public Lecturer(int id,String name,float salary,float rate,float hour){
             this.hour = hour;
             this.name = name;
             this.id = id;
             this.rate = rate;
             this.salary = salary;
       }
       
       // end Manager methods      
       // setter 
       public void setName(String name){
           this.name = name;
       }
       
       public void setSalary(float Salary){
           this.salary = Salary;
       }
       // Accessor
       public int getId(){
           return id;
       }
       
       public String getName(){
           return name;
       }
       
       public double getSalary(){
           return salary;
       }
       
       public float getRate(){
           return rate;
       }
       
       public float getHour(){
           return hour;
       }
       
       public double getIncome(){
           return rate*hour;
       }
       
       // Help methods
       
       public void input(){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Your id -> "); id = cin.nextInt();
        System.out.println("Enter Your name -> "); name = cin.nextLine(); cin.nextLine();
        System.out.println("Enter Your rate -> "); rate = cin.nextFloat();
        System.out.println("Enter Your hour -> "); hour = cin.nextFloat();
       }
       
       public void Output(){
        System.out.println("Your id -> " + id);
        System.out.println("Your name -> " + name);
        System.out.println("Your rate -> " + rate); 
        System.out.println("Your hour -> " + hour);          
       }
}
