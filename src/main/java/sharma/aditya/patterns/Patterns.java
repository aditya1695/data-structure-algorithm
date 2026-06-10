package sharma.aditya.patterns;

class Patterns {
    protected void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected void pattern2(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    protected void pattern3(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    protected void pattern4(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    protected void pattern5(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected void pattern6(int n) {
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    protected void pattern7(int n) {
        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected void pattern8(int n) {
        for(int i = n; i>0; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected void pattern9(int n){
        //first half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = 1; i < n; i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected void pattern11(int n){
        int lastElement = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(lastElement);
                lastElement = (lastElement == 1) ? 0: 1;
            }
            System.out.println();
        }
    }

    protected void pattern12(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < (n-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    protected void pattern13(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(start+ " ");
                start++;
            }
            System.out.println();
        }
    }
}
