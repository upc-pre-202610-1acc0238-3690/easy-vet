package pe.edu.upc.easyshop.domain.repository

import pe.edu.upc.easyshop.domain.model.Product

interface ProductRepository {

    suspend fun getProducts(): List<Product>
}