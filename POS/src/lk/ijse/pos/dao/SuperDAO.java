package lk.ijse.pos.dao;

import lk.ijse.pos.model.Item;

import java.util.ArrayList;

public interface SuperDAO<T,ID> {
    boolean add(T entity)throws Exception;
    boolean update(T entity)throws Exception;
    boolean delete(ID id)throws Exception;
    T search(ID id)throws Exception;
    ArrayList<Item> getAll()throws Exception;
}