package com.example.mobiledevelopmentcourselabapp.presentation.view.second.player

import java.text.ParsePosition

class Palye(
    val name: String,
    val PhotoURL: String,
    val Number: String,
    val Team: String,
    val Age: String,
    val position: PlayePosition,
    var isExpended: Boolean = false,
) {
}

enum class PlayePosition(val rusName: String){
    GOALKEEPER("Вратарь"),
    DEFENDER("Защитник"),
    MIDFIELD("Полузащитник"),
    RORWARD("Нападающий")
}