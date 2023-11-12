public class DataBaseCompany {
    private static Employee[] employees;
    private int size;

    public DataBaseCompany() {
        this.employees = new Employee[10];
    }
    public void printAllInformation() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public void addEmpoyee(String fullName, int depar, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника");
        }

        Employee newEmployee = new Employee(fullName, depar, salary);
        employees[size++] = newEmployee;
    }

    public void printAllInfo() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public void printAllEmployeesFullNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public void calculateSalary() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма всех трат " + sum + " рублей");

    }

    public void minimalSalaryWorker() {
        Employee minimalSalaryWorker = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < minimalSalaryWorker.getSalary()) {
                minimalSalaryWorker = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minimalSalaryWorker.getFullName());
    }

    public void maximalSalaryWorker() {
        Employee maximalSalaryWorker = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > maximalSalaryWorker.getSalary()) {
                maximalSalaryWorker = employees[i];
            }

        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maximalSalaryWorker.getFullName());
    }

    public void indexSalary() {
        int percent = 25;
        for (int i = 0; i < size; i++) {
            employees[i].setSalary(employees[i].getSalary() * percent / 100 + employees[i].getSalary());
        }
    }

    public void averSalary() {
        double averSalary = 0;
        for (int i = 0; i < size; i++) {
            averSalary += employees[i].getSalary();
        }
        averSalary = averSalary / size;
        System.out.println("Средняя сумма зарплат " + averSalary);
    }


    public void minSalary(int depart) {
        Employee minSalary = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == depart) {
                minSalary = employees[i];
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == depart && employees[i].getSalary() < minSalary.getSalary()) {
                minSalary = employees[i];
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой в " + depart + " отделе: " + minSalary.getFullName());

    }

    public void maxSalary(int depart) {
        Employee maxSalary = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == depart) {
                maxSalary = employees[i];
                break;
            }
            for (int i1 = 0; i1 < size; i1++) {
                if (employees[i].getDepart() == depart && employees[i].getSalary() > maxSalary.getSalary()) {
                    maxSalary = employees[i];
                }

            }

        }
        System.out.println("Сотрудник с наиибольшей зарплатой в " + depart + " отделе: " + maxSalary.getFullName());

    }
    public void departCosts(int depart) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == depart) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма трат на зарплаты за месяц в " + depart + " отделе: " + sum + " рублей");
    }
    public void findAverageSalaryOfDepartment(int department ){
        double sum = 0;
        int depart = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == department) {
                sum += employees[i].getSalary();
                depart++;
            }

        }
        sum = sum / depart;
        System.out.println("Средняя зарплата в " + department + " отделе: " + sum + " рублей");
    }
    public void indexSalaryOfDepartment(int percen, int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == department) {
                employees[i].setSalary(employees[i].getSalary() * percen / 100 + employees[i].getSalary());
            }
        }
    }
    public void printAllInformationOfDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == department) {
                System.out.println(employees[i].toString());
            }
        }

    }


    public void calculateSalaryOfDepartment(int department) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepart() == department) {
                sum += employees[i].getSalary();
            }
        }
    }

    public void findWorkersWithSalaryBelowParameter(int salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("Сотрудник с зарплатой меньше " + salary + ": " + "id " + employees[i].getId() + ", " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей");
            }
        }
    }

    public void findWorkersWithSalaryHigherParameter(int salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println("Сотрудник с зарплатой больше " + salary + ": " + "id " + employees[i].getId() + ", " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей");
            }
        }
    }
}
