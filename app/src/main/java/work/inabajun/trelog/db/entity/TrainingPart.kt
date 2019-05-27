package work.inabajun.trelog.db.entity

import android.arch.persistence.room.TypeConverter

enum class TrainingPart(name: String) {
    AEROBIC("有酸素"),
    UPPER("上半身"),
    LOWER("下半身")
}

class TrainingPartConverter {

    @TypeConverter
    fun toTrainingPart(value: String): TrainingPart = TrainingPart.values().first { it.name == value }

    @TypeConverter
    fun toString(value: TrainingPart): String = value.name
}