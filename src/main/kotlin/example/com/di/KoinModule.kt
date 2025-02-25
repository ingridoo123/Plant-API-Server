package example.com.di

import PlantRepositoryImpl
import example.com.repository.PlantRepository
import org.koin.dsl.module

val koinModule = module {
    single<PlantRepository> {
       PlantRepositoryImpl()
    }
}