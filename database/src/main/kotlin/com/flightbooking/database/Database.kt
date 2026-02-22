package com.flightbooking.database

import org.jetbrains.exposed.v1.jdbc.Database

object Database {
    const val URL = "jdbc:sqlite:/data/data.db"
    const val DRIVER = "org.sqlite.JDBC"

    val db by lazy {
        Database.connect(URL, DRIVER)
    }
}
