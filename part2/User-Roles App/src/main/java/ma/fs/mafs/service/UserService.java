package ma.fs.mafs.service;

import ma.fs.mafs.entities.Role;
import ma.fs.mafs.entities.User;

public interface UserService  {
    User addNewUser(User user);
    Role addnewRole (Role role);
    User findUserByUserName(String userName);
    Role findRoleByName(String roleName);
    void addRoleToUser(String username ,String roleName);
    User authenticate(String userName,String password);
}
