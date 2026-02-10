package com.example.AssingmentProject.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class UserDataset {
    private String userid;
    private int value;

    public String getUserID() {
        return userid;
    }
    public void setUserID(String userid) {
        this.userid = userid;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
