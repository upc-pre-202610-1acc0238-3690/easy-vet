package pe.edu.upc.easyshop.data.mapper

import pe.edu.upc.easyshop.data.local.ProductEntity
import pe.edu.upc.easyshop.data.remote.ProductDto
import pe.edu.upc.easyshop.domain.model.Product

fun ProductDto.toEntity(): ProductEntity {
    return ProductEntity(
        id = id,
        name = title,
        price = price,
        description = description,
        image = image
    )
}

fun ProductEntity.toDomain(): Product {
    return Product(
        id = id,
        name = name,
        price = price,
        description = description,
        image = image
    )
}