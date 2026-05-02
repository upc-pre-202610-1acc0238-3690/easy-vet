package pe.edu.upc.easyshop.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import pe.edu.upc.easyshop.domain.model.Product

@Composable
fun ProductList(
    viewModel: ProductListViewModel,
    modifier: Modifier = Modifier,
    onClick: (Product) -> Unit
) {

    val state = viewModel.state.collectAsState().value

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        when {
            (state.isLoading) -> CircularProgressIndicator()
            (state.errorMessage != null) -> Text(text = state.errorMessage)
            (state.products.isEmpty()) -> Text(text = "No products found")
            else ->
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2)
                ) {
                    items(state.products) { product ->
                        ProductCard(product) {
                            onClick(product)
                        }
                    }
                }
        }
    }

}