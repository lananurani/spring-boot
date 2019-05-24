package com.lanas.latihanrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LatihanrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatihanrestApplication.class, args);
		Hallo salam = new Hallo();
		System.out.println(salam.apaKabar());
	}

}
