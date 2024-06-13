package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alexy","Oply",(byte) 86);
        userService.saveUser("Petay","Ups",(byte) 40);
        userService.saveUser("Vasy","Pupkin",(byte) 30);
        userService.saveUser("Ivan","Ivanov",(byte) 32);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
