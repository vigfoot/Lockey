package com.vigfoot.lockey.route;

import com.vigfoot.lockey.service.EncryptionService;
import com.vigfoot.lockey.service.ValidationService;
import com.vigfoot.lockey.vo.Input;
import com.vigfoot.lockey.vo.Output;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class LockeyRouter {

    private final EncryptionService encryptionService;


    @GetMapping("/{method}/{input}")
    Mono<Output> responseMono(@PathVariable("method") String method, @ModelAttribute Input input) {
        return ValidationService.isAllowedMethod(method)
                .map(isAllowedMethod -> isAllowedMethod
                        ? encryptionService.encode(method, input)
                        : Output.builder().build());
    }
}