public class Employee {
    int ecode;
    double basicSalary, hra, da, netSalary, grossSalary, pf;
    Employee(){
        ecode = 0;
        basicSalary = 0.0;
        hra = 0.0;
        da = 0.0;
        netSalary = 0.0;
        grossSalary = 0.0;
        pf = 0.0;
    }
    Employee(int e, double bs){
        ecode = e;
        basicSalary = bs;
    }
    double calNetSal(){
        hra = 0.2 * basicSalary;
        da = 1.27 * basicSalary;
        grossSalary = basicSalary + hra + da;
        pf = 0.05 * grossSalary;
        netSalary = grossSalary - pf;
        return netSalary;
    }
    double calNetSal(double basicSalary){
        hra = 0.2 * basicSalary;
        da = 1.27 * basicSalary;
        grossSalary = basicSalary + hra + da;
        pf = 0.05 * grossSalary;
        netSalary = grossSalary - pf;
        return netSalary;
    }
    void display(){
        System.out.println("Employee Code: "+ecode);
        System.out.println("Net Salary: "+netSalary+"\n");
    }
    public static void main(String args[]){
        Employee emp1 = new Employee(42, 1000);
        Employee emp2 = new Employee();
        emp1.calNetSal();
        emp2.calNetSal();
        emp1.display();
        emp2.display();
    }
}
