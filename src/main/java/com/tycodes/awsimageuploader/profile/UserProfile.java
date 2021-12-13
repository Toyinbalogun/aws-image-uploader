package com.tycodes.awsimageuploader.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private final UUID profileId;
    private final  String username;
    private String userProfileImageLink;  //s3 key

    public UserProfile(UUID profileId, String username, String userProfileImageLink) {
        this.profileId = profileId;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(profileId, (that.profileId)) &&
                Objects.equals(username, (that.username)) &&
                Objects.equals(userProfileImageLink, (that.userProfileImageLink));
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, username, userProfileImageLink);
    }
}
