package com.example.APIRest.controllers;

import com.example.APIRest.dtos.PurchaseOrderDTO;
import com.example.APIRest.entities.PurchaseOrder;
import com.example.APIRest.mappers.PurchaseOrderMapper;
import com.example.APIRest.services.PurchaseOrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/orders")
public class PurchaseOrderController extends BaseControllerImpl<PurchaseOrder, PurchaseOrderDTO, PurchaseOrderMapper, PurchaseOrderService> {
}
