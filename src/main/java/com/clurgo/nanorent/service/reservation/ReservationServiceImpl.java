package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.entity.Reservation;
import com.clurgo.nanorent.entity.Resource;
import com.clurgo.nanorent.repository.ReservationRepository;
import com.clurgo.nanorent.repository.ResourceRepository;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Reservation reservation = reservationRepository.findById(id).orElseThrow();

        return ReservationDTO.builder()
                .id(reservation.getId())
                .username(reservation.getUsername())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .build();
    }

    @Override
    public void addReservation(ReservationDTO reservationDTO) {
        Optional<Resource> resource = resourceRepository.findById(reservationDTO.getResourceId());
        Reservation reservation = Reservation.builder()
                .username(reservationDTO.getUsername())
                .startDate(reservationDTO.getStartDate())
                .endDate(reservationDTO.getEndDate())
                .resource(resource.get())
                .build();

        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
