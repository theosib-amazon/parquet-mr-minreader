import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.parquet.cli.Main;

public class ParquetReadTest {

//    private static File file = new File("/home/theosib/modified.parquet");
//    private static File file = new File("/home/theosib/original.parquet");
private static File file = new File("/home/theosib/guid.parquet");



    public static void main(String[] args) throws IOException {
        ParquetFileReader reader = new ParquetFileReader(file);
        String schema = reader.getSchema();
        System.out.println(schema);
        int num_records = reader.getNumRecords();
        System.out.println("num_records=" + num_records);
        List<String> records = reader.getRecords(num_records);
        for (String s : records) {
            System.out.println(s);
        }
    }
}
