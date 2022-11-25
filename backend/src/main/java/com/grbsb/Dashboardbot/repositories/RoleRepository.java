package com.grbsb.Dashboardbot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grbsb.Dashboardbot.entities.*;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

		

