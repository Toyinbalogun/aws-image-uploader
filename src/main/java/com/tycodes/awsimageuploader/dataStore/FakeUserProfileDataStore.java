package com.tycodes.awsimageuploader.dataStore;

import com.tycodes.awsimageuploader.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("ebfb05eb-af9a-40e3-a13d-654afa371d54"), "Grace Adeyemi", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("06384725-54e5-4207-af1b-f90122da2234"), "Andrew Jenkins", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("827434ff-8d6f-4ece-bd1c-6d1fae06cfb5"), "Toyin Balogun", null));

    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}


