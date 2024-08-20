package com.samsung.btcuoikhoa.repository;

import com.samsung.btcuoikhoa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
