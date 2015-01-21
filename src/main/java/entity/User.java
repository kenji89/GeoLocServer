package entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class User {

	private Long id;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	private List<User> friends;

    public User() {
        friends = new ArrayList<User>();
    }
    
	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
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
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	public void addFriend(User friend){
		this.friends.add(friend);
	}
    
}
