package com.apolis.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("com.apolis")
//@ConfigurationProperties("database.oracle")
public class DbDetails {
	@Value("ora")
	private String driver;
	@Value("user")
	private String username;
	@Value("pass")
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DbDetails [driver=" + driver + ", username=" + username + ", password=" + password + "]";
	}

}
