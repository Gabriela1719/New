package com.agency04.sbss.pizza.Exception;

public class PizzaErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public  PizzaErrorResponse(){}
    public PizzaErrorResponse(int status, String message, long timeStamp)
    {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
