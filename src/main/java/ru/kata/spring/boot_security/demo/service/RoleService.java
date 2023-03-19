package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import java.util.Set;

public interface RoleService {

    Set<Role> allRoles();

    void save(Role role);

    Role findRoleById(Long id);

    Role findRoleByName(String name);
}
