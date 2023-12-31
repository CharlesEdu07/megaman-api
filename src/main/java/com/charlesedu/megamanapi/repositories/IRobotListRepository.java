package com.charlesedu.megamanapi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charlesedu.megamanapi.entities.RobotList;

@Repository
public interface IRobotListRepository extends JpaRepository<RobotList, UUID> {
    RobotList findByUserId(UUID idUser);
}
