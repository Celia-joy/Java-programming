package com.lala;

import java.util.Objects;

class Employee {
    int id;
    String name;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee other)) {
            return false;
        }

        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }
}