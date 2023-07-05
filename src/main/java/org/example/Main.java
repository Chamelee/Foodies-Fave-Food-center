package org.example;

@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                                
                    Foodies Fave Food center
                
                    101 or VEQ: View all Empty Queues.
                    102 or ACQ: Add customer to a Queue.
                    103 or RCQ: Remove a customer from a Queue. (From a specific location)
                    104 or PCQ: Remove a served customer.
                    105 or VCS: View Customers Sorted in alphabetical order (Do not use library sort routine)
                    106 or SPD: Store Program Data into file.
                    107 or LPD: Load Program Data from file.
                    108 or STK: View Remaining burgers Stock.
                    109 or AFS: Add burgers to Stock.
                    999 or EXT: Exit the Program.
                """);
    }
}