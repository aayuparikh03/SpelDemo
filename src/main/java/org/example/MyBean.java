package org.example;


import org.springframework.stereotype.Component;

@Component // Registers this bean as "myBean"
public class MyBean {
    private String name = "Spring Framework";
    private int version = 6;

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public String getDetails() {
        return name + " v" + version;
    }
}
