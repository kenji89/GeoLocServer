package dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.UserDao;
import entity.User;

public class UserDaoMapImpl implements UserDao {
	
	private Map<Long, User> users = new HashMap<Long, User>();

	@Override
	public Collection<User> list() {
		return convertToList();
	}

	@Override
	public User findById(Long id) {
		return users.get(id);
	}
	
	@Override
	public User add(User user){
		user.setId( new Long(users.size() + 1));
		users.put(user.getId(), user);
		return user;
	}
	
	@Override
	public Collection<User> listFriends(Long id) {
		User user = users.get(id);
		return user.getFriends();
	}
	
	@Override
	public User addFriend(Long id, User friend) {
		User user = users.get(id);
		user.getFriends().add(friend);
		return user;
	}
	
	

	private Collection<User> convertToList(){
		List<User> u = new ArrayList<User>();
		
		for (long i = 1; i <= users.size(); i++){
			u.add(users.get(i));
		}
		
		return u;
	}

	

	
	
}
