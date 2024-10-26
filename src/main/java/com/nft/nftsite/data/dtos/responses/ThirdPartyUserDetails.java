package com.nft.nftsite.data.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ThirdPartyUserDetails {

    private String id;

    private String firstName;

    private String lastName;

    private String email;

}
