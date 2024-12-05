package com.micservproject.accounts.service;

import com.micservproject.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Customer Mobile Number
     */
    CustomerDto fetchAccountDetails(String mobileNumber);


    /**
     *
     * @param customerDto - CustomerDto Object
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Customer Mobile Number
     */
    boolean deleteAccount(String mobileNumber);
}
