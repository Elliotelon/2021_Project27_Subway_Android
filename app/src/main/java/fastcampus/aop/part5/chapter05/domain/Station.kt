package fastcampus.aop.part5.chapter05.domain

data class Station(
    val name: String,
    val isFavorited: Boolean,
    val connectedSubways: List<Subway>
)