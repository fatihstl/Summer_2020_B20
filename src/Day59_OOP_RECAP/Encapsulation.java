package Day59_OOP_RECAP;

import java.time.LocalDate;

public class Encapsulation {
    private  int ssn;

    private final LocalDate publisted = LocalDate.of(2020, 9, 7);

    public  int getSSN(){ // get method
        return ssn;
    }

  public void setSsn(){// set method



}

    public LocalDate getPublisted() {
        return publisted;
    }
}
