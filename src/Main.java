public class Main {
    public static void main(String[] args) {
        ArrayList<String> spliter = new ArrayList<String>();
        File file = new File("D:\\OOP.java(Sir.shahid bhatti)\\lab-practces\\src\\names.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] split = line.split(",");
                spliter.add(Arrays.toString(split));
                for(String splits : split) {
                    System.out.println(splits);
                }
            }
            reader.close();
        } catch(Exception e) {
            System.out.println(e);
  }
}
    }
}