/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.bl.validators;

import cms.bl.common.CustomerDTO;
import cms.bl.common.Response;

/**
 *
 * @author Mukhtiar
 */
public class CustomerValidator {

    public Response isValidCustomerDTO(CustomerDTO customerDTO) {
        Response objRespone = new Response();
        if(!isValidusername(customerDTO.username))
        {
            objRespone.AddErrorMessage("Invalid username found. The length of title should be more than 3 and less than 50.");
        }
        //TODO: Perform remaining validations
        
        return objRespone;
    }

    private boolean isValidusername(String username) {
        if(username == null || username.length() < 3 || username.length() > 50 || username.equals(""))
            return false;
        return true;
    }
    
}
