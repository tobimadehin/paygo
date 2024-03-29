package com.paygo.PayGo.Payment;

import java.util.List;

public interface PaymentService {
    Payment createPayment(Payment user);

    Payment getPaymentById(Long userId);

    List<Payment> getAllPayments();
}
