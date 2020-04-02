package com.example.robotic.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FilesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FilesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Files fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}