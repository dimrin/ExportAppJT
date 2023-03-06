package com.example.fileexportjt.export_feature.data.file

import com.example.fileexportjt.core.Resource

interface FileWriter {

    suspend fun writeFile(byteArray: ByteArray): Resource<String>

    companion object{
        const val FILE_NAME = "FileExportApp"
    }

}