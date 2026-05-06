package pe.edu.upc.easyshop.domain.repository

import kotlinx.coroutines.flow.Flow
import pe.edu.upc.easyshop.domain.model.Product

interface ProductRepository {

    suspend fun getProducts(): Flow<List<Product>>

    suspend fun syncProducts()
}