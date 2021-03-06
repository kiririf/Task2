package com.tn.educationtask2.takesipfromanywhere;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tn.educationtask2.neededclass.IP;
import lombok.Setter;

public class JsonToIPParser {
    @Setter
    GetIpStrategy getIpStrategy;

    public IP transformToIp(String userInputPath) {
        String targetIp = getIpStrategy.getIpStrategy(userInputPath);
        GsonBuilder builder = new GsonBuilder();
        Gson parser = builder.create();//создаём парсер, который преобразует Json в объект
        return parser.fromJson(targetIp, IP.class);//переводим Json в объект
    }
}
