package com.vigfoot.lockey.service;

import reactor.core.publisher.Mono;

public class ValidationService {

    public static Mono<Boolean> isAllowedMethod(String methodStr) {
        return Mono.empty();
    }
}
