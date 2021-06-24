package fastcampus.aop.part5.chapter05.presentation.stationarrivals

import fastcampus.aop.part5.chapter05.domain.ArrivalInformation
import fastcampus.aop.part5.chapter05.presentation.BasePresenter
import fastcampus.aop.part5.chapter05.presentation.BaseView

interface StationArrivalsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showStationArrivals(arrivalInformation: List<ArrivalInformation>)
    }

    interface Presenter : BasePresenter {

        fun fetchStationArrivals()

        fun toggleStationFavorite()
    }
}