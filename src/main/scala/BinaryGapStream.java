import java.util.stream.Stream;

public class BinaryGapStream {
    public int getMaxBinaryGap(long n){

        Stream.iterate(
                new Long[]{n, 0L},
                f -> new Long[] {f[0]/2, f[0]%2 })
                .map(f->f[1]);
                //.reduce(new int[]{0,0,0}, f-> )

        return 0;
    }
}
