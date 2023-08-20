//Our component class will be Employee interface.

public interface Employee {
    void showDetails();
}


//Leaves will be the below classes..Developer/QA/Manager/CEO


public class CEO implements Employee {
    private final String name;
    private final String dept;
    private final String job;

    public CEO(String name, String dept, String job) {
        this.name = name;
        this.dept = dept;
        this.job = job;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CEO{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

-------------------------------------------------------------------------------------------------------------

  import java.util.List;

public class Developer implements Employee {
    private final String name;
    private final String dept;
    private final String job;

    public Developer(String name, String dept, String job) {
        this.name = name;
        this.dept = dept;
        this.job = job;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}


------------------------------------------------------------------------------------

  public class QA implements Employee {

    private final String name;
    private final String dept;
    private final String job;

    public QA(String name, String dept, String job) {
        this.name = name;
        this.dept = dept;
        this.job = job;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "QA{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}


---------------------------------------------------------------------------------------------------


  //Now we need a Composite class which holds our employees.


  public class CompanyDirectory implements Employee {

    private final List<Employee> employees;

    public CompanyDirectory() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

}



//create a Company class which is again a Composite type and having a name property additionally.



public class Company extends CompanyDirectory {
    private final String name;

    public Company(String name) {
        this.name = name;
    }

    public void showCompanyName() {
        System.out.println("Company: " + name);
    }
}

-----------------------------------------------------------------------


  //CompositeDemo



  public class CompositeDemo {

    public static void main(String[] args) {

        CEO ceo = new CEO("Andrew", "COM", "Chief Executive Officer");

        Developer developer1 = new Developer("salitha", "ENG", "Software Engineer");
        Developer developer2 = new Developer("Jhon", "ENG", "Senior Software Engineer");
        QA qe1 = new QA("Tom", "ENG", "Quality Assurance Engineer");
        QA qe2 = new QA("Jimmy", "ENG", "Quality Assurance Lead");

        Manager manager = new Manager("Peter", "HR", "HR Manager");
        Manager executive = new Manager("Derik", "HR", "Senior HR Executive");

        CompanyDirectory engDepartment = new CompanyDirectory();
        engDepartment.addEmployee(developer1);
        engDepartment.addEmployee(developer2);
        engDepartment.addEmployee(qe1);
        engDepartment.addEmployee(qe2);

        CompanyDirectory hrDepartment = new CompanyDirectory();
        hrDepartment.addEmployee(manager);
        hrDepartment.addEmployee(executive);

        Company company = new Company("XYZ");
        company.addEmployee(ceo);
        company.addEmployee(engDepartment);
        company.addEmployee(hrDepartment);
        company.showCompanyName();
        company.showDetails();

    }

}
