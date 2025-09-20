package diplomado.usabana.service;

import java.util.List;

import diplomado.usabana.models.UserEntity;


public interface IUserService {
	 
	List<UserEntity> listUsers();
	UserEntity createUser(UserEntity user);

}
