package kr.ac.hansung.cse.hellospringdatajpa.user.repo;

import kr.ac.hansung.cse.hellospringdatajpa.user.entity.MyRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<MyRole, Integer> {
    Optional<MyRole> findByRolename(String rolename);
}
