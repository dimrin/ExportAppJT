package com.example.fileexportjt.export_feature.domain.repository

import com.example.fileexportjt.core.Resource
import com.example.fileexportjt.export_feature.domain.model.ExportModel
import com.example.fileexportjt.export_feature.domain.model.PathInfo
import kotlinx.coroutines.flow.Flow

interface ExportRepository {

    fun startExportData(
        exportList: List<ExportModel>
    ): Flow<Resource<PathInfo>>
}