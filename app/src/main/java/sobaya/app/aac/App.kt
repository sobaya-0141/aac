package sobaya.app.aac

import dagger.android.support.DaggerApplication
import sobaya.app.aac.di.DaggerAppComponent
import sobaya.app.aac.di.DatabaseModule

class App: DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .database(DatabaseModule())
        .build()
}