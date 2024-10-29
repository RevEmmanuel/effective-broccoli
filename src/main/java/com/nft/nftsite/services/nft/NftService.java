package com.nft.nftsite.services.nft;

import com.nft.nftsite.data.dtos.requests.CreateCategoryRequest;
import com.nft.nftsite.data.dtos.requests.CreateNftRequest;
import com.nft.nftsite.data.dtos.requests.NftFilterDto;
import com.nft.nftsite.data.dtos.responses.CategoryResponse;
import com.nft.nftsite.data.dtos.responses.NftResponse;
import com.nft.nftsite.data.models.Category;
import com.nft.nftsite.utils.PageDto;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;

public interface NftService {

    // NFTS
    NftResponse createNewNft(@Valid CreateNftRequest nftRequest);

    PageDto<NftResponse> getAllNfts(Pageable pageable, NftFilterDto filterDto);


    // CATEGORY
    CategoryResponse createNewCategory(@Valid CreateCategoryRequest categoryRequest);

    Category findCategoryById(Long categoryId);

    void deleteCategoryByName(String categoryName);

    void deleteCategoryById(Long categoryId);

}