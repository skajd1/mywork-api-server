package com.myworkapiserver.user.service;

import com.myworkapiserver.user.dto.UserInfoResponse;

import java.util.List;

public interface UserService {
    List<UserInfoResponse> getUserList();
    UserInfoResponse getUser(Long uid);
    UserInfoResponse createUser(String name);
    UserInfoResponse updateUser(Long uid, String name);
    UserInfoResponse deleteUser(Long uid);
}
