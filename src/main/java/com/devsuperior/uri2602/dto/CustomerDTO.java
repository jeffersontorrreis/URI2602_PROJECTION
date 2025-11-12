package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.Customerprojection;

public class CustomerDTO {

    private String name;

    public CustomerDTO(){

    }

    public CustomerDTO(String name) {
        this.name = name;
    }

    public CustomerDTO(Customerprojection projection) {
        name = projection.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
