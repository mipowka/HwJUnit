package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User[] users = new User[15];
        UserService userService = new UserService(users);
        userService.addUsers(users,new User(1,"ann", "bann"));
        userService.cleanAll(users);
        userService.countUsers(users);
        userService.idUser(users,2);
        userService.indexUser(users,0);
        userService.boolId(users,2);
    }
}
