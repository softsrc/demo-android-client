package com.eric.demo_android_client.apis;


import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by eric on 2017/5/5.
 */

public interface LoginService {

    @POST("/login")
    Observable<String> login(String userName, String password) ;
}
