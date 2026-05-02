package pe.edu.upc.easyshop.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import pe.edu.upc.easyshop.domain.repository.ProductRepository

class ProductListViewModelFactory(
    private val repository: ProductRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductListViewModel(repository) as T
    }
}