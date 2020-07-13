package dev.mohamed.foodies.di.module

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dev.mohamed.foodies.ViewModelProviderFactory

@Module
interface ViewModelFactoryModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}