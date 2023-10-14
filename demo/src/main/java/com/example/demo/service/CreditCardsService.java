package com.example.demo.service;


import com.example.demo.controller.Output.CreditcardsOutput;
import com.example.demo.entity.CreditCards;
import com.example.demo.repository.CreditCardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CreditCardsService{
    @Autowired
    private CreditCardsRepository creditCardsRepository;
    public CreditcardsOutput getCreditCardByPage(int page, int size,  Boolean locked) {
        CreditcardsOutput creditcardsOutput = new CreditcardsOutput();
        Pageable pageable = PageRequest.of(page-1, size);
        Page<CreditCards> cardPage = creditCardsRepository.findByLocked(locked, pageable);
        creditcardsOutput.setPage(page);
        creditcardsOutput.setTotalPage(cardPage.getTotalPages());
        creditcardsOutput.setCreditCards(cardPage.getContent());
        return creditcardsOutput;
    }

    public CreditCards lockCard(int id){
        CreditCards creditCards =  creditCardsRepository.findById(id).orElse(null);
        if(creditCards != null){
            creditCards.setLocked(true);
            return creditCardsRepository.save(creditCards);
        }else {
            return  null;
        }
    }

    public CreditCards unLockCard(int id){
        CreditCards creditCards =  creditCardsRepository.findById(id).orElse(null);
        if(creditCards != null){
            creditCards.setLocked(false);
            return creditCardsRepository.save(creditCards);
        }else {
            return  null;
        }
    }
}
