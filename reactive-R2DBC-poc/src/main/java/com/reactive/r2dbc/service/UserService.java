package com.reactive.r2dbc.service;

import com.reactive.r2dbc.model.User;
import com.reactive.r2dbc.repository.DepartmentRepository;
import com.reactive.r2dbc.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.List;
import java.util.function.BiFunction;

@Service
@Slf4j
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public Mono<User> createUser(User user){
        return userRepository.save(user);
    }
}
