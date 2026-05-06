package pe.edu.upc.easyshop.di

import androidx.room.Room
import pe.edu.upc.easyshop.MyApplication
import pe.edu.upc.easyshop.data.local.AppDatabase

object LocalModule {

    fun provideDatabase(): AppDatabase {
        return Room.databaseBuilder(
            context = MyApplication.instance.applicationContext,
            klass = AppDatabase::class.java,
            name = "easy-vet.db"
        ).build()
    }

    fun provideProductDao() = provideDatabase().productDao()

}