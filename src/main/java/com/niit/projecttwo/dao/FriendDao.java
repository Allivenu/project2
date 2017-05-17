package com.niit.projecttwo.dao;

import java.util.List;

import com.niit.projecttwo.model.Friend;
import com.niit.projecttwo.model.User;

public interface FriendDao {
    List<User> getSuggestedUsers(User user);
    public void friendRequest(String from,String to);
    public List<Friend> pendingRequests(String toUsername);
    void updatePendingRequests(String from, String username, char status);
    public List<Friend> listOfFriends(String username);
    public List<User> allUsers();
}