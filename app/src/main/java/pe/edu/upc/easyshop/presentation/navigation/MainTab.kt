package pe.edu.upc.easyshop.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import pe.edu.upc.easyshop.R

enum class MainTab(
    val label: String,
    val resourceId: Int
) {
    Home(
        label = "Home",
        resourceId = R.drawable.home
    ),
    Favorites(
        label = "Favorites",
        resourceId = R.drawable.favorite
    ),
    Cart(
        label = "Cart",
        resourceId = R.drawable.shopping_cart
    ),
    Profile (
        label = "Profile",
        resourceId = R.drawable.person
    )


}