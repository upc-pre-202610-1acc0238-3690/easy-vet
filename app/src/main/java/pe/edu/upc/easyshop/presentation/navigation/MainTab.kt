package pe.edu.upc.easyshop.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import pe.edu.upc.easyshop.R

enum class MainTab(
    val label: String,
    val outlineIcon: Int,
    val filledIcon: Int
) {
    Home(
        label = "Home",
        outlineIcon = R.drawable.home,
        filledIcon = R.drawable.home_filled
    ),
    Favorites(
        label = "Favorites",
        outlineIcon = R.drawable.favorite,
        filledIcon = R.drawable.favorite_filled
    ),
    Cart(
        label = "Cart",
        outlineIcon = R.drawable.shopping_cart,
        filledIcon = R.drawable.shopping_cart_filled
    ),
    Profile(
        label = "Profile",
        outlineIcon = R.drawable.person,
        filledIcon = R.drawable.person_filled

    )


}