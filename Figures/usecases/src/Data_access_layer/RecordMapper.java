/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;


import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RecordMapper {
    
    
     ArrayList<StockRecord> getStocks(ResultSet rs) {
        ArrayList<StockRecord> stklist = new ArrayList<StockRecord>();
        try{
      
        while (rs.next())
            {
                StockRecord objSto=new StockRecord();                
                objSto.id=rs.getInt("id");
                 objSto.itemName=rs.getString("itemName");
                 objSto.price=rs.getInt("price");
                 objSto.quantity=rs.getInt("quantity");
                 objSto.price=rs.getInt("price");
                 
                stklist.add(objSto);
            }
        }catch (SQLException e){
            System.out.println(" error in getstock"+e.getMessage());
        }
        return stklist;
    }


    public static class StockRecord {

        public int id;
        public String itemName;
        public int stock;
        public int quantity;
        public int price;
        

  
    }
    
    
    
}