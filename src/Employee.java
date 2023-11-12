public class Employee {
        private String fullName;
        private int depart;
        private int salary;
         int id;
    public static int idCounter = 0;

    public Employee(String fullName, int depart, int salary) {
        this.fullName = fullName;
        this.depart = depart;
        this.salary = salary;
        idCounter++;
        id = idCounter;

    }
    public String getFullName(){
        return this.fullName;
    }
    public int getDepart(){
        return this.depart;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getId(){
        return id;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Сотрудник: " + fullName +
                ", отдел: " + depart +
                ", зарплата: " + salary + " рублей" +
                ", id: " + id;
    }

}

