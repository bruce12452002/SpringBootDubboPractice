package bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String bloodType;

    public User(Integer id, String name, String bloodType) {
        this.id = id;
        this.name = name;
        this.bloodType = bloodType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
