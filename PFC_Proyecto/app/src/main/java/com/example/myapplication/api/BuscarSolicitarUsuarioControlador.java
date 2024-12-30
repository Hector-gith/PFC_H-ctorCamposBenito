package com.example.myapplication.api;

import com.example.myapplication.modelos.Amigos;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface BuscarSolicitarUsuarioControlador {
    @GET("Buscar_Solicitar_Usuarios.php")
    Call<List<Amigos>> getUsuarios(
            @Query("id") int id,
            @Query("nick") String nick

            );
    @GET("Numero_Solicitudes.php")
    Call<String> getNumeroSolicitudes(
            @Query("id") int id

    );
    @POST("Buscar_Solicitar_Usuarios.php")
    @FormUrlEncoded
    Call<ResponseBody> mandarSolicitud(

            @Field("id_s") int id_s,
            @Field("id_r") int id_r
    );
}
