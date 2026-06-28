package com.jamildev.service;

import com.jamildev.model.Seller;
import com.jamildev.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);

    SellerReport updateSellerReport(SellerReport sellerReport);

}
