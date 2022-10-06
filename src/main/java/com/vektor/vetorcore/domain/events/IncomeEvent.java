package com.vektor.vetorcore.domain.events;

import com.vektor.vetorcore.domain.value.objects.IncomeType;
import com.vektor.vetorcore.domain.value.objects.Recurrence;

import java.math.BigDecimal;

public class IncomeEvent {

    private String event_id;
    private IncomeType incomeType;
    private Boolean isInvestment;
    private Boolean isRecurrent;
    private Recurrence recurrence;
    private BigDecimal value;


}
