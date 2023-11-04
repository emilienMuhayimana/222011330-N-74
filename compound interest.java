// this program show how to calculate the compound interest for three years
public class compound interest { // this is the class name of this program
    
        private double principal;
        private double annualRate;
        private int years;
        private int monthsPerYear;
    
        public compound interest(double principal, double annualRate, int years, int monthsPerYear) {
            this.principal = principal;
            this.annualRate = annualRate;
            this.years = years;
            this.monthsPerYear = monthsPerYear;
        }
    
        public double calculateTotalPayment() { 
            double monthlyRate = (annualRate / 100) / monthsPerYear;
            int totalPayments = years * monthsPerYear;
            double totalPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) / (Math.pow(1 + monthlyRate, totalPayments) - 1);
            return totalPayment;
        }
    
        public static void main(String[] args) {
            double principal = 500000.0; // this is the initial deposit amount
            double annualRate = 18.0;  // annual interest rate (5% )
            int years = 3;     // this is the number of years         
            int monthsPerYear = 12;     
    
            compound interest roan = new compound interest(principal, annualRate, years, monthsPerYear);
            double totalPayment = roan.calculateTotalPayment();
    // this is the output of this program
            System.out.println("Total Payment after " + years + " years with compound interest: " + totalPayment + " RWF");
        }
    
       
}
