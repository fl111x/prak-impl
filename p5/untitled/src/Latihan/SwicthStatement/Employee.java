package Latihan.SwicthStatement;

public class Employee {
    /*
    kode yang salah
    int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new Exception("Incorrect Employee");
        }
    }

     */

    /*
    kode yang benar
    class EmployeeType {
        abstract int payAmount(Employee emp);
    }
    class Salesman {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getCommission();
        }
    }
    class Manager {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getBonus();
        }
    }

     */
}
