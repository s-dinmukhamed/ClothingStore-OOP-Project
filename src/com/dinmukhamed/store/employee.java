package com.dinmukhamed.store;

public class employee {
    //private fields
    private int employee_id;
    private String employee_name;
    private double paycheck;
    private int taken_order_id;

    //Constructor
    public employee(int employee_id, String employee_name, double paycheck, int taken_order) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.paycheck = paycheck;
        this.taken_order_id = taken_order_id;
    }

    //Getters
    public int getEmployee_id() {return employee_id;}
    public String getEmployee_name() {return employee_name;}
    public double getPaycheck() {return paycheck;}
    public int getTaken_order() {return taken_order_id;}

    //Setters
    public void setEmployee_id(int employee_id) {this.employee_id = employee_id;}
    public void setEmployee_name(String employee_name) {this.employee_name = employee_name;}
    public void setPaycheck(double paycheck) {this.paycheck = paycheck;}
    public void setTaken_order(int taken_order_id) {this.taken_order_id = this.taken_order_id;}

    //methods


    //to String
    @Override
    public String toString() {
        return "Employees{Employee id = " + employee_id + ", Employee name = " + employee_name + ", Paycheck " + paycheck + ", Taken Order id = " + taken_order_id + "}";
    }
}
