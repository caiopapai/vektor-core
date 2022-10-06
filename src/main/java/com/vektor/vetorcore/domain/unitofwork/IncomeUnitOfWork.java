package com.vektor.vetorcore.domain.unitofwork;

import com.vektor.vetorcore.domain.entities.Income;
import com.vektor.vetorcore.infra.database.repository.AbstractRepository;
import com.vektor.vetorcore.infra.database.repository.IncomeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IncomeUnitOfWork implements UnitOfWork<Income>{

    private final Map<String, List<Income>> context;

    private final AbstractRepository incomeRepository;

    public IncomeUnitOfWork (Map<String, List<Income>> context, AbstractRepository abstractRepository) {
        this.context = context;
        this.incomeRepository = abstractRepository;
    }


    private void register(Income income, String operation) {
        List<Income> incomesToOperate = context.get(operation);
        if (incomesToOperate == null) {
            incomesToOperate = new ArrayList<>();
        }
        incomesToOperate.add(income);
        context.put(operation, incomesToOperate);
    }

    @Override
    public void registerNew(Income entity) {
        register(entity, UnitOfWork.INSERT);
    }

    @Override
    public void registerModified(Income entity) {
        register(entity, UnitOfWork.MODIFY);
    }

    @Override
    public void registerDeleted(Income entity) {
        register(entity, UnitOfWork.DELETE);
    }

    @Override
    public void commit() {

    }

    private void commitInsert() {
        List<Income> incomesToInsert = context.get(UnitOfWork.INSERT);
        for (Income income : incomesToInsert) {
            incomeRepository.insert(income);
        }
    }

    private void commitModify() {
        List<Income> modifiedIncomes = context.get(UnitOfWork.MODIFY);
            for (Income income : modifiedIncomes) {
            incomeRepository.update(income);
        }
    }

    private void commitDelete() {
        List<Income> deletedIncomes = context.get(UnitOfWork.DELETE);
        for (Income income : deletedIncomes) {
            incomeRepository.delete(income);
        }
    }
}
