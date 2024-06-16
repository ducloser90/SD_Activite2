package ma.fs.mafs.repositories;

import ma.fs.mafs.entities.Role;
import ma.fs.mafs.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role,Long>{
    Role findByRoleName(String roleName);
}
