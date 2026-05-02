package pe.edu.upc.easyshop.presentation.home

import pe.edu.upc.easyshop.domain.model.Product

data class UiState(
    val products: List<Product> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)