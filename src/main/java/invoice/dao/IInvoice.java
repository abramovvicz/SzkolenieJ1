package invoice.dao;

import invoice.model.Client;
import invoice.model.ClientType;
import invoice.model.Invoice;

import java.time.LocalDate;
import java.util.List;

public interface IInvoice {
    Invoice displayInvoice();

    boolean addInvoice(Invoice invoice);

    boolean editInvoice(Invoice invoice);

    List<Invoice> getInvoiceByNumber(int numberInvoice);

    List<Invoice> getInvoiceByCompanyName(String companyName);

    String generateInvoiceNumber();

    LocalDate generateDateInvoiceCreation();

    LocalDate generateExpiresDateInvoice();

}
