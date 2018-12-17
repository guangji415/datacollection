//package com.sic.credit.api.datacollection.util;
//
//import org.codehaus.jackson.JsonParser;
//import org.codehaus.jackson.JsonProcessingException;
//import org.codehaus.jackson.map.DeserializationContext;
//import org.codehaus.jackson.map.JsonDeserializer;
//
//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * [添加说明]
// * <br>@author : sunhw
// * <br>@date : 18-1-4 下午4:04
// * <br>@version : 1.0
// */
//public class CustomJsonDateDeserializer extends JsonDeserializer<Date> {
//
//    @Override
//    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        if(jp.getText().equals("")||jp==null){
//            return null;
//        }else{
//            String date = jp.getText();
//            try {
//                return format.parse(date);
//            } catch (ParseException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
