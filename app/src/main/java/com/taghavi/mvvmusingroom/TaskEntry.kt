package com.taghavi.mvvmusingroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "task")
class TaskEntry {
    @PrimaryKey(autoGenerate = true)
    private var id = 0
    private var description: String
    private var priority: Int

    @ColumnInfo(name = "updated_at")
    private var updatedAt: Date

    @Ignore
    constructor(description: String, priority: Int, updatedAt: Date) {
        this.description = description
        this.priority = priority
        this.updatedAt = updatedAt
    }

    constructor(id: Int, description: String, priority: Int, updatedAt: Date) {
        this.id = id
        this.description = description
        this.priority = priority
        this.updatedAt = updatedAt
    }
}