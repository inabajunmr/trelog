package work.inabajun.trelog.db.entity

import android.arch.persistence.room.TypeConverter

enum class TrainingUnitType {
    HHMMDDSS,
    SS,
    COUNT,
    KG_COUNT

}

class TrainingUnitTypeConverter {

    @TypeConverter
    fun toTrainingPart(value: String): TrainingUnitType = TrainingUnitType.values().first { it.name == value }

    @TypeConverter
    fun toString(value: TrainingUnitType): String = value.name
}