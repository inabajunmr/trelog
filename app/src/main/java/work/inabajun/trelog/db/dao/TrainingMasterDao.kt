package work.inabajun.trelog.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import work.inabajun.trelog.db.entity.TrainingMasterEntity


@Dao
interface TrainingMasterDao {

    @Query("SELECT * FROM trainingmasterentity")
    fun loadAllTrainingMaster(): LiveData<List<TrainingMasterEntity>>

    @Query("SELECT * FROM trainingmasterentity WHERE id = :id")
    fun loadTrainingMaster(id: Long): TrainingMasterEntity

    @Insert(onConflict = REPLACE)
    fun insertTrainingMasterEntity(entity: TrainingMasterEntity)
}