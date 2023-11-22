package com.vigfoot.lockey.route;

import com.vigfoot.lockey.vo.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class LockeyRouter {

    Mono<Response> responseMono(){
        return Mono.empty();
    }

}