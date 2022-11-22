package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity
public class Category {

    @Id
    private String name;

    public Category(){}

    public Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Category)){
            return false;
        }
        else{
            Category aux = (Category)obj;
            if(aux.getName().equals(this.getName()))
                return true;
            else
                return false;
        }
    }
}

