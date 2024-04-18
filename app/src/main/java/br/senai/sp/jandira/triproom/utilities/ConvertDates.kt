package br.senai.sp.jandira.triproom.utilities

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.toLowerCase
import java.time.LocalDate

class ConvertDates {

    @Composable
    fun dateShortener (dateArrival: LocalDate, dataLeaving: LocalDate): String {

        var dayArrival = dateArrival.dayOfMonth
        var monthArrival = dateArrival.month.toString()
        var shortMonthArrivalFirstLetter = monthArrival.substring(0..0).uppercase()
        var shortMonthArrivalTwoLetters = monthArrival.substring(1..2).lowercase()


        var dayLeaving = dataLeaving.dayOfMonth
        var monthLeaving  = dataLeaving.month.toString()
        var shortMonthLeavingFirstLetter = monthLeaving.substring(0..0).uppercase()
        var shortMonthLeavingTwoLetters = monthLeaving.substring(1..2).lowercase()

        return "$dayArrival $shortMonthArrivalFirstLetter$shortMonthArrivalTwoLetters - $dayLeaving $shortMonthLeavingFirstLetter$shortMonthLeavingTwoLetters"

    }

}