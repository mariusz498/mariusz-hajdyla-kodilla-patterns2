package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User jack = new Millenials("Jack");
        User sophie = new YGeneration("Sophie");
        User michael = new ZGeneration("Michael");

        //When
        String jackSharesPost = jack.sharePost();
        System.out.println(jack.getName() + ": " + jackSharesPost);
        String sophieSharesPost = sophie.sharePost();
        System.out.println(sophie.getName() + ": " + sophieSharesPost);
        String michaelSharePost = michael.sharePost();
        System.out.println(michael.getName() + ": " + michaelSharePost);

        //Then
        Assert.assertEquals("Snapchat", jackSharesPost);
        Assert.assertEquals("Twitter", sophieSharesPost);
        Assert.assertEquals("Facebook", michaelSharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User steven = new Millenials("Steven");

        //When
        System.out.println("Steven default medium: " + steven.sharePost());
        steven.setSocialPublisher(new FacebookPublisher());
        String stevenSharesPost = steven.sharePost();
        System.out.println("Steven has chosen: " + steven.sharePost());

        //Then
        Assert.assertEquals("Facebook", stevenSharesPost);
    }
}
