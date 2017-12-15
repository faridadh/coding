import java.math.BigDecimal;
import java.util.stream.Stream;

public class FibonacciStream {
    public static final void main(String[] args){
        Stream.iterate(
                new BigDecimal[] {new BigDecimal(1.0),new BigDecimal(1.0)},
                f -> new BigDecimal[] { f[1], f[0].add(f[1])}
                ).map(f-> f[0]).limit(100).forEach(n ->System.out.println(n));
    }
}
