package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

public class TestUserService {
    User [] users = new User[15];
    UserService userService = new UserService(users);

    @Test
    public void testAddUser(){
        Assertions.assertTrue(
                userService.addUsers(new User(1,"vasya","pupkin"))
        );
        Assertions.assertTrue(
                userService.addUsers(new User(2,"vasya","pupkin"))
        );

        users[0] = new User(1,"vasya","pupkin");
        users[1] = new User(2,"vasya","pupkin");

        Assertions.assertArrayEquals(users,userService.users);
    }

    @Test
    public void testCleanAll(){
        userService.addUsers(new User(1,"vasya","pupkin"));
        users[0] = new User(1,"vasya","pupkin");

        Assertions.assertTrue(userService.cleanAll());

        users[0] = null;
        Assertions.assertArrayEquals(users,userService.users);
    }

    @Test
    public void testCountUsers(){
        userService.addUsers(new User(1,"vasya","pupkin"));
        userService.addUsers(new User(2,"vasya","pupkin"));

        Assertions.assertEquals(2,userService.countUsers());

        userService.cleanAll();

        Assertions.assertEquals(0,userService.countUsers());
    }

    @Test
    public void testIdUser(){
        userService.addUsers(new User(1,"vasya","pupkin"));
        Assertions.assertNotNull(userService.idUser(1));

        userService.cleanAll();

        Assertions.assertNull(userService.idUser(1));
    }

    @Test
    public void testIndexUser(){
        userService.addUsers(new User(1,"vasya","pupkin"));
        Assertions.assertTrue(userService.indexUser(0));

        userService.cleanAll();
        Assertions.assertTrue(userService.indexUser(0));

        Assertions.assertFalse(userService.indexUser(users.length));
    }

    @ParameterizedTest
    @ValueSource(longs = {1,2,3,4,5,6,7,8,9})
    public void testBoolId(long n){
        userService.addUsers(new User(1,"vasya","pupkin"));
        userService.addUsers(new User(2,"vasya","pupkin"));
        userService.addUsers(new User(3,"vasya","pupkin"));
        userService.addUsers(new User(4,"vasya","pupkin"));
        userService.addUsers(new User(5,"vasya","pupkin"));
        userService.addUsers(new User(6,"vasya","pupkin"));
        userService.addUsers(new User(7,"vasya","pupkin"));
        userService.addUsers(new User(8,"vasya","pupkin"));
        userService.addUsers(new User(9,"vasya","pupkin"));

        Assertions.assertTrue(userService.boolId(n));

        userService.cleanAll();

        Assertions.assertFalse(userService.boolId(n));
    }

}
