package com.romanoravec.awsimageupload.datastore;

import com.romanoravec.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("9dfa5c7b-b261-40ad-a609-d4c47632237b"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("fcefc72e-5c5e-48a4-a007-c1b4c4b9d596"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
