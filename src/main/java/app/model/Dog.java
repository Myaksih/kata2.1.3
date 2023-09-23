package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String dog;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }
}
