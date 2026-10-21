//package kh.edu.istad.auth_server.controller;
//
//import kh.edu.istad.auth_server.dto.RegisterRequest;
//import kh.edu.istad.auth_server.dto.UserResponse;
//import kh.edu.istad.auth_server.service.UserService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//public class RegisterController {
//
//    private final UserService userService;
//
//    public RegisterController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request) {
//        UserResponse response = userService.register(request);
//        return ResponseEntity.ok(response);
//    }
//}