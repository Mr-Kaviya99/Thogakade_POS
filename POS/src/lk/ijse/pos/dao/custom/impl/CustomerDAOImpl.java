package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.model.Customer;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(Customer customer) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?)", customer.getcID(), customer.getName(), customer.getAddress(), 0);
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET name=?, address=? WHERE id=?", customer.getName(), customer.getAddress(), customer.getcID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE id=?", id);
    }

    @Override
    public Customer search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer where id=?", id);
        if (rst.next()) {
            return new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"));
        }
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<Customer> alCustomers = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
            alCustomers.add(customer);
        }
        return alCustomers;
    }

}
