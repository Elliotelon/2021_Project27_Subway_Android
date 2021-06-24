package fastcampus.aop.part5.chapter05.presentation

interface BaseView<PresenterT : BasePresenter> {

    val presenter: PresenterT
}