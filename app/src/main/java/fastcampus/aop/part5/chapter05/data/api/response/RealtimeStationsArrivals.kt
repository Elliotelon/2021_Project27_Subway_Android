package fastcampus.aop.part5.chapter05.data.api.response

import com.google.gson.annotations.SerializedName
import fastcampus.aop.part5.chapter05.data.api.response.ErrorMessage
import fastcampus.aop.part5.chapter05.data.api.response.RealtimeArrival

data class RealtimeStationArrivals(
    @SerializedName("errorMessage")
    val errorMessage: ErrorMessage? = null,
    @SerializedName("realtimeArrivalList")
    val realtimeArrivalList: List<RealtimeArrival>? = null
)