package com.supakavadeer.lession8_30daysapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.supakavadeer.lession8_30daysapp.data.Temple
import com.supakavadeer.lession8_30daysapp.data.temples
import com.supakavadeer.lession8_30daysapp.ui.theme.Lession8_30DaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lession8_30DaysAppTheme {
                TempleApp()
            }
        }
    }
}

@Composable
fun TempleApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TempleAppBar() })
    { paddingValues ->
        TempleScreen(modifier = Modifier.padding(paddingValues))
    }
}

@Composable
fun TempleScreen(modifier: Modifier = Modifier) {
    TempleList(temples = temples, modifier = modifier)
}

@Composable
fun TempleList(temples: List<Temple>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(temples.size) { index ->
            TempleCard(temple = temples[index])
        }
    }
}

@Composable
fun TempleCard(temple: Temple) {
    var isExpanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
            .clickable { isExpanded = !isExpanded },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Day ${temple.day}",
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = stringResource(id = temple.locationName),
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(
                    vertical = dimensionResource(R.dimen.padding_small)
                ),

                )
            Image(
                painter = painterResource(id = temple.image),
                contentDescription = stringResource(id = temple.locationName),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            if (isExpanded) {
                Text(
                    text = "Place: ${temple.place}",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(
                        vertical = dimensionResource(R.dimen.padding_small)
                    ),
                    color = MaterialTheme.colorScheme.secondary
                )
                Text(
                    text = stringResource(id = temple.note),
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

        }
    }
}

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun TempleAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(title = {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.primary
            )
        }
    })
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO, showSystemUi = true)
@Composable
fun LightPreview() {
    Lession8_30DaysAppTheme {
        TempleApp()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
fun DarkPreview() {
    Lession8_30DaysAppTheme {
        TempleApp()
    }
}