package fastcampus.aop.part5.chapter05.domain

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Station(
    val name: String,
    val isFavorited: Boolean,
    val connectedSubways: List<Subway>
): Parcelable