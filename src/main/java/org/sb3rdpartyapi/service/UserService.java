package org.sb3rdpartyapi.service;


import org.sb3rdpartyapi.entity.User;
import org.sb3rdpartyapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> fetchAndSaveUsers() {

        String url = "https://jsonplaceholder.typicode.com/users";

        RestTemplate restTemplate = new RestTemplate();

        User[] users = restTemplate.getForObject(url, User[].class);

        List<User> userList = Arrays.asList(users);

        return userRepository.saveAll(userList);
    }
}
