package com.example.onwatch

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ModelClass (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var brand: String,
    var model: String,
    var price: String,
) {}