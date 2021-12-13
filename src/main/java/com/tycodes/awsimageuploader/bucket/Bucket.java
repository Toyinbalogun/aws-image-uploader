package com.tycodes.awsimageuploader.bucket;

public enum Bucket {

    PROFILE_IMAGE("aws-image-uploaderf-proj");

    private final String bucketName;

    Bucket(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
