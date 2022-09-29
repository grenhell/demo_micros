package com.example.billservice.controller;

import com.example.billservice.controller.DTO.BillRequestDTO;
import com.example.billservice.controller.DTO.BillResponseDTO;
import com.example.billservice.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BillController {

    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/{billid}")
    public BillResponseDTO getBillById (@PathVariable Long billid) {
        return new BillResponseDTO(billService.getBillById(billid));
    }

    @PostMapping("/")
    public Long createBill (@RequestBody BillRequestDTO billRequestDTO) {
        return billService.createBill(billRequestDTO.getAccountId(), billRequestDTO.getAmount(),
                billRequestDTO.getIsDefault(), billRequestDTO.getOverdraftEnabled());
    }

    @PutMapping("/{billId}")
    public BillResponseDTO updateBill (@PathVariable Long billId, @RequestBody BillRequestDTO billRequestDTO) {
        return new BillResponseDTO(billService.updateBill(billId, billRequestDTO.getAccountId(), billRequestDTO.getAmount(),
                billRequestDTO.getIsDefault(), billRequestDTO.getOverdraftEnabled()));

    }

    @DeleteMapping("/{billId}")
    public BillResponseDTO deleteBill (@PathVariable Long billId) {
        return new BillResponseDTO(billService.deleteBill(billId));
    }
}
