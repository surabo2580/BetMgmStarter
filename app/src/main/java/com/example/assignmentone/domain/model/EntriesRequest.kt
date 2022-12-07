package com.example.assignmentone.domain.model

import com.google.gson.annotations.SerializedName

data class EntriesRequest (
    var id          : String? = null,
    var relativeUri : String? = null,
    var method      : String? = null
)