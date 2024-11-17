package week6;

public class StringManipulation {
    
    public static void main(String[] args){
        System.out.print("String Manipulation\n");

//         String firstString = "test123\n";
//         System.out.print(firstString);

//         String secondString = "TEST123\n";
//         System.out.print(secondString);




//         if(firstString.equalsIgnoreCase(secondString)){
//             System.out.print("Both strings are equal, ignoring the case of the individual characters.\n");
//         }
//         else{
//             System.out.print("Strings are not equal\n");
//         }

// //comparing strings in a Switch parameter
//         String stringToSwitch = "A";
//         switch (stringToSwitch) { 
//             case "a":
//                 System.out.println("a");
//                 break; 
//             case "A":
//                 System.out.println("A"); //the code goes here
//                 break; 
//             case "B":
//                 System.out.println("B");
//                 break; 
//             default:
//                 break; 
//             }


//             int one = 1;
//             String color = "red";
//             StringBuilder sb = new StringBuilder(); 
//             sb.append("One=").append(one).append(", Color=").append(color).append('\n'); 
//             System.out.print(sb);

            int id = 20097;
            String fullName = "Isaiah Lugo";
            String email = "ilugo@bushnell.edu";
            String mobile = "541-***-****";
            StringBuilder sb2 = new StringBuilder(); 
            sb2.append("ID = ").append(id).append(", Full Name = ").append(fullName).append(", Email = ").append(email).append(", Mobile = ").append(mobile); 
            System.out.print(sb2);
    }
}
