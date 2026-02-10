package com.example.AssingmentProject.data;

import java.util.UUID;

public class PostDataset {
    private String status;
    private String requestID;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestID() {
        return requestID;
    }
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public void setStatus(boolean status) {
        if (status) {
            this.status = "SUCCESS";
        } else {
            this.status = "FAILURE";
        }
        UUID uuid = UUID.randomUUID();
        this.requestID = uuid.toString();
    }
}
