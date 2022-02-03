package com.helton.freight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helton.freight.models.FreightOrder;

@Repository
public interface FreightOrderRepository extends JpaRepository<FreightOrder, Long>
{

}
