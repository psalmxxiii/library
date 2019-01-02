package io.pillopl.library.lending.domain.patron;

import static io.pillopl.library.lending.domain.patron.OverdueCheckouts.noOverdueCheckouts;
import static io.pillopl.library.lending.domain.patron.PlacingOnHoldPolicy.allCurrentPolicies;

public class PatronBooksFactory {

    public PatronBooks recreateFrom(PatronInformation patronInformation, PatronHolds patronHolds) {
        //TODO overduecheckouts
        return new PatronBooks(patronInformation, allCurrentPolicies(), noOverdueCheckouts(), patronHolds);
    }

}
