package work.inabajun.trelog.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import work.inabajun.trelog.db.dao.TrainingMasterDao
import work.inabajun.trelog.db.entity.TrainingMasterEntity

@Database(entities = arrayOf(TrainingMasterEntity::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun trainingMasterDao(): TrainingMasterDao

    companion object {
        private val databaseName = "trelog"

        private var db: AppDatabase? = null
        private var dbInstance: TrainingMasterDao? = null

        fun getInstance(context: Context): AppDatabase {
            return Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java).allowMainThreadQueries().build()
        }

        private fun close() {
            db?.close()
        }
    }
}