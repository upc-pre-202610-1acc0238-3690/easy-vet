package pe.edu.upc.easyshop.data.remote

import com.google.gson.annotations.SerializedName

data class ProductsDto(
    val count: Int,
    @SerializedName("results")
    val products: List<ProductDto>
)

data class ProductDto(
    val id: Int,
    val title: String,
    val description: String,
    val category: String,
    val rating: Double,
    val stock: Int,
    val image: String,
    val price: Double
)

