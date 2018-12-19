package sobaya.app.aac.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import sobaya.app.aac.data.local.dao.OwnerDao
import sobaya.app.aac.data.local.dao.RepoDao
import sobaya.app.aac.data.local.entity.Owner
import sobaya.app.aac.data.local.entity.Repo

@Database(entities = [Owner::class, Repo::class], version = 1, exportSchema = false)
abstract class Database: RoomDatabase() {

    abstract fun repoDao(): RepoDao
    abstract fun ownerDao(): OwnerDao
}