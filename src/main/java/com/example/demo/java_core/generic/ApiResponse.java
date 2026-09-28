
package com.example.demo.java_core.generic;


public class ApiResponse<T> {

    private int status;
    private String message;
    private T data;

    public ApiResponse(
        int status,
        String message,
        T data
    ) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public <O> getReponse() {
        return {
            status,
            message,
            data
        }
    }


}


