package com.example.lausecdan.googlenearby;

import com.example.lausecdan.googlenearby.Remote.IGoogleApi;
import com.example.lausecdan.googlenearby.Remote.RetrofitClient;

public class Common {
    public static final String baseURL="https://googleapis.com";
    public static IGoogleApi getGoogleApi()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
