public class Exercise1_11 {
    public static void main(String[] args) {
        System.out.println("Initial population: 312,032,486");
        System.out.print("Population after 1st year: ");
        System.out.println(312032486 
            + ((1/7.0) * 60 * 60 * 24 * 365)
            + ((1/45.0) * 60 * 60 * 24 * 365) 
            - ((1/13.0) * 60 * 60 * 24 * 365));
        System.out.print("Population after 2nd year: ");
        System.out.println(312032486 
            + ((1/7.0) * 60 * 60 * 24 * (365 * 2))
            + ((1/45.0) * 60 * 60 * 24 * (365 * 2)) 
            - ((1/13.0) * 60 * 60 * 24 * (365 * 2)));
        System.out.print("Population after 3rd year: ");
        System.out.println(312032486 
            + ((1/7.0) * 60 * 60 * 24 * (365 * 3))
            + ((1/45.0) * 60 * 60 * 24 * (365 * 3)) 
            - ((1/13.0) * 60 * 60 * 24 * (365 * 3)));
        System.out.print("Population after 4th year: ");
        System.out.println(312032486 
            + ((1/7.0) * 60 * 60 * 24 * (365 * 4))
            + ((1/45.0) * 60 * 60 * 24 * (365 * 4)) 
            - ((1/13.0) * 60 * 60 * 24 * (365 * 4)));
        System.out.print("Population after 5th year: ");
        System.out.println(312032486 
            + ((1/7.0) * 60 * 60 * 24 * (365 * 5))
            + ((1/45.0) * 60 * 60 * 24 * (365 * 5)) 
            - ((1/13.0) * 60 * 60 * 24 * (365 * 5)));
    }
}