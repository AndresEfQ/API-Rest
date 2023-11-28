package com.example.APIRest.services;

import com.example.APIRest.dtos.PurchaseOrderDTO;
import com.example.APIRest.entities.PurchaseOrder;
import com.example.APIRest.mappers.BaseMapperImp;
import com.example.APIRest.mappers.PurchaseOrderMapper;
import com.example.APIRest.repositories.BaseRepository;
import com.example.APIRest.repositories.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService extends BaseServiceImpl<PurchaseOrder, PurchaseOrderDTO, PurchaseOrderMapper, Long> {

    public PurchaseOrderService(BaseRepository<PurchaseOrder, Long> baseRepository, PurchaseOrderMapper purchaseOrderMapper) {
        super(baseRepository);
        this.modelMapper = purchaseOrderMapper;
    }
}
