package com.fit.laprime.service;

import com.fit.laprime.entity.User;
import com.fit.laprime.dto.UserRegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO userRegistrationDTO);
}
