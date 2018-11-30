public class Runner {

    public static void main(String[] args) {

        String testStr = "00:00:00,5,440000,DCmV,,,2,3700000,oC,,,,,,Measure,,,,Current peak values,,";

        String sourceFilePath = "D:\\KP\\Pomiary\\urzadzenia_akumulatorowe\\one_aku_wiertarka_udarowa\\csv";
//        String filePath = "/home/kamil/Pulpit/pliki_testowe/csv/";
        String sourceFileName = "20181115_4_mlotowiertarka_2Ah_wiercenie_beton_8mm_CT";

        String fixedFilePath = "D:\\KP\\Pomiary\\urzadzenia_akumulatorowe\\one_aku_wiertarka_udarowa\\csv\\poprawione_CSV";
//        String fixedFilePath = "/home/kamil/Pulpit/pliki_testowe/csv/poprawione_CSV/";
        String fixedFileName = "test";

        CSV sourceFile = new CSV(sourceFilePath,sourceFileName);
        CSV outputFile = new CSV(fixedFilePath,fixedFileName);

        StringFix stringFix = new StringFix();

//        System.out.println(stringFix.fixLine());

//        stringFix.fixLine(sourceFile.readFile());

        outputFile.writeFile(stringFix.fixLine(sourceFile.readFile(sourceFile.getBufferedReader())));



    }

}
