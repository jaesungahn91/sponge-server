package io.github.js.sponge.domain.study;

import io.github.js.sponge.domain.common.AbstractCodedEnumConverter;
import io.github.js.sponge.domain.common.CodedEnum;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

import static io.github.js.sponge.domain.study.City.*;

@Getter
public enum State implements CodedEnum<Integer> {
    SEOUL("서울특별시", 1, "서울", Arrays.asList(
            GANGNAMGU, GANGDONGGU, GANGBUKGU, GANGSEOGU_SEOUL, GWANAKGU, GWANGJINGU, GUROGU,
            GEUMCHEONGU, NOWONGU, DOBONGGU, DONGDAEMUNGU, DONGJAKGU, MAPOGU, SEODAEMUNGU, SEOCHOGU,
            SEONGDONGGU, SEONGBUKGU, SONGPAGU, YANGCHEONGU, YEONGDEUNGPOGU, YONGSANGU, EUNPYEONG,
            JONGROGU, JUNGGU_SEOUL, JUNGNANGGU
    )),
    BUSAN("부산광역시", 2, "부산", Arrays.asList(
            GANGSEOGU_BUSAN, GEUMJEONGGU, NAMGU, DONGGU, DONGNAEGU, BUSANJINGU, BUKGU, SASANGGU,
            SAHAGU, SEOGU, SUYEONGGU, YEONJEGU, YEONGDOGU, JUNGGU_BUSAN, HAEUNDAEGU, KIJANGGUN
    )),
    DAEGU("대구광역시", 3, "대구", Arrays.asList(
            NAMGU_DAEGU, DALSEOGU, DONGGU_DAEGU, BUKGU_DAEGU, SEOGU_DAEGU, SUSEONGGU, JUNGGU_DEAGU, DALSEONGGUN
    )),
    INCHEON("인천광역시", 4, "인천", Arrays.asList(
            GYEYANGGU, NAMGU_INCHEON, NAMDONGGU, DONGGU_INCHEON, BUPYEONGGU, SEOGU_INCHEON, YEONSUGU, JUNGGU_INCHEON, GANGHWA, ONGJIN
    )),
    GWANGJU("광주광역시", 5, "광주", Arrays.asList(
            GWANGSAN, NAMGU_GWANGJU, DONGGU_GWANGJU, BUKGU_GWANGJU, SEOGU_GWANGJU
    )),
    DAEJEON("대전광역시", 6, "대전", Arrays.asList(
            DAEDEOKGU, DONGGU_DEAJEON, SEOGU_DAEJEON, YOOSEONGGU, JUNGGU_DAEJEON

    )),
    ULSAN("울산광역시", 7, "울산", Arrays.asList(
            NAMGU_ULSAN, DONGGU_ULSAN, BUKGU_ULSAN, JUNGGU_ULSAN, ULJUGUN
    )),
    SEJONG("세종특별자치시", 8, "세종", Arrays.asList()),
    GANGWON("강원도", 9, "강원", Arrays.asList(
            GANGNEUNG, DONGHAE, SAMCHEOK, SOKCHO, WONJU, CHUNCHEON, TAEBAEK, GOSEONG_GANGWON, YANGGU, YANGYANG,
            YEONGWOL, INJE, JEONGSEON, CHEORWON, PYEONGCHANG, HONGCHEON, HWACHEON, HOENGSEONG
    )),
    GYEONGGI("경기도", 10, "경기", Arrays.asList(
            GOYANG_DEOKYANG, GOYANG_ILSANDONG, GOYANG_ILSANSEOGU, GWACHEON, GWANGMYEONG, GWANGJU_GYEONGGI, GURI,
            GUNPO, GIMPO, NAMYANGJU, DONGDUCHEON, BUCHEON_SOSA, BUCHEON_OJEONG, BUCHEON_WONMI, SEONGNAM_BUNDANG,
            SEONGNAM_SUJEONG, SEONGNAM_JUNGWON, SUWON_GWONSEON, SUWON_YEONGTONG, SUWON_JANGAN, SUWON_PALDAL,
            SIHEUNG, ANSAN_DANWON, ANSAN_SANGNOK, ANSEONG, ANYANG_DONGAN, ANYANG_MANAN, YANGJU, OSAN,
            YONGIN_GIHEUNG, YONGIN_SUYONG, YONGIN_CHEONGIN, UIWANG, UIJEONGBU, ICHEON, PAJU, PYEONGTAEK,
            POCHEON, HANAM, HWASEONG, GAPYEONG, YANGPYEONG, YEOJU, YEONCHEON
    )),
    GYEONGNAM("경상남도", 11, "경남", Arrays.asList(
            GEOJE, GIMHAE, MIRYANG, SICHUAN, YANGSAN, JINJU, CHANGWON_MASANHAPPO, CHANGWON_MASANHOEWON,
            CHANGWON_SEONGSAN, CHANGWON_UICHANG, CHANGWON_JINHAE, TONGYEONG, GEOCHANG, GOSEONG_GYEONGNAM,
            NAMHAE, SANCHEONG, UIRYEONG, CHANGNYEONG, HADONG, HAMAN, HAMYANG, HAPCHEON
    )),
    GYEONGBUK("경상북도", 12, "경북", Arrays.asList(
            GYEONGSAN, GYEONGJU, GUMI, GIMCHEON, MUNGYEONG, SANGJU, ANDONG, YEONGJU, YEONGCHEON, POHANG_NAMGU,
            POHANG_BUKGU, GORYEONG, GUNWI, BONGHWA, SEONGJU, YEONGDEOK, YEONGYANG, YECHEON, ULLEUNG, ULJIN,
            UISEONG, QINGDAO, CHEONGSONG, CHILGOK
    )),
    JEONNAM("전라남도", 13, "전남", Arrays.asList(
            GWANGYANG, NAJU, MOKPO, SUNCHEON, YEOSU, GANGJIN, GOHEUNG, GOKSEONG, GURYE, DAMYANG, MUAN,
            BOSEONG, SINAN, YEONGGWANG, YEONGAM, WANDO, JANGSEONG, JANGHEUNG, JINDO, HAMPYEONG, HAENAM, HWASUN
    )),
    JEONBUK("전라북도", 14, "전북", Arrays.asList(
            GUNSAN, GIMJE, NAMWON, IKSAN, JEONJU_DEOKJIN, JEONJU_WANSAN, JEONGEUP, GOCHANG, MUJU, BUAN, SUNCHANG,
            WANJU, IMSIL, JANGSU, JINAN
    )),
    JEJU("제주특별자치시", 15, "제주", Arrays.asList(
            JEJUCITY, SEOGWIPO
    )),
    CHUNGNAM("충청남도", 16, "충남", Arrays.asList(
            GYERYONG, GONGJU, NONSAN, DANGJIN, BORYEONG, SEOSAN, ASAN, CHEONAN_DONGNAM, CHEONAN_SEOBUK, GEUMSAN,
            BUYEO, SEOCHEON, YESAN, CHEONGYANG, TAEAN, HONGSEONG
    )),
    CHUNGBUK("충청북도", 17, "충북", Arrays.asList(
            JECHEON, CHEONGJU_SANGDANG, CHEONGJU_HEUNGDEOK, CHUNGJU, GOESAN, DANYANG, BOEUN,
            YEONGDONG, OKCHEON, EUMSEONG, JEUNGPYEONG, JINCHEON, CHEONGWON
    ));

    private final String name;
    private final Integer code;
    private final String shortName;
    private final List<City> cities;
    private static final List<State> serviceStates = Arrays.asList(GYEONGGI, INCHEON, SEOUL);

    State(String name, Integer code, String shortName, List<City> cities) {
        this.name = name;
        this.code = code;
        this.shortName = shortName;
        this.cities = cities;
    }

    @jakarta.persistence.Converter(autoApply = true)
    static class Converter extends AbstractCodedEnumConverter<State, Integer> {
        public Converter() {
            super(State.class);
        }
    }
}
