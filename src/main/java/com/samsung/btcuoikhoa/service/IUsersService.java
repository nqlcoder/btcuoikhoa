package com.samsung.btcuoikhoa.service;

import com.samsung.btcuoikhoa.entity.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUsersService extends UserDetailsService {
    public void createUser(Users newUser);

    public Users getUserByUserName(String username);

    public UserDetails loadUserByUsername(String username);

    public Users getUserById(long id);
}
