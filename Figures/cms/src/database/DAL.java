/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import cms.bl.common.CustomerDTO;
import cms.bl.common.Response;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mukhtiar
 */
public class DAL {
    public MyConnection objDBConnection = new MyConnection ("jdbc:mysql://localhost:3306/cms", "root", "pakistan69");
    
    public Response saveCustomerInDB(CustomerDTO customerDTO) {
        Response objResponse = new Response();
            try {
                
            
//            The following commented code allows SQL injection attack
//            Statement stmt = objConnection.createStatement();                           
//            String SQLInsertQuery = "Insert into tbl_StudentMarks(TeacherName,SubjectName,Total, Title, QuizDate,Std1, Std2, Std3,Std4) "
//                    + "Values('"+marksDTO.TeacherName+"','"+marksDTO.SubjectName+"',"+marksDTO.Total+",'"+marksDTO.Title+"','"+marksDTO.Date+"'"
//                    + ","+marksDTO.Std1+","+marksDTO.Std2+","+marksDTO.Std3+","+marksDTO.Std4+")";            
//            int recordsInserted = stmt.executeUpdate(SQLInsertQuery);  
            
            // SQL Injection Free Code
            PreparedStatement prepStmt = objConnection.prepareStatement("Insert into customer_details(customer_id,username,password, customer_name, email,address, phone_number) Values(?,?,?,?,?,?,?)");
            prepStmt.setString(1, CustomerDTO.customer_id);
            prepStmt.setString(2, CustomerDTO.username);
            prepStmt.setString(3, CustomerDTO.password);
            prepStmt.setString(4, CustomerDTO.customer_name);
            prepStmt.setString(5, CustomerDTO.email);
            prepStmt.setString(6, CustomerDTO.address);
            prepStmt.setString(7, CustomerDTO.phone_number);
            prepStmt.execute();
            
            
            boolean isRecordInsterted = prepStmt.execute();  
            if(isRecordInsterted)
            {
              objResponse.addInformationMessage("customer registered successfully.");
            }
            else
            {
                objResponse.addInformationMessage("Failed to register customer in database.");
            }
            objConnection.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            objResponse.AddErrorMessage("Failed to register customer due to: "+e.getMessage());
        }
            return objResponse;
    }

    private static class objConnection {

        private static PreparedStatement prepareStatement(String insert_into_customer_detailscustomer_idus) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public objConnection() {
        }
    }
    
}
