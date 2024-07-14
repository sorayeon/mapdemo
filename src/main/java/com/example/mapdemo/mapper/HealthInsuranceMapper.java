package com.example.mapdemo.mapper;

import com.example.mapdemo.model.sourcedto.HealthInsuranceDTO;
import com.example.mapdemo.model.sourcedto.납부내역DTO;
import com.example.mapdemo.model.targetdto.HealthInsDTO;
import com.example.mapdemo.model.targetdto.PaymentDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface HealthInsuranceMapper {
    HealthInsuranceMapper INSTANCE = Mappers.getMapper(HealthInsuranceMapper.class);

    @Mapping(source = "healthInsuranceDTO.발급항목.발급정보.보험구분", target = "insuranceType")
    @Mapping(source = "healthInsuranceDTO.발급항목.발급정보.발급일자", target = "issueDate")
    @Mapping(source = "healthInsuranceDTO.발급항목.가입자정보.성명", target = "name")
    @Mapping(source = "healthInsuranceDTO.발급항목.가입자정보.증번호", target = "certificateNumber")
    @Mapping(source = "healthInsuranceDTO.발급항목.가입자정보.사업장명칭", target = "workplaceName")
    @Mapping(source = "healthInsuranceDTO.발급항목.가입자정보.사업자등록번호", target = "businessRegistrationNumber")
    @Mapping(source = "healthInsuranceDTO.발급항목.연말정산.연말정산_건강보험료", target = "yearEndAdjustmentHealthInsurance")
    @Mapping(source = "healthInsuranceDTO.발급항목.연말정산.연말정산_장기요양보험", target = "yearEndAdjustmentLongTermCareInsurance")
    @Mapping(source = "healthInsuranceDTO.발급항목.확인년도", target = "confirmationYear")
    @Mapping(source = "healthInsuranceDTO.발급항목.납부내역", target = "paymentDetailsDTO")
    HealthInsDTO toHealthInsDTO(HealthInsuranceDTO healthInsuranceDTO);

    @Mapping(source = "납부내역.직장_고지월", target = "companyNoticeMonth")
    @Mapping(source = "납부내역.직장_고지금액_건강보험료", target = "companyNoticeAmountHealthInsurance", numberFormat = "$#.00")
    @Mapping(source = "납부내역.직장_고지금액_장기요양보험료", target = "companyNoticeAmountLongTermCareInsurance", numberFormat = "$#.00")
    @Mapping(source = "납부내역.직장_납부금액_건강보험료", target = "companyPaymentAmountHealthInsurance", numberFormat = "$#.00")
    @Mapping(source = "납부내역.직장_납부금액_장기요양보험료", target = "companyPaymentAmountLongTermCareInsurance", numberFormat = "$#.00")
    PaymentDetailsDTO toPaymentDetailsDTO(납부내역DTO 납부내역);

}
