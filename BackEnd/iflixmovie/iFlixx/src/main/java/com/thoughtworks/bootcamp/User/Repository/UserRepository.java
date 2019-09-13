package com.thoughtworks.bootcamp.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;
import com.thoughtworks.bootcamp.User.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> 
{
    public java.util.Optional<User> findByEmailId(String emailId);
}
