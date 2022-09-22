package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {
    Profile profile;

    public Profile getDataFromFile(File file) {

            try (BufferedReader myReader = new BufferedReader(new java.io.FileReader(file))){
                String name = myReader.readLine();
                String age = myReader.readLine();
                String email = myReader.readLine();
                String phone = myReader.readLine();

                name = name.substring(name.indexOf(" ")+1);
                age = age.substring(age.indexOf(" ")+1);
                email = email.substring(email.indexOf(" ")+1);
                phone = phone.substring(phone.indexOf(" ")+1);
                profile = new Profile(name,Integer.valueOf(age),email,Long.valueOf(phone));
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        return profile;
    }
}
