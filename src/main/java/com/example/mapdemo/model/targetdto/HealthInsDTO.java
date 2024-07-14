package com.example.mapdemo.model.targetdto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HealthInsDTO {

    private String insuranceType;
    private String issueDate;
    private String name;
    private String certificateNumber;
    private String workplaceName;
    private String businessRegistrationNumber;
    private String confirmationYear;
    private int yearEndAdjustmentHealthInsurance;
    private int yearEndAdjustmentLongTermCareInsurance;
    private List<PaymentDetailsDTO> paymentDetailsDTO;

}
