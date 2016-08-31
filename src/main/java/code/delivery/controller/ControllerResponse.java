package code.delivery.controller;

import java.io.Serializable;

/**
 * Created by joao on 31/08/16.
 */
public class ControllerResponse implements Serializable {

    private String message;
    private Object data;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
