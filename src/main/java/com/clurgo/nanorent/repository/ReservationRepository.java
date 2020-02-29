package com.clurgo.nanorent.repository;

import com.clurgo.nanorent.entity.Reservation;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "SELECT count(*) FROM reservation r " +
            "WHERE r.start_date between ?1 and ?2 AND r.end_date between ?1 and ?2",
                nativeQuery = true)
    Integer countReservations(LocalDate startDate,  LocalDate endDate);

    List<ReservationDTO> getReservationByResource_Id(Long id);
}
