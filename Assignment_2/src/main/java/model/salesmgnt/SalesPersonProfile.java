package model.salesmgnt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.ordermgnt.Order;
import model.personnel.Person;
import model.personnel.Profile;

public class SalesPersonProfile extends Profile {

    Person p;
    String name;
    ArrayList<Order> salesorders;
    double comission = 0.0;
    double currentSales = 0.0;
    double salesTarget = 50000.0;
    double advance = 0.0;
    private double bonusForHighPriceProduct = 0.0;
    private double bonusForLargeOrder = 0.0;
    private double bonusForHighQuantity = 0.0;
    private double bonusForProductPromotion = 0.0;
    private double bonusForThreshold = 0.0;
    private Map<Integer, Double> commissionRateThresholds; // <sales threshold, commission rate>
    private Map<String, Double> salesForEachMonth;

    public SalesPersonProfile(Person p, String name) {
        super(p);
        this.p = p;
        this.name = name;
        salesorders = new ArrayList();
        salesForEachMonth = new HashMap<String, Double>();
    }

    public void addSalesOrder(Order o) {
        salesorders.add(o);
    }

    public void updateCommission(double commission) {
        comission = commission;
    }

    public void addSales(double sales) {
        currentSales = currentSales + sales;
    }
    
    public void minusSales(double sales){
        currentSales = currentSales - sales;
    }

    public boolean achieveSalesTarget() {
        if (currentSales < salesTarget) {
            return false;
        }
        return true;
    }
    
    public void generateSalesForEachMonth(){
        salesForEachMonth.put("January", getSalesForMonth("January"));
        salesForEachMonth.put("Febuary", getSalesForMonth("Febuary"));
        salesForEachMonth.put("March", getSalesForMonth("March"));
        salesForEachMonth.put("April", getSalesForMonth("April"));
        salesForEachMonth.put("May", getSalesForMonth("May"));
        salesForEachMonth.put("June", getSalesForMonth("June"));
    }
    
    public double getSalesForMonth(String month){
        double sum = 0;
        for(Order o : salesorders){
            if(o.getStatus().equals("Submitted")){
                if(o.getMonth().equals(month)){
                    sum = sum + o.getOrderTotal();
                }
            }
        }
        return sum;
    }
    
    public double searchSalesForMonth(String month){
        for(String m : salesForEachMonth.keySet()){
            if(m.equals(month)){
                return salesForEachMonth.get(m);
            }
        }
        return 0.0;
    }

    public double getComission() {
        return comission;
    }

    public double getCurrentSales() {
        return currentSales;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public String getName() {
        return name;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }
    
    public Map<Integer, Double> getCommissionRateThresholds() {
        return commissionRateThresholds;
    }

    public void setCommissionRateThresholds(Map<Integer, Double> commissionRateThresholds) {
        this.commissionRateThresholds = commissionRateThresholds;
    }

    public double getBonusForHighPriceProduct() {
        return bonusForHighPriceProduct;
    }

    public void updateBonusForHighPriceProduct(double a) {
        bonusForHighPriceProduct = bonusForHighPriceProduct + a;
    }

    public double getBonusForLargeOrder() {
        return bonusForLargeOrder;
    }

    public void updateBonusForLargeOrder(double a) {
        bonusForLargeOrder = bonusForLargeOrder + a;
    }

    public double getBonusForHighQuantity() {
        return bonusForHighQuantity;
    }

    public void updateBonusForHighQuantity(double a) {
        bonusForHighQuantity = bonusForHighQuantity + a;
    }

    public double getBonusForProductPromotion() {
        return bonusForProductPromotion;
    }

    public void updateBonusForProductPromotion(double a) {
        bonusForProductPromotion = bonusForProductPromotion + a;
    }

    public double getBonusForThreshold() {
        return bonusForThreshold;
    }

    public void updateBonusForThreshold(double a) {
        bonusForThreshold = bonusForThreshold + a;
    }

    public Map<String, Double> getSalesForEachMonth() {
        return salesForEachMonth;
    }

    public void setSalesForEachMonth(Map<String, Double> salesForEachMonth) {
        this.salesForEachMonth = salesForEachMonth;
    }
    
    

    @Override
    public String getRole() {
        return "Sales";
    }
    
    @Override
    public String toString(){
        return name;
    }

}
