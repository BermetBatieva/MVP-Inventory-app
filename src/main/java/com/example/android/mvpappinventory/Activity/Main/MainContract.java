package com.example.android.mvpappinventory.Activity.Main;
import com.example.android.mvpappinventory.Model.Inventory;

public interface MainContract {
    interface Presenter {
        void insert(Inventory inventory);
        void update(Inventory inventory);
        void delete(Inventory inventory);
        void deleteAllInventories();
    }

    interface View {

    }
}