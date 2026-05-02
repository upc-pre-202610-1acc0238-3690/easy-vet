package pe.edu.upc.easyshop.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object Cart

@Composable
fun CartNavHost() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Cart
    ) {
        composable<Cart> {
            Text("Shopping cart")
        }
    }
}