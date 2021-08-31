package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.OrderDetailsDAO;
import lk.ijse.pos.model.OrderDetails;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class OrderDetailsDAOImpl implements OrderDetailsDAO {

    @Override
    public boolean add(OrderDetails oDetails) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO OrderDetails VALUES (?,?,?,?)", oDetails.getOrderId(), oDetails.getItemCode(), oDetails.getQty(), oDetails.getUnitPrice());
    }

    @Override
    public boolean update(OrderDetails entity) throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }

    @Override
    public boolean delete(String s) throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }

    @Override
    public OrderDetails search(String s) throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }

    @Override
    public ArrayList<OrderDetails> getAll() throws Exception {
        throw new UnsupportedOperationException("This feature is not supported yet");
    }
}
