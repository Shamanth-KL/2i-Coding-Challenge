public class multiples {
    public static void main(String[] args) {

        System.out.println("Multiples of 7 between 1-100, Multiples of 8 between 100-200, Multiples of 9 between 200-300 ");
        for (int number = 1; number <= 300; number++) {

            //check if number is multiple of 7 between 0-100
            if (number > 0 && number < 101) {
                if (number % 7 == 0) {
                    System.out.print(number + " ");
                }
            }

            //check if number is multiple of 8 between 100-200
            if (number > 100 && number < 201) {
                if (number % 8 == 0) {
                    System.out.print(number + " ");
                }
            }

            //check if number is multiple of 9 between 200-300
            if (number > 200 && number <= 300) {
                if (number % 9 == 0) {
                    System.out.print(number + " ");
                }
            }

        }
    }
}

