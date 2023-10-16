package com.example.demo.service;

import com.example.demo.entity.Interest;
import com.example.demo.entity.Loan;
import com.example.demo.repository.InterestRepository;
import com.example.demo.repository.LoanRepository;
import com.example.demo.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Service
public class LoanService{
    @Autowired
    private LoanRepository loanRepository;
    @Autowired
    private InterestRepository interestRepository;

    public Loan customerLoan(Loan loan){
        loan.setLoanTransactionDate(new Date());
        Interest interest  = interestRepository.findById(loan.getInterestId()).orElse(null);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,  interest.getTerm());
        loan.setDurationInYears(cal.getTime());
        loan.setLoanAmountRepaid((long) ((loan.getLoanAmountTaken() * ((double)interest.getTerm() / (double)Constant.MONTH_OF_YEAR)) * (interest.getPercent()/100)) + loan.getLoanAmountTaken());
        loan.setRepaid(0l);
        loan.setStatus(1);
        loan.setUpdatedDate(new Date());
        return loanRepository.save(loan);
    }

    public Loan customerPayment(Loan loan){
        loan.setRepaid(loan.getRepaid() + loan.getPayment());
        if(Objects.equals(loan.getRepaid(), loan.getLoanAmountRepaid())){
            loan.setStatus(0);
        }
        return loanRepository.save(loan);
    }
}
