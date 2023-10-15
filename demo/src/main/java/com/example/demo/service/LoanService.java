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
        loan.setLoanAmountRepaid((long) (loan.getLoanAmountTaken() * (interest.getTerm() / Constant.MONTH_OF_YEAR) * (interest.getPercent()/100)));
        return loanRepository.save(loan);
    }
}
