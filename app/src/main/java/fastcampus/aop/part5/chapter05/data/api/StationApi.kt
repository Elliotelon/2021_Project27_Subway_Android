package fastcampus.aop.part5.chapter05.data.api

import fastcampus.aop.part5.chapter05.data.db.entity.StationEntity
import fastcampus.aop.part5.chapter05.data.db.entity.SubwayEntity

interface StationApi {

    suspend fun getStationDataUpdatedTimeMillis(): Long

    suspend fun getStationSubways(): List<Pair<StationEntity, SubwayEntity>>
}