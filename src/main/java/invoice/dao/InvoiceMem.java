package invoice.dao;

import invoice.model.Invoice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;


public class InvoiceMem implements IInvoice {


    private LocalDate localDate = LocalDate.now();
    LocalDate next2Week = localDate.plus(2, ChronoUnit.WEEKS);
    long countDays = ChronoUnit.DAYS.between(localDate, next2Week); // ilość dni

//    public InvoiceMem() {
//        generateInvoiceNumber();
//        generateDateInvoiceCreation();
//        generateExpiresDateInvoice();
//    }
//


    @Override
    public Invoice displayInvoice() {
        return null;
    }

    @Override
    public boolean addInvoice(Invoice invoice) {
        return false;
    }

    @Override
    public boolean editInvoice(Invoice invoice) {
        return false;
    }

    @Override
    public List<Invoice> getInvoiceByNumber(int numberInvoice) {
        return null;
    }

    @Override
    public List<Invoice> getInvoiceByCompanyName(String companyName) {
        return null;
    }

    @Override
    public String generateInvoiceNumber() {
        LocalDate localDate = LocalDate.now();
        String invoceNumber = localDate + "N/N" + new Random().nextInt(204);
        System.out.println(invoceNumber);
        //takie pseudo - ale tak napradę powinno być tworzone na nowy rok nowy numer, który jest sprawdzany ostatni numer, zwiększany o 1
        //i  dodawanydo puli  numerów może dodam jak starczy czasu
        return invoceNumber;
    }

    @Override
    public LocalDate generateDateInvoiceCreation() {
        return localDate;
    }

    @Override
    public LocalDate generateExpiresDateInvoice() {
        return next2Week;
    }


}
