package diplomado.usabana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diplomado.usabana.models.UserEntity;
import diplomado.usabana.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	public IUserRepository iUserRepository;
	
	@Override
	public List<UserEntity> listUsers() {
		//List<UserEntity> users = iUserRepository.findAll();
		return iUserRepository.findAll();
	}
	
	@Override
	public UserEntity createUser(UserEntity user) {
		UserEntity userGuardado = iUserRepository.save(user);
		return userGuardado;
	}
}
