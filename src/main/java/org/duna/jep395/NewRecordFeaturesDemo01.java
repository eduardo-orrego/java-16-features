package org.duna.jep395;

//record class
record PersonRecord(String name, int dni) { }

public class NewRecordFeaturesDemo01 {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("Eduardo", 43536585);
        System.out.printf("name=%s, dni=%s %n",personRecord.name(),personRecord.dni());

        //local record class
        record EmployeeRecord(String dni, double sales) { }
        EmployeeRecord employeeRecord = new EmployeeRecord("Mahesh", 22);
        System.out.printf("dni=%s, sales=%s",employeeRecord.dni(),employeeRecord.sales());
    }
}
