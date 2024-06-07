package org.example;



public class UserService {
    User [] users;

    public UserService(User[] users) {
        this.users = new User[15];
    }

    boolean addUsers(User[] users,User user) {
        boolean add = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i]==null){
                users[i]=user;
                add = true;
                System.out.println(users[i]);
                break;
            }
        }
        return add;
    }

    boolean cleanAll(User [] users){
        boolean clean = false;
        for (int i = 0; i < users.length; i++) {
            users[i]=null;
            System.out.println(users[i]);
            clean = true;
        }
        return clean;
    }

    int countUsers(User [] users){
        int count = 0;
        for (User user : users) {
            if (user != null) {
                count += 1;

            }
        }
        System.out.println(count);
        return count;
    }

    User idUser(User [] users, long id){
        User userTest = null;
        for (User user : users) {
            if (user != null && id == user.getId()) {
                userTest = user;
                System.out.println(user);
            }
        }
        return userTest;
    }

    boolean indexUser(User [] users, int index){
        boolean userIndex = false;
        for (int i = 0; i < users.length; i++) {
            if (i == index) {
                System.out.println(users[i]);
                userIndex = true;
                break;
            }
        }
        return userIndex;
    }

    boolean boolId(User [] users, long id){
        boolean bool = false;
        for (User user : users) {
            if (user != null && user.getId() == id) {
                System.out.println(user.getId());
                bool = true;
                break;
            }
        }
        return bool;
    }
}
