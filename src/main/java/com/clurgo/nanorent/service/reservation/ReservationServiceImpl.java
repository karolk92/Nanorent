package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import com.clurgo.nanorent.service.category.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{


    @Override
    public ReservationDTO getReservationById(Long id) {
        return null;
    }

    @Override
    public void addReservation(ReservationDTO reservationDTO) {

    }

    @Override
    public void deleteReservation(ReservationDTO reservationDTO) {

    }
}
