package com.example.dvfa;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.LayoutInflater;

public class SecureInputMethodService extends InputMethodService {

    @Override
    public View onCreateInputView() {
        LayoutInflater inflater = getLayoutInflater();
        return inflater.inflate(R.layout.secure_keyboard, null);
    }
}
