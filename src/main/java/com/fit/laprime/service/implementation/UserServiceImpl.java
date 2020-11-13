package com.fit.laprime.service.implementation;

import com.fit.laprime.entity.Role;
import com.fit.laprime.entity.User;
import com.fit.laprime.repository.UserRepository;
import com.fit.laprime.service.UserService;
import com.fit.laprime.web.dto.UserRegistrationDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserRegistrationDTO userRegistrationDTO) {
        User user = new User(userRegistrationDTO.getFirstName(),
                    userRegistrationDTO.getLastName(), userRegistrationDTO.getEmail(),
                    userRegistrationDTO.getPassword(), List.of(new Role("USER")));

        return userRepository.save(user);
    }
}
