package io.zhudy.duic.domain

import org.joda.time.DateTime

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
class AppContentHistory(
        var hid: String = "",
        var modifier: String = "",
        var content: String = "",
        var updated_at: DateTime = DateTime.now()
)