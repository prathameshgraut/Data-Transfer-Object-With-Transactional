package dto.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.com.entity.User;

@Repository
public interface userRepo extends JpaRepository<User, Integer>{

}
