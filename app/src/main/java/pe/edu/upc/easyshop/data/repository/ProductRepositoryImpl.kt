package pe.edu.upc.easyshop.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import pe.edu.upc.easyshop.data.local.ProductDao
import pe.edu.upc.easyshop.data.mapper.toDomain
import pe.edu.upc.easyshop.data.mapper.toEntity
import pe.edu.upc.easyshop.data.remote.ProductService
import pe.edu.upc.easyshop.domain.model.Product
import pe.edu.upc.easyshop.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val productService: ProductService,
    private val productDao: ProductDao
) : ProductRepository {

    override suspend fun getProducts(): Flow<List<Product>> = withContext(Dispatchers.IO) {
        return@withContext productDao.getProducts().map { entities ->
            entities.map { productEntity ->
                productEntity.toDomain()
            }

        }
    }

    override suspend fun syncProducts() {
        val response = productService.getProducts()

        if (response.isSuccessful) {
            response.body()?.let { productsDto ->
                val entities = productsDto.products.map { productDto ->
                    productDto.toEntity()
                }
                productDao.deleteAllProducts()
                productDao.insertProducts(entities)
            }
        }

    }
}