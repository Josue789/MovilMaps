package net.ivanvega.milocationymapascompose.ui.maps

import androidx.compose.runtime.Composable
import com.google.android.gms.maps.GoogleMapOptions
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.AdvancedMarker
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MarkerState

@Composable
fun DrawingMap(){
    GoogleMap(
        googleMapOptionsFactory = {
            GoogleMapOptions().mapId("DEMO_MAP_ID")
        },
        //...
    ) {
        AdvancedMarker(
            state = MarkerState(position = LatLng(-34.0, 151.0)),
            title = "Marker in Sydney"
        )
        AdvancedMarker(
            state = MarkerState(position = LatLng(35.66, 139.6)),
            title = "Marker in Tokyo"
        )
    }
}