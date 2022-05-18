package oit.utilities;

import org.apache.commons.lang.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStringGenerator {
    public String randomMinString(String name) {
        String characters = "ABC0123456789";
        String uuid = RandomStringUtils.random(5, characters);
        String generatedValue = name + uuid;
        return generatedValue;
    }

    public String randomMinString2(String name) {
        String characters = "ABCDEFGHIJ";
        String uuid = RandomStringUtils.random(5, characters);
        String generatedValue = name + uuid;
        return generatedValue;
    }

    public int generateRandomInt(){
        int min=0;
        int max=99999;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }
}
