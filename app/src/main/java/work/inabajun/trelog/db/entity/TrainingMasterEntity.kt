package work.inabajun.trelog.db.entity
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class TrainingMasterEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val type: String
)