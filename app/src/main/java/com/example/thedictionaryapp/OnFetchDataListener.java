package com.example.thedictionaryapp;

import com.example.thedictionaryapp.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);

}
