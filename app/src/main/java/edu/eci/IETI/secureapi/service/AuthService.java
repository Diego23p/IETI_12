package edu.eci.IETI.secureapi.service;

import edu.eci.IETI.secureapi.model.LoginWrapper;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {

    @POST("user/login")
    Call<Token> login(@Body LoginWrapper LoginWrapper);

}
