package com.shadhin.my_solution;

public class Car extends Vehicle{

    @Override
    int set_num_of_passengers() {
        return 4;
    }

    @Override
    boolean has_gas() {
        return true;
    }
}
