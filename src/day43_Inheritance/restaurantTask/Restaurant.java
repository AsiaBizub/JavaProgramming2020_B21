package day43_Inheritance.restaurantTask;

import java.util.ArrayList;

public class Restaurant {

    public static boolean hasKitchen;
    public static boolean hasCashier;

    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner){
        this.owner =owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    static{
        hasCashier= true;
        hasKitchen = true;

    }




}
