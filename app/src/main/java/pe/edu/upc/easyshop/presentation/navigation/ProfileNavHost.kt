package pe.edu.upc.easyshop.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object Profile

@Composable
fun ProfileNavHost() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Profile
    ) {
        composable<Profile> {
            Text("Profile")
        }
    }
}