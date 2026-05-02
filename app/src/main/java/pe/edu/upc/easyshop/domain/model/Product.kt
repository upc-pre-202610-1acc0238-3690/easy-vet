package pe.edu.upc.easyshop.domain.model

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val image: String
)