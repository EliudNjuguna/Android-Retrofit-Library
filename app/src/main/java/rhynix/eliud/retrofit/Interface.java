package rhynix.eliud.retrofit;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by eliud on 12/2/16.
 */

public interface Interface {

    //This method is used for "POST"
    @FormUrlEncoded
    @POST("/app.php")
    void postData(@Field("method") String method,
                  @Field("username") String username,
                  @Field("password") String password,
                  Callback<ServerResponse> serverResponseCallback);

    //This method is used for "GET"
    @GET("/app.php")
    void getData(@Query("method") String method,
                 @Query("username") String username,
                 @Query("password") String password,
                 Callback<ServerResponse> serverResponseCallback);
}
