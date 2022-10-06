package com.vektor.vetorcore.usecase.definition;

import com.vektor.vetorcore.domain.events.IncomeEvent;
import org.springframework.stereotype.Service;

@Service
public class ProcessIncome implements UseCase<IncomeEvent, String>{

    @Override
    public String execute(IncomeEvent incomeEvent) {
        return null;
    }
}
