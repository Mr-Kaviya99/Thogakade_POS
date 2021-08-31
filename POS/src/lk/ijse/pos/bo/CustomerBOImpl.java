package lk.ijse.pos.bo;

import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.model.Customer;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CustomerBOImpl {

    /* Property Injection*/
    private final CustomerDAO customerDAO = new CustomerDAOImpl();

    public boolean addCustomer(Customer customer) throws Exception {
        return customerDAO.add(customer);
    }

    public boolean deleteCustomer(String id) throws Exception {
        return customerDAO.delete(id);
    }

    public boolean updateCustomer(Customer customer) throws Exception {
        return customerDAO.update(customer);
    }

    public Customer searchCustomer(String id) throws Exception {
        return customerDAO.search(id);
    }

    public ArrayList<Customer> getAllCustomers() throws Exception {
        return customerDAO.getAll();
    }


}
