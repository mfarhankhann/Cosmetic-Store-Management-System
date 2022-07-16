/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.b.l;

import cms.bl.common.CustomerDTO;
import cms.bl.common.Response;

/**
 *
 * @author Mukhtiar
 */
public class CMSController {
CustomerManager objCustomerManager = new CustomerManager();
    public Response saveCustomer(CustomerDTO customerDTO) {
        return objCustomerManager.saveCustomer(customerDTO);
    }
    
}
