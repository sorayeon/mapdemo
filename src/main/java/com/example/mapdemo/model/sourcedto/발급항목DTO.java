package com.example.mapdemo.model.sourcedto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class 발급항목DTO {
    private 발급정보DTO 발급정보;
    private 가입자정보DTO 가입자정보;
    private String 확인년도;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<납부내역DTO> 납부내역;
    private 연말정산DTO 연말정산;

}
