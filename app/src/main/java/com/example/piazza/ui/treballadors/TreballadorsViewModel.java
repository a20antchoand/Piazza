package com.example.piazza.ui.treballadors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TreballadorsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TreballadorsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragment dels treballadors.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}