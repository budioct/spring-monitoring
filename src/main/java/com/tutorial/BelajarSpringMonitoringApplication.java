package com.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BelajarSpringMonitoringApplication {

	/**
	 * note:
	 * Peringatan
	 * ● Perlu diperhatikan bahwa fitur Actuator sangat sensitif karena berisi informasi yang mungkin
	 *   rahasia, sehingga tidak boleh diakses secara public oleh semua orang
	 * ● Oleh karena itu, sangat disarankan untuk tidak mengekspos endpoint actuator ke public
	 * ● Kita bisa tambahkan Firewall atau Proxy Server seperti Nginx untuk menjaga agar endpoint
	 *   Actuator tidak bisa diakses secara bebas oleh public
	 */

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringMonitoringApplication.class, args);
	}

}
