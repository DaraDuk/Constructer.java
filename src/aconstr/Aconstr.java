package aconstr;
public class Aconstr {
    public static void main(String[] args) {
        // TODO code application logic here
       
       Acon emp = new Acon(5,"duk","dara",200);
       
        System.out.println("Slary:"+emp.toString());
       System.out.println("Name:"+emp.getId());
       System.out.println("Name:"+emp.getfirstName());
       System.out.println("Lastname:"+emp.getLastname());
       System.out.println("Salary:"+emp.getsalar());
        System.out.println("Annual:"+emp.Annualsalar());
       System.out.println("Rastsalary:"+emp.rastsalary(10));
       
      
       
        
    }
    
}
