package com.codelytical.cameralytical

import android.net.Uri

interface ImageCallback {
	fun onImageCaptured(imageUri: Uri)
	fun onImagePickCancelled()
}
