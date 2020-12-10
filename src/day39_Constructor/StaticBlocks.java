package day39_Constructor;

import day37_CustomClass.Employee;

public class StaticBlocks {
    public static String company ;
    public static Employee employee1 ;
    public int a;
    public static int b;
    public static boolean isEmployed;


    // xcelSheet

    static{ //only accepts static
        company = "Capital One";
        isEmployed = true;
        //employee1.new Employee();
        employee1.setInfo("Asia", company, "SDET", "A123", "Female", 40, 65);

        //a = 100;
        b = 200;

    }

}
