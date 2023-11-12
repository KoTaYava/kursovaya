public class Main {
    public static void main(String[] args) {
        DataBaseCompany dataBaseCompany = new DataBaseCompany();
        dataBaseCompany.addEmpoyee("Лосев Владимир Георгиевич", 1, 130000);
        dataBaseCompany.addEmpoyee("Никулинаа Анна Павловна",2,35000);
        dataBaseCompany.addEmpoyee("Кокунов Дмитрий Иванович",1,500000);
        dataBaseCompany.printAllInfo();
        dataBaseCompany.printAllEmployeesFullNames();
        dataBaseCompany.calculateSalary();
        dataBaseCompany.minimalSalaryWorker();
        dataBaseCompany.maximalSalaryWorker();
        dataBaseCompany.indexSalary();
        dataBaseCompany.averSalary();
        dataBaseCompany.minSalary(1);
        dataBaseCompany.maxSalary(2);

        dataBaseCompany.departCosts(1);
        dataBaseCompany.findAverageSalaryOfDepartment(1);
        dataBaseCompany.indexSalaryOfDepartment(10,1);
        dataBaseCompany.printAllInformation();
        dataBaseCompany.printAllInformationOfDepartment(1);
        dataBaseCompany.findWorkersWithSalaryBelowParameter(45000);
        dataBaseCompany.findWorkersWithSalaryHigherParameter(250000);
    }
}