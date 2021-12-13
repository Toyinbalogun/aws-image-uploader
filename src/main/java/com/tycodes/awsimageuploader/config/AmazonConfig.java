package com.tycodes.awsimageuploader.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() { //this class gives and delivers the s3 client to be used
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "",
                ""
        );

        return AmazonS3ClientBuilder
                .standard()
                .withRegion("us-east-2")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}

//AWSAccessKeyId=AKIAQKHTAZFSGPYKZMEN
//AWSSecretKey=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