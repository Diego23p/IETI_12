package edu.eci.IETI.secureapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import edu.eci.IETI.secureapi.model.LoginWrapper;
import edu.eci.IETI.secureapi.service.AuthService;
import edu.eci.IETI.secureapi.service.Token;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_EMAIL = "edu.eci.IETI.secureapi.EMAIL";

    public static final String EXTRA_PASSWORD = "edu.eci.IETI.secureapi.PASSWORD";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http:/localhost:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    AuthService authService = retrofit.create(AuthService.class);

    private final ExecutorService executorService = Executors.newFixedThreadPool( 1 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginClicked(View view) {

        EditText editTextEmail = (EditText) findViewById(R.id.email);
        String email = editTextEmail.getText().toString();

        EditText editTextPassword = (EditText) findViewById(R.id.password);
        String password = editTextPassword.getText().toString();

        if (!email.equals("diego.puerto")){
            editTextEmail.setError("User not found");
        } else if ( !password.equals("test") ) {
            editTextPassword.setError("Invalid password");
        } else {

            LoginActivity aux =this;

            executorService.execute( new Runnable() {
                @Override
                public void run() {
                    try {
                        //Response<Token> response = authService.login( new LoginWrapper(email,password) ).execute();
                        //Token token = response.body();

                        //Store Token
                        SharedPreferences sharedPref =
                                getSharedPreferences( getString( R.string.preference_file_key ), Context.MODE_PRIVATE );
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("TOKEN_KEY", email);
                        editor.commit();

                        //Start MainActivity
                        Intent intent = new Intent(aux, MainActivity.class);
                        startActivity(intent);
                        aux.finish();

                    }
                    catch ( Exception e ) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }

}