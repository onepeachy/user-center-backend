//package com.tjq.usercenter.service;
//
//import com.tjq.usercenter.model.domain.User;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.util.DigestUtils;
//
//import javax.annotation.Resource;
//
///**
// *
// */
//
//@SpringBootTest
//class UserServiceTest {
//
//    @Resource
//    private UserService userService;
//
//    @Test
//    public void testMd5() {
//        String newpassword = DigestUtils.md5DigestAsHex(("abcd" + "mypassword").getBytes());
//        System.out.println(newpassword);
//
//    }
//
//    @Test
//    public void testAddUser() {
//        User user = new User();
//        user.setUsername("tjqTest");
//        user.setUserAccount("123");
//        user.setAvatarUrl("");
//        user.setGender(0);
//        user.setUserPassword("123");
//        user.setPhone("123");
//        user.setEmail("456");
//
//        boolean result = userService.save(user);
//        System.out.println(user.getId());
//        Assertions.assertTrue(result);
//
//    }
//
////    @Test
////    void userRegister() {
////        String userAccount = "tjqt";
////        String userPassword = "";
////        String checkPassword = "123456";
////        String planetCode = "1234";
////        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertEquals(-1, result);
////        userAccount = "tj";
////        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertEquals(-1, result);
////        userAccount = "tjqt";
////        userPassword = "123456";
////        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertEquals(-1, result);
////        userAccount = "tjq&&^";
////        userPassword = "12345678";
////        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertEquals(-1, result);
////        checkPassword = "123456789";
////        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertEquals(-1, result);
////        userAccount = "TjqTjq";
////        userPassword = "12345678";
////        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertEquals(-1, result);
////        checkPassword = "12345678";
////        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
////        Assertions.assertTrue(result > 0);
////    }
//}