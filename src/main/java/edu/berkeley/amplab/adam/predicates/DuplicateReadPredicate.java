package edu.berkeley.amplab.adam.predicates;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import edu.berkeley.amplab.adam.avro.ADAMRecord;

public class DuplicateReadPredicate implements Predicate<ADAMRecord> {

    @Override
    public boolean apply(ADAMRecord input) {
        Preconditions.checkNotNull(input);
        return Optional.fromNullable(input.getDuplicateReadFlag()).or(Boolean.FALSE);
    }
}