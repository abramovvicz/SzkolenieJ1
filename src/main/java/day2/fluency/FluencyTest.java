package day2.fluency;

public class FluencyTest {
    public static void main(String[] args) {
        Settings settings = new Settings();
        settings.setColor("blue")
                .setFamily("Time New Roman")
                .setSize(12)
                .setStyle("italic")
                .setName("Times New Roman");
        System.out.println(settings); //fluency interface całość

        //setter wada można w każdej chwili można taką klasę zmienić  czyli np.
        settings.setName("arial");  //i to już zmieni obiekt

    }
}
