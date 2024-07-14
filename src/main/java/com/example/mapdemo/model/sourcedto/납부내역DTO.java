package com.example.mapdemo.model.sourcedto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class 납부내역DTO {
    private String 직장_고지월;
    private int 직장_고지금액_건강보험료;
    private int 직장_고지금액_장기요양보험료;
    private int 직장_납부금액_건강보험료;
    private int 직장_납부금액_장기요양보험료;

}

