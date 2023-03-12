package com.example.common_database

import androidx.room.*

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article):Long

    @Query("SELECT * FROM articles")
    suspend fun getAllArticles(): List<Article>

    @Delete
    suspend fun deleteArticle(article: Article)
}