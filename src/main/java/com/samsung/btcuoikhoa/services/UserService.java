package com.samsung.btcuoikhoa.services;

import com.samsung.btcuoikhoa.configuration.CustomUserDetails;
import com.samsung.btcuoikhoa.repositories.UserRepository;
import com.samsung.btcuoikhoa.repositories.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //1.
        //Call our repository to work with db
        Users user = userRepository.findByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException(username);
        //2. return custom user details
        else return new CustomUserDetails(user);
    }

    public void createUser(Users newUser)
    {
        userRepository.save(newUser);
    }

    public Users getUserByUserName(String username)
    {
        return userRepository.findByUsername(username);
    }
}
