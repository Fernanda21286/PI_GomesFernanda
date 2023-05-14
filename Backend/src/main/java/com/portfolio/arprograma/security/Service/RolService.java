/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.arprograma.security.Service;

import com.portfolio.arprograma.security.Entity.Rol;
import com.portfolio.arprograma.security.Enums.RolNombre;
import com.portfolio.arprograma.security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
   return iRolRepository.findByRolNombre(rolNombre);
}
    public void save(Rol rol) {
        iRolRepository.save(rol);
    }
}
