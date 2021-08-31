package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.model.Item;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface ItemDAO extends SuperDAO<Item, String> {
    boolean updateItemQtyOnHand(String code, int qtyOnHand) throws Exception;
}
