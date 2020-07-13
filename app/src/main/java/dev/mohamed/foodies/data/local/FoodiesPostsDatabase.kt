package dev.mohamed.foodies.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dev.mohamed.foodies.data.local.dao.PostsDao
import dev.mohamed.foodies.model.Post

/**
 * Abstract Foodium database.
 * It provides DAO [PostsDao] by using method [getPostsDao].
 */
@Database(
    entities = [Post::class],
    version = DatabaseMigrations.DB_VERSION
)
abstract class FoodiesPostsDatabase : RoomDatabase() {

    /**
     * @return [PostsDao] Foodies Posts Data Access Object.
     */
    abstract fun getPostsDao(): PostsDao

    companion object {
        private const val DB_NAME = "foodies_database"

        @Volatile
        private var INSTANCE: FoodiesPostsDatabase? = null

        fun getInstance(context: Context): FoodiesPostsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FoodiesPostsDatabase::class.java,
                    DB_NAME
                )
                    .addMigrations(*DatabaseMigrations.MIGRATIONS)
                    .build()

                INSTANCE = instance
                return instance

            }
        }
    }

}