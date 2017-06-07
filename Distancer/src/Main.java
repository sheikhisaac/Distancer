import java.io.*;

//Isaac Sheikh 06.06.2017
public class Main {
    public static void main(String[] args) throws IOException {
        Address[] address = getAddress();
        PrintWriter output = createFile("output.txt");
        for (Address addresses : address){
            createAddress(addresses, output);
            System.out.println();
        }
        output.close();
        getFileInfo();
    }

    private static class Address {
        public static String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static Address[] getAddress(){
        Address[] address = new Address[5];
        address[0] = new Address("43021 Gatwick Sq,", "Ashburn,", "VA");
        address[1] = new Address("43021 Gatwick Sq,", "Ashburn,", "VA");
        address[2] = new Address("43021 Gatwick Sq,", "Ashburn,", "VA");
        address[3] = new Address("43021 Gatwick Sq,", "Ashburn,", "VA");
        address[4] = new Address("43021 Gatwick Sq,", "Ashburn,", "VA");

        return address;
    }

    public static  PrintWriter createFile(String fileName){
        try{
            File output = new File(fileName);

            PrintWriter stufftowrite = new PrintWriter(new BufferedWriter(new FileWriter(output)));
            return stufftowrite;
        }

        catch(IOException e){
            System.out.println("An I/O Error has Occurred");
          //  System.exit(0);
        }

        return null;
    }

    private static void createAddress(Address address, PrintWriter output){
        String addressInfo = address.street + " " + address.city + " " + address.state;
        output.println(addressInfo);
    }

    private static void getFileInfo() throws IOException {
        System.out.println("Info Written to File\n");

        // Open a new connection to the file
        File output = new File("output.txt");
        try {
            // FileReader reads character files
            // BufferedReader reads as many characters as possible
            BufferedReader getInfo = new BufferedReader(new FileReader(output));

            // Reads a whole line from the file and saves it in a String
            String addressInfo = getInfo.readLine();

            // readLine returns null when the end of the file is reached
            while (addressInfo != null) {
                System.out.println(addressInfo);
                // Break lines into pieces
                String[] addressData = addressInfo.split(",");
                System.out.print("Address is " + addressData[0] + "\n");
                addressInfo = getInfo.readLine();
            }
        }

        // Can be thrown by FileReader
        catch (FileNotFoundException e) {
            System.out.println("Couldn't Find the File");
            System.exit(0);
        }

        catch(IOException e){
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
    }
}
