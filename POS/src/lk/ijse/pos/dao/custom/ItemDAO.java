package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Item;


import java.util.ArrayList;

public interface ItemDAO extends SuperDAO<Item, String> {
    boolean updateItemQtyOnHand(String code, int qtyOnHand) throws Exception;
}