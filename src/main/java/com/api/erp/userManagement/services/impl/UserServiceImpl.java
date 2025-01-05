package com.api.erp.userManagement.services.impl;

import com.api.erp.userManagement.entity.UserMgt;
import com.api.erp.userManagement.repository.UserRepository;
import com.api.erp.userManagement.services.UserService;
import com.api.erp.utils.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserMgt addUser(UserMgt user) {
        return userRepository.save(user);
    }

    @Override
    public UserMgt getUserById(long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("User Not Found", id)));
    }

    @Override
    public List<UserMgt> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserMgt updateUserById(long id, UserMgt user) {
        return null;
    }
}
