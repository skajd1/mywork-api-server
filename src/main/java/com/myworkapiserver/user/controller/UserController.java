package com.myworkapiserver.user.controller;


import com.myworkapiserver.user.dto.UserInfoReponse;
import com.myworkapiserver.user.dto.UserInfoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<List<UserInfoReponse>> getUserList(){
        List<UserInfoReponse> userList = new ArrayList<>();
        return ResponseEntity.ok(userList);
    }
    @GetMapping("/user/{uid}")
    public ResponseEntity<UserInfoReponse> getUser(@PathVariable String uid){
        return ResponseEntity.ok(new UserInfoReponse());
    }

    @PostMapping("/user")
    public ResponseEntity<UserInfoReponse> createUser(@RequestBody UserInfoRequest userInfoRequest){

        return ResponseEntity.ok(new UserInfoReponse());
    }
    @PutMapping("/user/{uid}")
    public ResponseEntity<UserInfoReponse> updateUser(@PathVariable String uid, @RequestBody UserInfoRequest userInfoRequest){
        return ResponseEntity.ok(new UserInfoReponse());
    }
    @DeleteMapping("/user/{uid}")
    public ResponseEntity<Void> deleteUser(@PathVariable String uid){
        return ResponseEntity.ok().build();
    }

}
