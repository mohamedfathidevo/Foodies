package dev.mohamed.foodies.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dev.mohamed.foodies.FoodiesApp
import dev.mohamed.foodies.di.builder.ActivityBuilder
import dev.mohamed.foodies.di.module.FoodiesApiModule
import dev.mohamed.foodies.di.module.FoodiesDatabaseModule
import dev.mohamed.foodies.di.module.ViewModelFactoryModule
import dev.mohamed.foodies.di.module.ViewModelModule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        FoodiesDatabaseModule::class,
        FoodiesApiModule::class,
        ActivityBuilder::class,
        ViewModelFactoryModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<FoodiesApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun create(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(app: FoodiesApp)
}