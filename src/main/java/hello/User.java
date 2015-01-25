package hello;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;
	
	@NotNull
	@Column(unique = true)
	@Min(value = 6)
	private String username;
	
	@NotNull
	@Min(value = 8)
	private String password;
	
	private Location location;

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
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
}
