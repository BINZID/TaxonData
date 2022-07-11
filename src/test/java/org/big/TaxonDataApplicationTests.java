package org.big;

import org.big.service.SaveService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class TaxonDataApplicationTests {

    @Autowired
    private SaveService saveService;

    @Test
    public void contextLoads() {
        String data = "{\n" +
                "    \"descriptionList\":[\n" +
                "        {\n" +
                "            \"sourceId\":\"e5dbbdad-e93c-4e9e-a2dd-c772afd30ce4\",\n" +
                "            \"descriptiontypeId\":\"209\",\n" +
                "            \"descontent\":\"山西、河南、湖南、河北、辽宁、山东、江苏、浙江、安徽、福建、江西、湖北、广东、广西、四川、贵州、云南、西藏、陕西、甘肃、青海、宁夏、内蒙古、北京、重庆／Shanxi，Henan，Hunan，Hebei，Liaoning，Shandong，Jiangsu，Zhejiang，Anhui，Fujian，Jiangxi，Hubei，Guangdong，Guangxi，Sichuan，Guizhou，Yunnan，Tibet（Xizang），Shaanxi，Gansu，Qinghai，Ningxia，Inner Mongolia（Nei Mongol），Beijing，Chongqing\",\n" +
                "            \"orderNum\":\"209\",\n" +
                "            \"language\":\"1\",\n" +
                "            \"licenseName\":\"署名 (BY) -相同方式分享 (SA)\",\n" +
                "            \"descriptiontypeName\":\"国内分布\",\n" +
                "            \"taxonId\":\"85cc395b49ed4bef80bae75833c1fc55\",\n" +
                "            \"score\":1,\n" +
                "            \"destitle\":\"Arctonyx collaris 的分布信息\",\n" +
                "            \"id\":\"a23ba956de704fffaf8aca8881307bc0\",\n" +
                "            \"sourceName\":\"中国生物多样性红色名录-脊椎动物-第一卷-哺乳动物-中册\",\n" +
                "            \"licenseId\":\"4\",\n" +
                "            \"status\":1\n" +
                "        }\n" +
                "    ],\n" +
                "    \"refs\":[\n" +
                "        {\n" +
                "            \"journal\":\"\",\n" +
                "            \"year\":\"2021\",\n" +
                "            \"author\":\"蒋志刚\",\n" +
                "            \"refstr\":\"蒋志刚.2021.中国生物多样性红色名录：脊椎动物 第一卷 哺乳动物 (中册).北京：科学出版社\",\n" +
                "            \"id\":\"2af8868d-4e26-422c-82f0-03ee2283f8bb\",\n" +
                "            \"title\":\"中国生物多样性红色名录：脊椎动物 第一卷 哺乳动物 (中册)．北京：科学出版社\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"taxon\":{\n" +
                "        \"sourceId\":\"e5dbbdad-e93c-4e9e-a2dd-c772afd30ce4\",\n" +
                "        \"sciname\":\"Arctonyx collaris \",\n" +
                "        \"rankCn\":\"种\",\n" +
                "        \"authorship\":\"F.G.Cuvier，1825\",\n" +
                "        \"rankEn\":\"Species\",\n" +
                "        \"id\":\"85cc395b49ed4bef80bae75833c1fc55\",\n" +
                "        \"sourceName\":\"中国生物多样性红色名录-脊椎动物-第一卷-哺乳动物-中册\",\n" +
                "        \"chname\":\"猪獾\"\n" +
                "    },\n" +
                "    \"multimediaList\":[\n" +
                "        {\n" +
                "            \"sourceId\":\"e5dbbdad-e93c-4e9e-a2dd-c772afd30ce4\",\n" +
                "            \"country\":\"中国\",\n" +
                "            \"lng\":-9999,\n" +
                "            \"mediaLabel\":\"Map of Domestic Distribution\",\n" +
                "            \"mediaType\":\"1\",\n" +
                "            \"licenseName\":\"署名 (BY) -相同方式分享 (SA)\",\n" +
                "            \"taxonId\":\"85cc395b49ed4bef80bae75833c1fc55\",\n" +
                "            \"path\":\"4088ee52ead043a9be460134c2a61b2b/7c4459ae080143f4aded0053abb01e95/85cc395b49ed4bef80bae75833c1fc55/893088cbed7645e69e4c656a481f9be2.jpg\",\n" +
                "            \"showType\":0,\n" +
                "            \"id\":\"71ddf8ad43ba4744936dec70fae2f105\",\n" +
                "            \"sourceName\":\"中国生物多样性红色名录-脊椎动物-第一卷-哺乳动物-中册\",\n" +
                "            \"licenseId\":\"4\",\n" +
                "            \"lat\":-9999,\n" +
                "            \"status\":1\n" +
                "        },\n" +
                "        {\n" +
                "            \"sourceId\":\"e5dbbdad-e93c-4e9e-a2dd-c772afd30ce4\",\n" +
                "            \"country\":\"中国\",\n" +
                "            \"lng\":-9999,\n" +
                "            \"mediaLabel\":\"猪獾Arctonyx collaris    ©Lynx Edicions\",\n" +
                "            \"mediaType\":\"1\",\n" +
                "            \"licenseName\":\"署名 (BY) -相同方式分享 (SA)\",\n" +
                "            \"taxonId\":\"85cc395b49ed4bef80bae75833c1fc55\",\n" +
                "            \"path\":\"4088ee52ead043a9be460134c2a61b2b/7c4459ae080143f4aded0053abb01e95/85cc395b49ed4bef80bae75833c1fc55/891f86990bca42248666f14ce1229072.jpg\",\n" +
                "            \"showType\":0,\n" +
                "            \"id\":\"a1533ad13e2b499bb59a5f8cabbb6003\",\n" +
                "            \"sourceName\":\"中国生物多样性红色名录-脊椎动物-第一卷-哺乳动物-中册\",\n" +
                "            \"licenseId\":\"4\",\n" +
                "            \"lat\":-9999,\n" +
                "            \"status\":1\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        saveService.saveData(data);
    }

}
