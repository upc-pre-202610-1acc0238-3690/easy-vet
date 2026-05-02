package pe.edu.upc.easyshop.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.easyshop.di.RepositoryModule.provideProductRepository
import pe.edu.upc.easyshop.domain.model.Product
import pe.edu.upc.easyshop.presentation.home.ProductDetail
import pe.edu.upc.easyshop.presentation.home.ProductList
import pe.edu.upc.easyshop.presentation.home.ProductListViewModel
import pe.edu.upc.easyshop.presentation.home.ProductListViewModelFactory

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    val factory = ProductListViewModelFactory(provideProductRepository())
    val viewModel: ProductListViewModel = viewModel(factory = factory)

    val selectedProduct = remember {
        mutableStateOf<Product?>(null)
    }

    NavHost(navController = navController, startDestination = "product_list") {

        composable("product_list") {
            ProductList(viewModel, modifier = modifier) { product ->
                selectedProduct.value = product
                navController.navigate("product_detail")
            }
        }

        composable ("product_detail") {
            selectedProduct.value?.let { product ->
                ProductDetail(product = product)
            }

        }
    }

}
