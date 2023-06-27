package com.yoti.mobile.android.capture.face.demo.util

import com.yoti.mobile.android.commons.image.ImageBuffer
import com.yoti.mobile.android.commons.image.toBitmap
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ImageBufferToBitmapConverter(
        private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend fun convert(imageBuffer: ImageBuffer) = withContext(ioDispatcher) {
        imageBuffer.toBitmap()
    }
}