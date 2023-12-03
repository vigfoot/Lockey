package com.vigfoot.lockey.route;

import com.vigfoot.lockey.service.DecryptionService;
import com.vigfoot.lockey.service.EncryptionService;
import com.vigfoot.lockey.vo.Input;
import com.vigfoot.lockey.vo.Output;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class LockeyRouter {

    private final DecryptionService decryptionService;
    private final EncryptionService encryptionService;


    @GetMapping("enc/{method}/{salt}/{input}")
    Mono<Output> responseMono(@PathVariable("method") String method
            , @PathVariable("salt") String salt
            , @PathVariable("input") String input) {
        final String output = encryptionService.encode(method, salt, input);

        return Mono.empty();
    }

}