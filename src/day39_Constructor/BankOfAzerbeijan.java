package day39_Constructor;

import day37_CustomClass.Employee;
import day39_Constructor.HumanResources;

import java.util.ArrayList;

public class BankOfAzerbeijan {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(HumanResources.employee1);
        employees.add(HumanResources.employee2);
    }
}
