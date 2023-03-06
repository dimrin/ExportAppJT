package com.example.fileexportjt.export_feature.presentation.state

data class FileExportState(
    val isGeneratingLoading: Boolean = false,
    val isShareDataClicked: Boolean = false,
    val isShareDataReady: Boolean = false,
    val shareDataUri: String? = null,
    val failedGenerating: Boolean = false,
    val generatingProgress: Int = 0
)
