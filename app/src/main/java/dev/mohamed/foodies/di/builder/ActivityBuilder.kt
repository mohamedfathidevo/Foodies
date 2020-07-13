package dev.mohamed.foodies.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.mohamed.foodies.ui.details.PostDetailsActivity
import dev.mohamed.foodies.ui.main.MainActivity
import kotlinx.coroutines.ExperimentalCoroutinesApi


@Module
abstract class ActivityBuilder {

    @ExperimentalCoroutinesApi
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ExperimentalCoroutinesApi
    @ContributesAndroidInjector
    abstract fun bindPostDetailsActivity(): PostDetailsActivity

}