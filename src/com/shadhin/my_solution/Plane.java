package com.shadhin.my_solution;

public class Plane extends Vehicle{
    @Override
    int set_num_of_passengers() {
        return 100;
    }

    @Override
    boolean has_gas() {
        return false;
    }
}
