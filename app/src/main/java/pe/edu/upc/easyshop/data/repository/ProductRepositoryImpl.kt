package pe.edu.upc.easyshop.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import pe.edu.upc.easyshop.data.remote.ProductService
import pe.edu.upc.easyshop.domain.model.Product
import pe.edu.upc.easyshop.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val productService: ProductService
) : ProductRepository {
    override suspend fun getProducts(): List<Product> = withContext(Dispatchers.IO) {

        val response = productService.getProducts()

        if (response.isSuccessful) {
            response.body()?.let { productsDto ->
                return@withContext productsDto.products.map { productDto ->
                    Product(
                        id = productDto.id,
                        name = productDto.title,
                        price = productDto.price,
                        description = productDto.description,
                        image = productDto.image
                    )
                }
            }
        }

        return@withContext emptyList()
    }
}