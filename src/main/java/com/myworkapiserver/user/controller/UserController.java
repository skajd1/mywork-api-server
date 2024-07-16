package com.myworkapiserver.user.controller;


import com.myworkapiserver.user.dto.UserInfoResponse;
import com.myworkapiserver.user.dto.UserInfoRequest;
import com.myworkapiserver.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/user")
    public ResponseEntity<List<UserInfoResponse>> getUserList(){
        return ResponseEntity.ok()
                .body(userService.getUserList());
    }
    @GetMapping("/user/{uid}")
    public ResponseEntity<UserInfoResponse> getUser(@PathVariable Long uid){
        return ResponseEntity.ok()
                .body(userService.getUser(uid));
    }

    @PostMapping("/user")
    public ResponseEntity<UserInfoResponse> createUser(@RequestBody UserInfoRequest userInfoRequest){
        return ResponseEntity.ok()
                .body(userService.createUser(userInfoRequest.getName()));
    }
    @PutMapping("/user/{uid}")
    public ResponseEntity<UserInfoResponse> updateUser(@PathVariable String uid, @RequestBody UserInfoRequest userInfoRequest){
        return ResponseEntity.ok()
                .body(userService.updateUser(Long.valueOf(uid), userInfoRequest.getName()));
    }
    @DeleteMapping("/user/{uid}")
    public ResponseEntity<UserInfoResponse> deleteUser(@PathVariable String uid){
        return ResponseEntity.ok()
                .body(userService.deleteUser(Long.valueOf(uid)));
    }
}
