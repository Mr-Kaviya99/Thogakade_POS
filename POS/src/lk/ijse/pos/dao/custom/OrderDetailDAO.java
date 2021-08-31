package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.OrderDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface OrderDetailDAO extends SuperDAO<OrderDetails, String> {

}