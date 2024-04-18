package com.junclabs.parkguide.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.junclabs.parkguide.data.State
import com.junclabs.parkguide.data.Park

@Composable
fun StateListItem(
    state: State, onClick: (State) -> Unit, modifier: Modifier = Modifier
) {
    Card(
        modifier
            .fillMaxWidth()
            .size(150.dp)
            .clickable { onClick(state) }) {
        Box(
            modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = state.title), fontWeight = FontWeight.W600, textAlign = TextAlign.Center, modifier = modifier.padding(8.dp))
        }
    }
}

@Composable
fun ParkListItem(
    park: Park, onClick: (Park) -> Unit, modifier: Modifier = Modifier
) {
    Card(
        modifier
            .fillMaxWidth()
            .size(150.dp)
            .clickable { onClick(park) }) {
        Box(
            modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(id = park.title), fontWeight = FontWeight.W600, textAlign = TextAlign.Center, modifier = modifier.padding(8.dp))
        }
    }
}
