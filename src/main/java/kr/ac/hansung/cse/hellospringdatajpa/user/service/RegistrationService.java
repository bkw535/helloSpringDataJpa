package kr.ac.hansung.cse.hellospringdatajpa.user.service;

import kr.ac.hansung.cse.hellospringdatajpa.user.entity.MyRole;
import kr.ac.hansung.cse.hellospringdatajpa.user.entity.MyUser;

import java.util.List;

public interface RegistrationService {
    MyUser createUser(MyUser user, List<MyRole> userRoles);

    boolean checkEmailExists(String email);

    MyRole findByRolename(String rolename);

    List<MyUser> findAllUsers();
}
