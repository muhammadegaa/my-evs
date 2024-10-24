package com.example.my_evs.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.my_evs.ui.screens.*

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "orderTracking") {
        composable("orderTracking") { OrderTrackingScreen(navController) }
        composable("vehicleSettings") { VehicleSettingsScreen(navController) }
        composable("remoteAccess") { RemoteAccessScreen(navController) }
        composable("subscriptionManagement") { SubscriptionManagementScreen(navController) }
        composable("userProfile") { UserProfileScreen(navController) }
        composable("vehicleDiagnostics") { VehicleDiagnosticsScreen(navController) }
        composable("factoryReset") { FactoryResetScreen(navController) }
    }
}

