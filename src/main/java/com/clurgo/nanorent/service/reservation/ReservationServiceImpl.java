package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.entity.Reservation;
import com.clurgo.nanorent.entity.Resource;
import com.clurgo.nanorent.repository.ReservationRepository;
import com.clurgo.nanorent.repository.ResourceRepository;
import com.clurgo.nanorent.rest.reservation.errors.ReservationNotFoundException;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import com.clurgo.nanorent.rest.resource.errors.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final ResourceRepository resourceRepository;

    @Override
    public List<ReservationDTO> getReservationsByResourceId(Long id) {
        return reservationRepository.getReservationByResource_Id(id);
    }

    @Override
    public ReservationDTO getReservationById(Long id) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow(ReservationNotFoundException::new);

        return ReservationDTO.builder()
                .id(reservation.getId())
                .username(reservation.getUsername())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .build();
    }

    @Override
    public void addReservation(ReservationDTO reservationDTO) {
        Resource resource = resourceRepository.findById(reservationDTO.getResourceId()).orElseThrow(ResourceNotFoundException::new);
        Reservation reservation = Reservation.builder()
                .username(reservationDTO.getUsername())
                .startDate(reservationDTO.getStartDate())
                .endDate(reservationDTO.getEndDate())
                .resource(resource)
                .build();

        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
