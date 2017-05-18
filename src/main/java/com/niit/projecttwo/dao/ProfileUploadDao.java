package com.niit.projecttwo.dao;

import com.niit.projecttwo.model.ProfilePicture;

public interface ProfileUploadDao {
    void save(ProfilePicture profilePicture);
    ProfilePicture getProfilePic(String username);
}
