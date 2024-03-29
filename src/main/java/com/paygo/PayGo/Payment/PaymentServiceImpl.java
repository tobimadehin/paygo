package com.paygo.PayGo.Payment;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private PaymentRepository paymentRepository;

    @Override
    public Payment createPayment(Payment user) {
        return paymentRepository.save(user);
    }

    @Override
    public Payment getPaymentById(Long userId) {
        Optional<Payment> optionalUser = paymentRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
