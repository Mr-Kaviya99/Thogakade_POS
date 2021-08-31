package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.OrderDAO;
import lk.ijse.pos.model.Item;
import lk.ijse.pos.model.Orders;

import java.util.ArrayList;


public class OrderDAOImpl implements OrderDAO {

    @Override
    public boolean add(Orders orders) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES (?,?,?)", orders.getId(), orders.getDate(), orders.getCustomerId());
    }

    @Override
    public boolean update(Orders entity) throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }

    @Override
    public boolean delete(String s) throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }

    @Override
    public Orders search(String s) throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }

    @Override
    public ArrayList<Item> getAll() throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }





}