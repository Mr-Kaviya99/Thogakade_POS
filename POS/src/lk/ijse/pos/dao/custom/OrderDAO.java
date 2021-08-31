package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Item;
import lk.ijse.pos.model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface OrderDAO extends SuperDAO<Orders,String> {

}