package com.mphasis.main.cui;

import com.mphasis.payroll.entities.*;

public class Main {

    public static void display(Employee[] employees){
        Finance finance = new Finance();
        for(Employee employee:employees) {
            finance.processSalary(employee);
        }
    }

    public static void main(String[] args) {
        HR hr = new HR();
        Employee[] employees = new Employee[3];
        employees[0] = hr.recruit('p');
        employees[1] = hr.recruit('I');
        employees[2] = hr.recruit('c');

        display(employees);

    }
}
