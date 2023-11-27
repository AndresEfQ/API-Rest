package com.example.APIRest.controllers;

import com.example.APIRest.entities.PurchaseOrder;
import com.example.APIRest.services.PurchaseOrderServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/orders")
public class PurchaseOrderController extends BaseControllerImpl<PurchaseOrder, PurchaseOrderServiceImpl> {
}
