package com.netcodejava.FileUploadDownloadAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) 
public class FileUploadDownloadApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadApiApplication.class, args);
	}

}
