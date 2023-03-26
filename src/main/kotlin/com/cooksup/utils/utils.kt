package com.cooksup.utils

import java.io.File
import java.net.URL

private fun downloadFile(link: String, filename: String = link.substringAfterLast('/')) {
    File(filename).writeBytes(URL(link).readBytes())
}
