package aconstr;
public class Acon {
    private int id;
    private String Firstname;
    private String Lastname;
    private int Salary;

    public Acon(int id,String firstname,String lastname,int salary){
        this.id=id;
        this.Firstname=firstname;
        this.Lastname=lastname;
        this.Salary=salary;
    }
    public int getId(){
        return this.id;
    }
    public String getfirstName(){
        return this.Firstname;
    }
    public String getLastname(){
        return this.Lastname;
    }
    public int getsalar(){
        return this.Salary;
    }
    public String getname(){
        return this.Lastname+" "+this.Firstname;
    }
    public void setSalary(int salary){
        this.Salary=salary;
    }
    public int Annualsalar(){
        return this.Salary*12;
    }
    public int rastsalary(int percent){
        return (Salary*percent)/100+Salary;
    }
    
    public String tostring(){
        return "your id:"+this.id+",name:"+this.Firstname+",lastname:"+this.Lastname+"salary"+this.Salary;
    }
     
}
