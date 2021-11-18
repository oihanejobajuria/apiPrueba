package com.example.appPrueba.repository;

import com.example.appPrueba.domain.model.FileMy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FileRepository extends JpaRepository<FileMy, UUID> {
    @Query("select fileid from FileMy")
    List<String> getFileIds();
}
