package com.mphasis.payroll.entities;

public class HR {
    public Employee recruit(char empType){
        if(empType == 'I' || empType == 'i'){
           return new Employee(){      //Annonymous Class

               @Override
               public void netPay() {
                   System.out.println("Stipend");
               }
           };
        }else if(empType == 'P' || empType=='p'){
            return new Employee(){      //Annonymous Class

                @Override
                public void netPay() {
                    System.out.println("Permanent Employee's Salary");
                }
            };
        }else if(empType == 'C' || empType=='c'){
            return new Employee(){      //Annonymous Class

                @Override
                public void netPay() {
                    System.out.println("Contract Employee's Pay");
                }
            };
        }
        return null;
    }
}
