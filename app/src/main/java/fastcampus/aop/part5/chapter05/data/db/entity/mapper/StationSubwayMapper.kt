package fastcampus.aop.part5.chapter05.data.db.entity.mapper

import fastcampus.aop.part5.chapter05.data.db.entity.StationEntity
import fastcampus.aop.part5.chapter05.data.db.entity.StationWithSubwaysEntity
import fastcampus.aop.part5.chapter05.data.db.entity.SubwayEntity
import fastcampus.aop.part5.chapter05.domain.Station
import fastcampus.aop.part5.chapter05.domain.Subway

fun StationWithSubwaysEntity.toStation() =
    Station(
        name = station.stationName,
        isFavorited = station.isFavorited,
        connectedSubways = subways.toSubways()
    )

fun Station.toStationEntity() =
    StationEntity(
        stationName = name,
        isFavorited = isFavorited
    )


fun List<StationWithSubwaysEntity>.toStations() = map { it.toStation() }

fun List<SubwayEntity>.toSubways(): List<Subway> = map { Subway.findById(it.subwayId) }