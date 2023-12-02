package com.vigfoot.lockey.vo;

import lombok.Builder;

@Builder
public class Input {
    private String method;
    private String salt;
    private String input;
}