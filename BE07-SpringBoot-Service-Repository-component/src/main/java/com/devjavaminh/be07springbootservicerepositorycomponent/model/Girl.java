package com.devjavaminh.be07springbootservicerepositorycomponent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Girl {
    private String name = "doan thi cam ly";

    @Override
    public String toString() {
        return "Girl(" + this.name + ")";
    }


}
