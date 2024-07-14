package com.example.mapdemo.model.sourcedto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@JacksonXmlRootElement(localName = "Envelope")
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(value = {"Header"})
public class Envelope {
    @JacksonXmlProperty(localName = "Body")
    private Body body;


    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public static class Body {
        @JacksonXmlProperty(localName = "response")
        private Response response;

    }


    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @JsonIgnoreProperties(value = {"비고"})
    public static class Response {
        @JacksonXmlProperty(localName = "개인신용정보전송요구권_건강보험공단")
        private PersonalInfo personalInfo;

    }


    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public static class PersonalInfo {
        @JacksonXmlProperty(localName = "건강장기요양보험료납부확인서직장가입자_CI")
        private HealthInsuranceDTO healthInsuranceDTO;

    }


}
