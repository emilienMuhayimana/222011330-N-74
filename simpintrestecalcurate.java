// this progrom display the simple interest
public class simpintrestecalcurate{ // class name
        private double principal;
        private double annualRate;
        private int years;
    
        public simpintrestecalcurate(double principal, double annualRate, int years) {
            this.principal = principal;
            this.annualRate = annualRate;
            this.years = years;
        }
    
        public double calculateSimpintrestecalcurate() { // function name
            double simpintrestecalcurate = (principal * annualRate * years) / 100; // this is formula
            return simpintrestecalcurate;
        }
    
        public static void main(String[] args) {
            double principal = 100000.0; // inital amount
            double annualRate = 5.0;  // annual interest rate 
            int years = 5;            // number of years 
    
            simpintrestecalcurate s = new simpintrestecalcurate(principal, annualRate, years);
            double simpintrestecalcurate = s.calculateSimpintrestecalcurate();
    
            System.out.println("Simpinterestecalcurate after " + years + " years: " + simpintrestecalcurate + " RWF"); // this is the ouput
        }
    }

    
        
