package com.example.android.mvpappinventory.data;

import com.example.android.mvpappinventory.Model.Inventory;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface InventoryDao {
    @Insert
    void insert(Inventory inventory);

    @Update
    void update(Inventory inventory);

    @Delete
    void delete(Inventory inventory);

    @Query("DELETE FROM inventory_table")
    void deleteAllInventories();

    @Query("SELECT * FROM inventory_table ORDER BY price DESC")
    LiveData<List<Inventory>> getAllInventories();
}