package sobaya.app.aac.data.local.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Repo (
    @PrimaryKey(autoGenerate = true)
    val keyId: Long? = null,
    val id: String,
    val name: String
)