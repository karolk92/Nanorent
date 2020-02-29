package com.clurgo.nanorent.repository;

import com.clurgo.nanorent.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "SELECT count(*) FROM Reservation " +
            "WHERE (startDate > :startDate AND startDate < :endDate) AND (endDate > :startDate AND endDate < :endDate)",
                nativeQuery = true)
    long countReservations(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
