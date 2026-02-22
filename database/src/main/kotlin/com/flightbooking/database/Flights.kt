package com.flightbooking.database

import org.jetbrains.exposed.v1.core.dao.id.EntityID
import org.jetbrains.exposed.v1.core.dao.id.IntIdTable
import org.jetbrains.exposed.v1.core.isNull
import org.jetbrains.exposed.v1.core.less
import org.jetbrains.exposed.v1.core.neq
import org.jetbrains.exposed.v1.core.or
import org.jetbrains.exposed.v1.dao.IntEntity
import org.jetbrains.exposed.v1.dao.IntEntityClass
import org.jetbrains.exposed.v1.javatime.datetime

/**
 * Max length for varchar fields, set to 256 from previous project.
 */
const val MAX_VARCHAR_LENGTH = 256

/**
 * Length for flight location (e.g., "LHR", "JFK").
 */
const val FLIGHT_LOCATION_LENGTH = 3

/**
 * Flight table definition with constraints:
 * - startLocation and endLocation cannot be the same.
 * - scheduledDeparture must be before scheduledArrival.
 * - If actualDeparture and actualArrival are both set, actualDeparture must be before actualArrival
 */
object FlightsTable : IntIdTable("flights") {
    val flightNumber = varchar("title", MAX_VARCHAR_LENGTH)
    val startLocation = varchar("start_location", FLIGHT_LOCATION_LENGTH)
    val endLocation = varchar("end_location", FLIGHT_LOCATION_LENGTH)
    val capacity = integer("capacity")
    val price = integer("price") // £1.57 = 157 avoiding floats
    val scheduledDeparture = datetime("scheduled_departure")
    val scheduledArrival = datetime("scheduled_arrival")
    val actualDeparture = datetime("actual_departure").nullable()
    val actualArrival = datetime("actual_arrival").nullable()
    val status = varchar("status", MAX_VARCHAR_LENGTH) // scheduled/delayed/cancelled

    init {
        check("diff_locations") { startLocation neq endLocation }
        check("scheduled_order") { scheduledDeparture less scheduledArrival }
        check("chk_actual_order") {
            (actualDeparture.isNull() or actualArrival.isNull()) or (actualDeparture less actualArrival)
        }
    }
}

/**
 * Flight entity definition
 */
class Flights(
    id: EntityID<Int>,
) : IntEntity(id) {
    /**
     * Companion object to link the entity to its table
     */
    companion object : IntEntityClass<Flights>(FlightsTable)

    /**
     * flightNumber: The flight number (e.g., "LHR123")
     */
    var flightNumber by FlightsTable.flightNumber
    var startLocation by FlightsTable.startLocation
    var endLocation by FlightsTable.endLocation
    var capacity by FlightsTable.capacity
    var price by FlightsTable.price
    var scheduledDeparture by FlightsTable.scheduledDeparture
    var scheduledArrival by FlightsTable.scheduledArrival
    var actualDeparture by FlightsTable.actualDeparture
    var actualArrival by FlightsTable.actualArrival
    var status by FlightsTable.status

    override fun toString(): String =
        "Flights(id=$id, " +
            "flightNumber=$flightNumber, " +
            "startLocation=$startLocation, " +
            "endLocation=$endLocation, " +
            "capacity=$capacity, " +
            "price=$price, " +
            "scheduledDeparture=$scheduledDeparture, " +
            "scheduledArrival=$scheduledArrival, " +
            "actualDeparture=$actualDeparture, " +
            "actualArrival=$actualArrival, " +
            "status=$status)"
}
