package com.example.billservice.controller.DTO;

import com.example.billservice.entity.Bill;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@AllArgsConstructor
@Getter
public class BillResponseDTO {

    private Long billId;

    private  Long accountId;

    private BigDecimal amount;

    private Boolean isDefault;

    private OffsetDateTime creationDate;

    private Boolean overdraftEnabled;

    public BillResponseDTO(Bill bill) {
        this.billId = bill.getBillId();
        this.accountId = bill.getAccountId();
        this.amount = bill.getAmount();
        this.isDefault = bill.getIsDefault();
        this.creationDate = bill.getCreationDate();
        this.overdraftEnabled = bill.getOverdraftEnabled();
    }

}
