package bank;


    public class Card {

        private final String CARD_NUMBER = "1234 5678 9012 3456";
        private int pinCode;

        public Card() {
            this.pinCode = generatePinCode();
        }

        private int generatePinCode() {
            return (int) (Math.random() * 9000) + 1000;
        }

        public int getPinCode() {
            return pinCode;
        }

        public void setPinCode(int pinCode) {
            if (String.valueOf(pinCode).length() == 4) {
                this.pinCode = pinCode;
            } else {
                System.out.println("Pin code must be a 4-digit number");
            }
        }

        public static void main(String[] args) {
            Card card = new Card();
            System.out.println("Card Pin Code: " + card.getPinCode());

            card.setPinCode(999); // Trying to set a pin code with less than 4 digits
            System.out.println("Card Pin Code after incorrect change: " + card.getPinCode());

            card.setPinCode(1234); // Setting a valid pin code
            System.out.println("Card Pin Code after correct change: " + card.getPinCode());
        }
    }


