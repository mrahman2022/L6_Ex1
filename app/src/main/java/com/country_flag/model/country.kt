package com.country_flag.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color

data class Country(
    @StringRes val nameRes: Int,
    @DrawableRes val flagRes: Int,
    val cardColor: Color
)

