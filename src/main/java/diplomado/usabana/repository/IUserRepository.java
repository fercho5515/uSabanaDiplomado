package diplomado.usabana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import diplomado.usabana.models.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {

}
