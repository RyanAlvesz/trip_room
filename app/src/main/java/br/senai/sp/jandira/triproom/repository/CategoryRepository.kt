package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Category

class CategoryRepository {

    @Composable
    fun listAllCategories(): List<Category>  {

        val mountain = Category(
            id = 1,
            nome = "Mountain",
            image = painterResource(id = R.drawable.mountain)
        )

        val snow = Category(
            id = 2,
            nome = "Snow",
            image = painterResource(id = R.drawable.snow)
        )

        val beach = Category(
            id = 3,
            nome = "Beach",
            image = painterResource(id = R.drawable.beach)
        )

        val surf = Category(
            id = 4,
            nome = "Surf",
            image = painterResource(id = R.drawable.surf)
        )

        val culture = Category(
            id = 5,
            nome = "Culture",
            image = painterResource(id = R.drawable.culture)
        )


        return listOf(mountain, snow, beach, surf, culture)

    }

}