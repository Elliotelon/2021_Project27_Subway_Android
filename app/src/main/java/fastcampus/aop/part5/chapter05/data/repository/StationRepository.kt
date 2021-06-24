package fastcampus.aop.part5.chapter05.data.repository

import fastcampus.aop.part5.chapter05.domain.ArrivalInformation
import fastcampus.aop.part5.chapter05.domain.Station
import kotlinx.coroutines.flow.Flow

interface StationRepository {

    val stations: Flow<List<Station>>

    suspend fun refreshStations()

    suspend fun getStationArrivals(stationName: String): List<ArrivalInformation>

    suspend fun updateStation(station: Station)
}