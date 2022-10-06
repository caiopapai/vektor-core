package com.vektor.vetorcore.domain.unitofwork;

public interface UnitOfWork<T> {
    String INSERT = "INSERT";
    String DELETE = "DELETE";
    String MODIFY = "MODIFY";

    void registerNew(T entity);

    void registerModified(T entity);

    void registerDeleted(T entity);

    void commit();

}