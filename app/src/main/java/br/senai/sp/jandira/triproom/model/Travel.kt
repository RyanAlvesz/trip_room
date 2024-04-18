package br.senai.sp.jandira.triproom.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Travel(

    var id: Int = 0,
    var destination: String = "",
    var description: String = "",
    var dateArrival: LocalDate = LocalDate.now(),
    var dateLeaving: LocalDate = LocalDate.now(),
    var image: Painter? = null

)
