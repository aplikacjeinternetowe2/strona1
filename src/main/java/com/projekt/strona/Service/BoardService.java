package com.projekt.strona.Service;

import com.projekt.strona.Dao.BoardDao;
import com.projekt.strona.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BoardService {
    @Autowired
    private BoardDao boardDao;

    public void addItem(String itemName, String itemDescription, String itemPrice, String userName) {
        boardDao.addItem(itemName,itemDescription,itemPrice,userName);
    }

    public Collection<Item> showItems() {
        return this.boardDao.showItems();
    }

    public Item showItemDescription(int id) {
        return this.boardDao.showItemDescription(id);
    }

    public int getMaxItemId() {
        return this.boardDao.getMaxItemId();
    }
}
