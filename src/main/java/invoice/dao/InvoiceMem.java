package invoice.dao;

import invoice.model.Invoice;

import java.util.List;


public class InvoiceMem implements IInvoice {


    public InvoiceMem() {

    }
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


}
