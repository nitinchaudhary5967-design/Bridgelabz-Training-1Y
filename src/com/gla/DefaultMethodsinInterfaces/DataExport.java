package com.gla.DefaultMethodsinInterfaces;
interface Exporter{
    void exportCSV();
    void exportPDF();
    default void exportJSON(){
        System.out.println("Export JSON");
    }
}
class Report implements Exporter{
    public void exportCSV(){
        System.out.println("CSV Export");
    }
    public void exportPDF(){
        System.out.println("PDF Export");
    }
}
public class DataExport{
    public static void main(String[]args){
        Report r=new Report();
        r.exportCSV();
        r.exportJSON();
    }
}
