/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.backEndProject.Repository;

import com.example.backEndProject.Modele.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hp
 */
public interface Sessionrepository extends JpaRepository<Session, Long>{
    Session findSessionByIdpatient(Long idPatient);
    
    Session findSessionByCode(String code);
}
