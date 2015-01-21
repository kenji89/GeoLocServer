package dao;

import java.util.Collection;

import entity.User;

public interface UserDao {
	public Collection<User> list();
	
	public User findById(Long id);
	
	public User add(User user);
	
	public Collection<User> listFriends(Long id);
	
	public User addFriend(Long id, User friend);
}
