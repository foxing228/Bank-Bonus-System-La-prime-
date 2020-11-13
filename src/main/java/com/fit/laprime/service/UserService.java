package com.fit.laprime.service;

import com.fit.laprime.entity.User;
import com.fit.laprime.web.dto.UserRegistrationDTO;

public interface UserService {
    User save(UserRegistrationDTO userRegistrationDTO);
}
