package com.vigfoot.lockey.vo;

import lombok.Builder;

@Builder
public class Response {
    private String method;
    private String salt;
    private String input;
    private String output;

}