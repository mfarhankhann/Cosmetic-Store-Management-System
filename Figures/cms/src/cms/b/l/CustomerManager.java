/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.b.l;

import cms.bl.common.CustomerDTO;
import cms.bl.common.Response;
import cms.bl.validators.CustomerValidator;
import database.DAL;

/**
 *
 * @author Mukhtiar
 */
public class CustomerManager {

    private DAL objDal;
    
    public CustomerManager(){
        objDal = new DAL();
    }
    
    public Response saveCustomer(CustomerDTO customerDTO) {
        CustomerValidator objCustomerValidator = new CustomerValidator();
        Response obResponse = objCustomerValidator.isValidCustomerDTO(customerDTO);
        if(obResponse.IsSuccessful())
        {
            obResponse = objDal.saveCustomerInDB(customerDTO);
        }
        return obResponse;
    }
    
}
