package work.inabajun.trelog.db.entity

import android.support.test.runner.AndroidJUnit4
import org.junit.runner.RunWith
import android.support.test.InstrumentationRegistry
import org.junit.Test
import work.inabajun.trelog.db.AppDatabase


@RunWith(AndroidJUnit4::class)
class TrainingMasterDaoTest {

    @Test
    fun testInsertTrainingMasterEntity() {

        // setup
        var db = AppDatabase.getInstance(InstrumentationRegistry.getTargetContext())
        var sut = db.trainingMasterDao()

        // exercise
        var entity = TrainingMasterEntity(1, "name", "type")
        sut.insertTrainingMasterEntity(entity)

    }
}

