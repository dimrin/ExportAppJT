package com.example.fileexportjt.export_feature.data.converter

import com.example.fileexportjt.core.Resource
import com.example.fileexportjt.export_feature.domain.model.ExportModel
import kotlinx.coroutines.flow.Flow


interface DataConverter {

    fun convertSensorData(
        exportDataList: List<ExportModel>
    ) : Flow<Resource<GenerateInfo>>
}