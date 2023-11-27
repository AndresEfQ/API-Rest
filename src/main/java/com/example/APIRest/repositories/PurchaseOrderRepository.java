package com.example.APIRest.repositories;

import com.example.APIRest.entities.PurchaseOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends BaseRepository<PurchaseOrder, Long> {
}
