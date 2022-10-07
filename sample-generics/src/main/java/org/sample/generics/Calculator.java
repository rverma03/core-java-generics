package org.sample.generics;

import java.util.*;

public class Calculator<N extends Number & Comparable<N>> {
    private List<N> operands;

    public Calculator(List<N> operands) {
        this.operands = operands;
    }

    public List<N> getSortedList() {
        Collections.sort(this.operands);
        return operands;
    }

    public N getMaxValue() {
        return Collections.max(operands);
    }

    public List<N> getList() {

        return this.operands;
    }
}
