package com.example.mapdemo.model.targetdto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PaymentDetailsDTO {
    private String companyNoticeMonth;
    private int companyNoticeAmountHealthInsurance;
    private int companyNoticeAmountLongTermCareInsurance;
    private int companyPaymentAmountHealthInsurance;
    private int companyPaymentAmountLongTermCareInsurance;
}

