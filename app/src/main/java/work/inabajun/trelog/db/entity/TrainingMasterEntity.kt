package work.inabajun.trelog.db.entity
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters

@Entity
@TypeConverters(TrainingPartConverter::class, TrainingUnitTypeConverter::class)
data class TrainingMasterEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val unitType: TrainingUnitType,
    val part: TrainingPart
)