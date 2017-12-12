package app.appsmatic.com.iwishdriversapp.API;

import app.appsmatic.com.iwishdriversapp.API.Models.DriverID;
import app.appsmatic.com.iwishdriversapp.API.Models.ResArchived;
import app.appsmatic.com.iwishdriversapp.API.Models.ResConfirmOrder;
import app.appsmatic.com.iwishdriversapp.API.Models.ResLocationUpdate;
import app.appsmatic.com.iwishdriversapp.API.Models.ResOrderDetails;
import app.appsmatic.com.iwishdriversapp.API.Models.ResOrders;
import app.appsmatic.com.iwishdriversapp.API.Models.ResProfile;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Mido PC on 8/14/2016.
 */
public interface DriversApi {



    @POST("account/login")
    Call<DriverID> login(@Body Object logindtat);



    @POST("driver/Orders")
    Call<ResOrders> getOrders(@Body Object userID);



    @POST("driver/ArchivedOrders")
    Call<ResArchived> getArchivedOrders(@Body Object userID);



    @POST("driver/OrderDetails")
    Call<ResOrderDetails> getOrderDetails(@Body Object orderID);



    @POST("driver/ChangeOrderStatus")
    Call<ResConfirmOrder> changeStautMsg(@Body Object st);



    @POST("driver/ConfirmOrderPickup")
    Call<ResConfirmOrder> ConfirmOrder(@Body Object conf );


    @POST("driver/profile")
    Call<ResProfile> getProfile(@Body Object userID);




    @POST("driver/update")
    Call<ResponseBody> updateDriverinfo(@Body Object driver);

    @POST("driver/Location")
    Call<ResLocationUpdate> updateDriverLocation(@Body Object driver);


}
