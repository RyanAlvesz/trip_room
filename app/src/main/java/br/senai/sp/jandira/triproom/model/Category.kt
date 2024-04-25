package br.senai.sp.jandira.triproom.model

import androidx.compose.ui.graphics.painter.Painter

data class Category(

    var id: Int = 0,
    var nome: String = "",
    var image: Painter? = null

)
