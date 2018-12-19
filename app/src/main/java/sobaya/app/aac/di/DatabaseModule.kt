package sobaya.app.aac.di

import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import sobaya.app.aac.App
import sobaya.app.aac.data.local.Database
import sobaya.app.aac.data.local.dao.OwnerDao
import sobaya.app.aac.data.local.dao.RepoDao
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: App): Database = Room.databaseBuilder(app, Database::class.java,
        "all_sample.db").build()

    @Provides
    @Singleton
    fun provideRepoDao(db: Database): RepoDao = db.repoDao()

    @Provides
    @Singleton
    fun provideOwnerDao(db: Database): OwnerDao = db.ownerDao()
}