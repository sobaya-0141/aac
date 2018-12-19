package sobaya.app.aac.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import sobaya.app.aac.App
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, NetworkModule::class,
    ViewModelModule::class, UiModule::class, DatabaseModule::class])
interface AppComponent: AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder

        fun database(database: DatabaseModule): Builder

        fun build(): AppComponent
    }

    override fun inject(app: App)
}