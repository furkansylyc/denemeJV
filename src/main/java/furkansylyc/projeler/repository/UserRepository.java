package furkansylyc.projeler.repository;

import furkansylyc.projeler.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    List<UserEntity> findByName(String name);
}
