package com.vektor.vetorcore.usecase.definition;

public interface UseCase<Input, Output> {


    Output execute(Input input);

}
