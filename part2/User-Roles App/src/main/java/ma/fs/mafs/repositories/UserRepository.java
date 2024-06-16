package ma.fs.mafs.repositories;

import ma.fs.mafs.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,String>{
    User findByUserName(String userName);
}
