package fibonacci;

import java.math.BigInteger;
import java.util.logging.Logger;

public class Fibonacci {

    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private  String len;

    Fibonacci(String sequenceLength) {
        this.len = sequenceLength;
    }

    String getSequence() throws IllegalArgumentException {

        BigInteger n1=BigInteger.ZERO;
        BigInteger n2=BigInteger.ONE;
        BigInteger n3;
        BigInteger i;
        BigInteger sequenceLength;
        StringBuilder sb = new StringBuilder();

        sequenceLength = getNumericSequenceLength();

        if (sequenceLength.compareTo(BigInteger.ZERO) > 0) {
            if (sequenceLength.equals(BigInteger.ONE))
                sb.append("0");
            else
                sb.append("0,1");

            //loop starts from 2 because 0 and 1 are already accounted for
           for(i = new BigInteger("2"); i.compareTo(sequenceLength) < 0 ; i = i.add(BigInteger.ONE))
            {
                n3=n1.add(n2);
                sb.append(",").append(n3);
                n1=n2;
                n2=n3;
            }
        }
        return sb.toString();
    }

    private BigInteger getNumericSequenceLength() throws IllegalArgumentException {

        String ILLEGAL_LEN_VALUE =
                "The 'len' parameter must contain only one or more decimal digits";

        // only accept numeric characters in the 'len' value
        if (! len.matches("\\d+")) {
            logger.info("illegal character found in len value = " + len);
            throw new IllegalArgumentException(ILLEGAL_LEN_VALUE);
        }

        // convert the string 'len' to a BigInteger and detect any bad input if any
        BigInteger sequenceLength;
        try {
            sequenceLength = new BigInteger(len);
        } catch (NumberFormatException e) {
            logger.info("Long.parse() failed with len value =  " + len);
            throw new IllegalArgumentException(ILLEGAL_LEN_VALUE);
        }


        return sequenceLength;
    }
}
