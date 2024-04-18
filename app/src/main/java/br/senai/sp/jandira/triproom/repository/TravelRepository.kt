package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Travel
import java.time.LocalDate

class TravelRepository {

    @Composable
    fun listAllTravels(): List<Travel> {

        val londres = Travel(
            id = 1,
            destination = "Londres",
            description = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
            dateArrival = LocalDate.of(2019, 2, 18),
            dateLeaving = LocalDate.of(2019, 2, 21),
            image = painterResource(id = R.drawable.london)
        )

        val salvador = Travel(
            id = 2,
            destination = "Salvador",
            description = "Salvador, the capital of the state of Bahia in northeastern Brazil, is known for its Portuguese colonial architecture, Afro-Brazilian culture and tropical coastline.",
            dateArrival = LocalDate.of(2021, 8, 4),
            dateLeaving = LocalDate.of(2021, 8, 8),
            image = painterResource(id = R.drawable.salvador)
        )

        val coneyIsland = Travel(
            id = 3,
            destination = "Coney Island",
            description = "Coney Island is a peninsula, formerly an island, located in the borough of Brooklyn, New York, United States.",
            dateArrival = LocalDate.of(2022, 1, 12),
            dateLeaving = LocalDate.of(2022, 1, 18),
            image = painterResource(id = R.drawable.coney_island)
        )

        val ottawa = Travel(
            id = 4,
            destination = "Ottawa",
            description = "Ottawa is the capital of Canada, located in the province of Ontario (southeast of the country), close to the city of Montreal and the border with the United States.\n",
            dateArrival = LocalDate.of(2021, 10, 6),
            dateLeaving = LocalDate.of(2021, 12, 6)
        )

        val amsterdam = Travel(
            id = 5,
            destination = "Amsterdam",
            description = "Amsterdam is the capital of the Netherlands, known for its artistic heritage, an elaborate system of canals and narrow houses with gabled roofs, legacies of the city's 17th-century golden age.\n",
            dateArrival = LocalDate.of(2023, 12, 25),
            dateLeaving = LocalDate.of(2024, 3, 6),
            image = painterResource(id = R.drawable.amsterdam)
        )

        return listOf(londres, salvador, coneyIsland, ottawa, amsterdam)

    }

}