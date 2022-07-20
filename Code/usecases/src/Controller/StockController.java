/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Data_access_layer.DatabaseManager;
import java.util.ArrayList;

/**
 *
 * @author OSL
 */
public class StockController {
     DatabaseManager dm;
   public StockController(){

        dm=Scontroller.getInstanceOfDatabaseManager();
    }

    public void viewstock(String query) {
       dm.getlist(query);
       
    }


    public static class Stock {

        public Stock() {
        }
    }

}

 

        


 

        


    

