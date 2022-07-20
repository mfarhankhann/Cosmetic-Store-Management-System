package database;
 
        import java.sql.*; //Importing java.sql package
 
        public class MyConnection {
 
            public static void main(String[] args) {
                try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "pakistan69");//Establishing connection
                    System.out.println("Connected With the database successfully"); //Message after successful connection
 
            } catch (SQLException e) {
 
                    System.out.println("Error while connecting to the database"); //Message if something goes wrong while conneting to the database
 
                            }
            }

    MyConnection(String jdbcmysqllocalhost3306cms, String root, String pakistan69) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



 

  
 
        }