package com.hypertek.bootstrap;

import com.hypertek.entity.Customer;
import com.hypertek.entity.Merchant;
import com.hypertek.entity.Payment;
import com.hypertek.entity.PaymentDetail;
import com.hypertek.enums.PAYMENTSTATUS;
import com.hypertek.repository.CustomerRepository;
import com.hypertek.repository.MerchantRepository;
import com.hypertek.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Component
public class DataGenerator implements CommandLineRunner {
    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final CustomerRepository customerRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository ,CustomerRepository customerRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Payment p1 = new Payment(new BigDecimal(1234), LocalDate.of(2024,3,11), PAYMENTSTATUS.SUCCESSFUL);
        Payment p2 = new Payment(new BigDecimal(3454), LocalDate.of(2024,4,11), PAYMENTSTATUS.SUCCESSFUL);
        Payment p3 = new Payment(new BigDecimal(1233454), LocalDate.of(2024,5,11), PAYMENTSTATUS.FAIL);

        PaymentDetail paymentDetail = new PaymentDetail(new BigDecimal(2345),new BigDecimal(2343324),LocalDate.of(2024,3,11));
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal(34232),new BigDecimal(34343664),LocalDate.of(2024,4,11));
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal(432445),new BigDecimal(3423),LocalDate.of(2024,5,11));
        p1.setPaymentDetail(paymentDetail);
        p2.setPaymentDetail(paymentDetail1);
        p3.setPaymentDetail(paymentDetail2);
        List<Payment> payments = Arrays.asList(p1,p2,p3);
        Merchant merchant = new Merchant("Amazon","M123",new BigDecimal("0.43"),new BigDecimal("3.45"),5);
        p1.setMerchant(merchant);
        p2.setMerchant(merchant);
        p3.setMerchant(merchant);
        Customer customer =  new Customer("32 Darby Dr","John@gmail.com","John","Smith","JohnSmith");
        p1.setCustomer(customer);
        p2.setCustomer(customer);
        p3.setCustomer(customer);
        customerRepository.save(customer);
        merchantRepository.save(merchant);
        paymentRepository.saveAll(payments);





    }
}
