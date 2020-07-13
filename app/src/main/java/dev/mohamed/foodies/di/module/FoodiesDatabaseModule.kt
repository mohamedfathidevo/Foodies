package dev.mohamed.foodies.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import dev.mohamed.foodies.data.local.FoodiesPostsDatabase
import javax.inject.Singleton

@Module
class FoodiesDatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = FoodiesPostsDatabase.getInstance(application)

    @Singleton
    @Provides
    fun providePostDao(database: FoodiesPostsDatabase) = database.getPostsDao()
}