package com.kadioglumf.webapp.service;

import com.kadioglumf.webapp.entity.User;
import com.kadioglumf.webapp.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}

