package com.example.APIRest.mappers;

import com.example.APIRest.controllers.BaseControllerImpl;
import com.example.APIRest.dtos.PurchaseOrderDTO;
import com.example.APIRest.entities.PurchaseOrder;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderMapper extends BaseMapperImp<PurchaseOrder, PurchaseOrderDTO> implements BaseMapper<PurchaseOrder, PurchaseOrderDTO> {
    @Override
    public PurchaseOrderDTO entityToDTO(PurchaseOrder purchaseOrder) {
        return modelMapper.map(purchaseOrder, PurchaseOrderDTO.class);
    }
}
