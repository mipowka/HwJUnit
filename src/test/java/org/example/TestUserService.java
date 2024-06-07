package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestUserService {
    User [] users = new User[15];
    UserService userService = new UserService(users);

    @Test
    public void testAddUser(){
        Assertions.assertTrue(userService.addUsers(users,new User(1,"vasya","pupkin")));
    }

    @Test
    public void testCleanAll(){
        Assertions.assertTrue(userService.cleanAll(users));
    }

    @Test
    public void testCountUsers(){
        Assertions.assertEquals(0,userService.countUsers(users));
    }

    @Test
    public void testIdUser(){
        Assertions.assertNull(userService.idUser(users,1));
    }

    @Test
    public void testIndexUser(){
        Assertions.assertTrue(userService.indexUser(users,1));
    }

    @ParameterizedTest
    @ValueSource(longs = {0,1,2,3,4,5,6,7,8,9})
    public void testBoolId(long n){
        Assertions.assertFalse(userService.boolId(users,n));
    }

}
