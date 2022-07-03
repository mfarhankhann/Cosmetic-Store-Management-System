/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_access_layer;


import Controller.StockController;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author OSL
 */
public class DatabaseManager {
        DatabaseReader reader;
    RecordMapper mapp;
     Iconnection connect;
    
   private String Query;
   
     
    public DatabaseManager(){
        connect=new SqlConnection("jdbc:mysql://localhost:3306/stocks","root","");
       this.mapp=new RecordMapper();
  reader=new DatabaseReader();
    }
            
   public void getquery(String Query){
   
   this.Query=Query;
   
   }
public ArrayList<RecordMapper.StockRecord> getlist(String query){

Connection dbconn =connect.getConnection();
ResultSet rs =reader.getRecord(Query,dbconn);

return mapp.getStocks(rs);
    
}
}
