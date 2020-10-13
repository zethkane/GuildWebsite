package toon;

import classTypes.ClassType;

public class Toon {
    public String name;
    public ClassType classType;//this is needs to be changed due to Liskovs Substitution Principle

    public void setName(String name) {
        this.name = name;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public Toon() {
    }

    public String getName() {
        return name;
    }

    public ClassType getClassType() {
        return classType;
    }

    public Toon(String name, ClassType classType) {
        this.name = name;
        this.classType = classType;
    }
}
