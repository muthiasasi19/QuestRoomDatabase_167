package com.example.roomlocaldb_p10.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.roomlocaldb_p10.ui.view.mahasiswa.DestinasiInsert
import com.example.roomlocaldb_p10.ui.view.mahasiswa.InsertMhsView

@Composable
fun PengelolaHalaman(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(navController = navController, startDestination = DestinasiInsert.route) {
        composable(
            route = DestinasiInsert.route
        ){
            InsertMhsView(
                onBack = {}, onNavigate = {}
            )
        }
    }
}

fun composable(route: String, function: () -> Unit) {

}

fun NavHost(navController: NavController, startDestination: String, function: () -> Unit) {

}

