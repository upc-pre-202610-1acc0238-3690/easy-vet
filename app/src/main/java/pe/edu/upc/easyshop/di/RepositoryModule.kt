package pe.edu.upc.easyshop.di

import pe.edu.upc.easyshop.data.local.ProductDao
import pe.edu.upc.easyshop.data.repository.ProductRepositoryImpl
import pe.edu.upc.easyshop.data.remote.ProductService
import pe.edu.upc.easyshop.di.RemoteModule.provideProductService
import pe.edu.upc.easyshop.domain.repository.ProductRepository

object RepositoryModule {

    fun provideProductRepository(
        productService: ProductService = provideProductService(),
        productDao: ProductDao = provideProductDao()
    ): ProductRepository {
        return ProductRepositoryImpl(productService, productDao)
    }
}