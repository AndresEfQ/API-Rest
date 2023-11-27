package com.example.APIRest.services;

import com.example.APIRest.entities.PurchaseOrder;
import com.example.APIRest.repositories.BaseRepository;
import com.example.APIRest.repositories.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderServiceImpl extends BaseServiceImpl<PurchaseOrder, Long> {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrderServiceImpl(BaseRepository<PurchaseOrder, Long> baseRepository) {
        super(baseRepository);
    }
}
