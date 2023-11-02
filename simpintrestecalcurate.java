public class simpintrestecalcurate{
        private double principal;
        private double annualRate;
        private int years;
    
        public simpintrestecalcurate(double principal, double annualRate, int years) {
            this.principal = principal;
            this.annualRate = annualRate;
            this.years = years;
        }
    
        public double calculateSimpintrestecalcurate() {
            double simpintrestecalcurate = (principal * annualRate * years) / 100;
            return simpintrestecalcurate;
        }
    
        public static void main(String[] args) {
            double principal = 100000.0; 
            double annualRate = 5.0;   
            int years = 5;             
    
            simpintrestecalcurate s = new simpintrestecalcurate(principal, annualRate, years);
            double simpintrestecalcurate = s.calculateSimpintrestecalcurate();
    
            System.out.println("Simpinterestecalcurate after " + years + " years: " + simpintrestecalcurate + " RWF");
        }
    }

    
        