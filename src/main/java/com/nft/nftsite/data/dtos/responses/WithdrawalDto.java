package com.nft.nftsite.data.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawalDto {

    private String walletAddress;

    private Long id;

    private Double amount;

    private String network;

    private LocalDateTime createdAt;

}
