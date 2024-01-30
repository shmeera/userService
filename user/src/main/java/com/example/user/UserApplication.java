package com.example.user;

import com.example.user.Controllers.UserController;
import com.example.user.dtos.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class UserApplication {

	private UserController userController;
//	@Autowired
//	public UserApplication(UserController userController) {
//
//		this.userController = userController;
//	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
////		UserRequestDto requestDto = new UserRequestDto();
////		requestDto.setEmail("krishna1@mail.com");
////		requestDto.setPassword("test@1");
//		//userController.SignUp(requestDto);
//		//userController.GetUserbyId(2L);
//	}
}
