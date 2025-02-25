package com.example.mapdemo;

import com.example.mapdemo.mapper.HealthInsuranceMapper;
import com.example.mapdemo.model.sourcedto.Envelope;
import com.example.mapdemo.model.targetdto.HealthInsDTO;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class MapdemoApplication {

    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<Envelope>" +
                "    <Header>" +
                "        <commonHeader>" +
                "            <apiKeyHashCode/>" +
                "            <useSystemCode>B000000000000000</useSystemCode>" +
                "            <serviceId>MDS0002046</serviceId>" +
                "            <transactionUniqueId>2022012411134182698686000</transactionUniqueId>" +
                "            <agreementYn>Y</agreementYn>" +
                "            <timestampToken/>" +
                "        </commonHeader>" +
                "    </Header>" +
                "    <Body>" +
                "        <response>" +
                "            <개인신용정보전송요구권_건강보험공단>" +
                "                <건강장기요양보험료납부확인서직장가입자_CI>" +
                "                    <발급항목>" +
                "                        <발급정보>" +
                "                            <보험구분>00</보험구분>" +
                "                            <발급일자>20220124</발급일자>" +
                "                        </발급정보>" +
                "                        <가입자정보>" +
                "                            <성명>홍길동</성명>" +
                "                            <증번호>80000000000</증번호>" +
                "                            <사업장명칭>신용상사</사업장명칭>" +
                "                            <사업자등록번호>1700000000</사업자등록번호>" +
                "                        </가입자정보>" +
                "                        <확인년도>2020</확인년도>" +
                "                        <납부내역>" +
                "                            <직장_고지월>01</직장_고지월>" +
                "                            <직장_고지금액_건강보험료>107550</직장_고지금액_건강보험료>" +
                "                            <직장_고지금액_장기요양보험료>11520</직장_고지금액_장기요양보험료>" +
                "                            <직장_납부금액_건강보험료>107550</직장_납부금액_건강보험료>" +
                "                            <직장_납부금액_장기요양보험료>11520</직장_납부금액_장기요양보험료>" +
                "                        </납부내역>" +
                "                        <납부내역>" +
                "                            <직장_고지월>02</직장_고지월>" +
                "                            <직장_고지금액_건강보험료>107550</직장_고지금액_건강보험료>" +
                "                            <직장_고지금액_장기요양보험료>11520</직장_고지금액_장기요양보험료>" +
                "                            <직장_납부금액_건강보험료>107550</직장_납부금액_건강보험료>" +
                "                            <직장_납부금액_장기요양보험료>11520</직장_납부금액_장기요양보험료>" +
                "                        </납부내역>" +
                "                        <연말정산>" +
                "                            <연말정산_건강보험료>69190</연말정산_건강보험료>" +
                "                            <연말정산_장기요양보험>9860</연말정산_장기요양보험>" +
                "                        </연말정산>" +
                "                    </발급항목>" +
                "                </건강장기요양보험료납부확인서직장가입자_CI>" +
                "            </개인신용정보전송요구권_건강보험공단>" +
                "            <비고>" +
                "                <원장처리결과/>" +
                "            </비고>" +
                "        </response>" +
                "    </Body>" +
                "</Envelope>";

        try {
            // XmlMapper 객체 생성
            XmlMapper xmlMapper = new XmlMapper();
            // JsonMapper 객체 생성
            JsonMapper jsonMapper = new JsonMapper();

            // XML 을 HealthInsuranceDTO 객체로 변환
            Envelope envelope = xmlMapper.readValue(xml, Envelope.class);
            // 소스 DTO 변환
            System.out.println(envelope);
            System.out.println("============================================================");

            HealthInsuranceMapper mapper = HealthInsuranceMapper.INSTANCE;
            HealthInsDTO healthInsDTO = mapper.toHealthInsDTO(envelope.getBody().getResponse().getPersonalInfo().getHealthInsuranceDTO());
            // 타겟 DTO 변환
            System.out.println(healthInsDTO);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
