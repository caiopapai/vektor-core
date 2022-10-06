package com.vektor.vetorcore.resources;

import com.vektor.vetorcore.domain.events.IncomeEvent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events/income")
public class EventsResource {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String receiveIncomeEvent(IncomeEvent incomeEvent){
        return "Not implemented";
    }

}
