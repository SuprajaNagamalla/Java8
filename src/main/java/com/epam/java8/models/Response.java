package com.epam.java8.models;

public class Response {
    private String body;
    private int statusCode;
    private String contentType;

    public Response(String body, int statusCode, String contentType) {
        this.body = body;
        this.statusCode = statusCode;
        this.contentType = contentType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "Response {body=" + body + ", statusCode=" + statusCode + ", contentType=" + contentType + "}";
    }
}
