package com.example.android.mvpappinventory.Activity.Editor;


import android.app.Application;
import  com.example.android.mvpappinventory.Model.Inventory;
import com.example.android.mvpappinventory.Repository.InventoryRepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class EditorPresenter extends AndroidViewModel implements EditorContract.Presenter {
    private InventoryRepository repository;
    LiveData<Inventory> inventoryLiveData;

    public EditorPresenter(@NonNull Application application) {
        super(application);
        repository = new InventoryRepository(application);
    }

    @Override
    public void update(Inventory inventory) {
        repository.update(inventory);
    }

}