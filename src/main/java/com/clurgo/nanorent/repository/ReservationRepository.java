package com.clurgo.nanorent.repository;

import com.clurgo.nanorent.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
