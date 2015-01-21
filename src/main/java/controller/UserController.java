package controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.UserDao;
import dao.impl.UserDaoMapImpl;
import entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserDao userDao = new UserDaoMapImpl();

    @RequestMapping("/register")
    public User register(@Valid User user) {
    	User u = userDao.add(user);
        return u;
    }
    
    @RequestMapping
    public Collection<User> list(){
    	return userDao.list();
    }
    
    @RequestMapping("/{id}")
    public User findById(@PathVariable Long id){
    	return userDao.findById(id);
    }
    
    @RequestMapping("/friends/{id}")
    public Collection<User> listFriends(@PathVariable Long id){
    	return userDao.listFriends(id);
    }
    
    @RequestMapping("/friends/{id}/add")
    public User addFriend(@PathVariable Long id, User friend){
    	return userDao.addFriend(id, friend);
    }
}
