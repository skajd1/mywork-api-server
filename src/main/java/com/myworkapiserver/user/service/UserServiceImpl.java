package com.myworkapiserver.user.service;

import com.myworkapiserver.user.dto.UserInfoResponse;
import com.myworkapiserver.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<UserInfoResponse> getUserList() {
        List<User> userList;
        
        return null;
    }

    @Override
    public UserInfoResponse getUser(Long uid) {
        return null;

    }

    @Override
    public UserInfoResponse createUser(String name) {
        return null;
    }
    @Override
    public UserInfoResponse updateUser(Long uid, String name) {
        return null;
    }

    @Override
    public UserInfoResponse deleteUser(Long uid) {
        return null;
    }
}
