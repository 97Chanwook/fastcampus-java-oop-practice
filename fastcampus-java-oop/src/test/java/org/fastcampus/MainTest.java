package org.fastcampus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main(){
        //Give
        String [] args = {"3","2","1"};

        // When And Then
        Main.main(args);
    }
}