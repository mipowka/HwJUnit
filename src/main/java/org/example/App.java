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
        userService.addUsers(new User(1,"ann", "bann"));
        userService.cleanAll();
        userService.countUsers();
        userService.idUser(2);
        userService.indexUser(0);
        userService.boolId(2);
    }
}
