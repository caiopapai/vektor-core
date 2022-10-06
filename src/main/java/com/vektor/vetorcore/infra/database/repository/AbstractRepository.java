package com.vektor.vetorcore.infra.database.repository;

import com.vektor.vetorcore.domain.entities.Income;

public interface AbstractRepository {

    void insert(Income income);

    void update(Income income);

    void delete(Income income);

}


