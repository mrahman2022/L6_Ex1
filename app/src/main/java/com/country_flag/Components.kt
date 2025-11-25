package com.country_flag

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.country_flag.model.Country
import com.country_flag.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import com.country_flag.ui.theme.CountryFlagTheme

// Use Geo font if you add it to res/font/geo.ttf; fallback to default otherwise
private val GeoFont = FontFamily(Font(R.font.geo, weight = FontWeight.Normal))

@Composable
fun CountryCard(country: Country, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = country.cardColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = country.flagRes),
                contentDescription = stringResource(country.nameRes),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = stringResource(country.nameRes),
                style = MaterialTheme.typography.headlineSmall,
                fontFamily = GeoFont
            )
        }
    }
}

@Composable
fun CountriesScreen() {
    val countries = listOf(
        Country(R.string.france, R.drawable.flag_france, Color(0xFFEEF6FF)),
        Country(R.string.japan, R.drawable.flag_japan, Color(0xFFFFF6F6)),
        Country(R.string.nigeria, R.drawable.flag_nigeria, Color(0xFFF6FFF6)),
        Country(R.string.germany, R.drawable.flag_germany, Color(0xFFFFF7EA))
    )

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        countries.forEach { country ->
            CountryCard(country = country)
        }
        Spacer(modifier = Modifier.height(12.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCountriesScreen() {
    CountryFlagTheme {
        Surface {
            CountriesScreen()
        }
    }
}
