package com.lambdaschool.dogsinitial.Model

import com.lambdaschool.dogsinitial.Exception.ValidationError
import java.sql.Timestamp

class ErrorDetail(val title: String,
                  val status: Int,
                  val detail: String,
                  val timestamp: Timestamp,
                  val developerMessage: String)
