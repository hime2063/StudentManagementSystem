package models;


    public class Bill {
        private double fees;
        private double pastDues;
        private String date;

        public Bill(double fees, double pastDues, String date) {
            this.fees = fees;
            this.pastDues = pastDues;
            this.date = date;
        }

        // Getters and setters
        public double getFees() {
            return fees;
        }

        public void setFees(double fees) {
            this.fees = fees;
        }

        public double getPastDues() {
            return pastDues;
        }

        public void setPastDues(double pastDues) {
            this.pastDues = pastDues;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

