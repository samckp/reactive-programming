package com.reactive.poc.router;

import com.reactive.poc.handler.GreetHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
@Slf4j
public class GreetRouter {

    @Bean
    public RouterFunction<ServerResponse> greetUser(GreetHandler greetHandler){

        log.info("greetUser method is executing !!");
        return RouterFunctions.route(RequestPredicates.GET(
                "/greet").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                greetHandler::greet);
    }

}
