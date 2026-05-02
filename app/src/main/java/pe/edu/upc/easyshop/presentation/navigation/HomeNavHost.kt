package pe.edu.upc.easyshop.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable


@Serializable
object Home

@Serializable
object ProductDetail

@Composable
fun HomeNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Home
    ) {
        composable<Home>
        {
            Text("Home")
        }

        composable<ProductDetail> {
            Text("Product detail")
        }

    }
}