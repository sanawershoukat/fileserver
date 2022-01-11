package com.core.fileserver;

import com.core.fileserver.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileserverApplication.class, args);
	}

}
