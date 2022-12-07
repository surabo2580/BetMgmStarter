package com.example.assignmentone.domain.model

import com.example.assignmentone.data.dto.Entry

data class DynaconRequest(
    var Entries : ArrayList<EntriesRequest> = arrayListOf()
)