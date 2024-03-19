package java_midterm;

public class Java_Midterm {
        static Lecturer lect = new Lecturer();
    
        public static void main(String[] args) {
        // Parameter Constructor in by parameter
        lect = new Lecturer(01,"YannVanneth",400,5,20);
        System.out.println(lect);
        
        // Input from keyboard
        lect.input();
        
        // Output Data
        lect.Output();
        
        // with accessor
        
        lect.setName("vanneth");
        lect.setSalary(600);
        
        System.out.println("Your Name "+lect.getName());
        System.out.println("Your Salary : "+lect.getSalary());
        
        int Tax = 0;
        
        if(lect.getIncome() <= 120){
           Tax = 0;
        }else if(lect.getIncome() > 120 && lect.getIncome() <= 350){
            Tax = 2;
        }else if(lect.getIncome() > 350 && lect.getIncome() <= 500){
            Tax = 5;
        }else if(lect.getIncome() > 500 && lect.getIncome() <= 1000){
            Tax = 10;
        }else if(lect.getIncome() > 1000){
            Tax = 15;
        }
        
        System.out.println("Lecturer Name : "+lect.getName());
        System.out.println("Income : "+lect.getIncome());
        System.out.println("Tax : "+Tax);
        
        double TaxPrice = lect.getIncome()*Tax;
        double AfterTaxPrice = lect.getIncome()-TaxPrice;
        System.out.println("Money : "+AfterTaxPrice);
    }

    
}
