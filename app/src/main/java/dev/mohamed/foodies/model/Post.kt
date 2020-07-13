package dev.mohamed.foodies.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.mohamed.foodies.model.Post.Companion.TABLE_NAME

/**
 * Data class for database entity and serialization
 */
@Entity(tableName = TABLE_NAME)
data class Post(

    @PrimaryKey
    var id: Int? = 0,
    var title: String? = null,
    var author: String? = null,
    var body: String? = null,
    var imagesUrl: String? = null
) {
    companion object {
        const val TABLE_NAME = "Foodies_posts"
    }
}