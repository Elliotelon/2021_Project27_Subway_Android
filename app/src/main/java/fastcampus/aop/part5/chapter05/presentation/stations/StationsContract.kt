package fastcampus.aop.part5.chapter05.presentation.stations

import fastcampus.aop.part5.chapter05.domain.Station
import fastcampus.aop.part5.chapter05.presentation.BasePresenter
import fastcampus.aop.part5.chapter05.presentation.BaseView

interface StationsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showStations(stations: List<Station>)
    }

    interface Presenter : BasePresenter {

        fun filterStations(query: String)

        fun toggleStationFavorite(station: Station)
    }
}