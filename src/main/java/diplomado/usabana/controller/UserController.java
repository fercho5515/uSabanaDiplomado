package diplomado.usabana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import diplomado.usabana.models.UserEntity;
import diplomado.usabana.service.IUserService;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private IUserService iUser;

	@GetMapping("/listar")
    public ResponseEntity<List<UserEntity>> listUsers() {
		return ResponseEntity.ok(null);
    }
	
	@PostMapping
    public ResponseEntity<UserEntity> crear(@RequestBody UserEntity user) {
		UserEntity nuevo = iUser.createUser(user);
        return ResponseEntity.ok(nuevo);
    }
	
	
}
