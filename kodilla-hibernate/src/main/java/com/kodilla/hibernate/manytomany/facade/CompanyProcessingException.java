package com.kodilla.hibernate.manytomany.facade;

public class CompanyProcessingException extends Exception{

    public static String ERR_NOT_AUTHORIZED = "USer is not authorized";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUBMITTING_ERROR = "Cannot submit order";

    public CompanyProcessingException(String message){
        super(message);
    }
}
