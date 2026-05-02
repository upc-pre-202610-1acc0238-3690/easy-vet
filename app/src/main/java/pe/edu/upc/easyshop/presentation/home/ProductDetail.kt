package pe.edu.upc.easyshop.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import pe.edu.upc.easyshop.domain.model.Product
import pe.edu.upc.easyshop.presentation.components.FilledButton

@Composable
fun ProductDetail(product: Product, modifier: Modifier = Modifier) {
    Scaffold(
        floatingActionButton = {
            FilledButton(onClick = {}, text = "Add to cart")
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            AsyncImage(model = product.image, contentDescription = product.name)
            Text(text = product.name)
        }
    }
}


