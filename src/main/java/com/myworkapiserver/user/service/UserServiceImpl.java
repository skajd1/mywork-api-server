package com.myworkapiserver.user.service;

import com.myworkapiserver.user.dto.UserInfoResponse;
import com.myworkapiserver.user.entity.User;
import com.myworkapiserver.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public List<UserInfoResponse> getUserList() {
        List<User> userList = userRepository.findAll();
        return userList.stream()
                .map(user -> new UserInfoResponse(user.getUid(), user.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public UserInfoResponse getUser(Long uid) {
        User user = userRepository.findById(uid)
                .orElseThrow(() -> new NoSuchElementException());
        return new UserInfoResponse(user.getUid(), user.getName());
    }

    @Override
    public UserInfoResponse createUser(String name) {
        User user = User.builder()
                .name(name)
                .build();
        userRepository.save(user);
        return new UserInfoResponse(user.getUid(), name);
    }
    @Override
    public UserInfoResponse updateUser(Long uid, String name) {
        User user = userRepository.findById(uid)
                .orElseThrow(() -> new NoSuchElementException());
        user.setName(name);
        userRepository.save(user);
        return new UserInfoResponse(user.getUid(), name);
    }

    @Override
    public UserInfoResponse deleteUser(Long uid) {
        userRepository.deleteById(uid);
        return new UserInfoResponse(uid, null);
    }
}
