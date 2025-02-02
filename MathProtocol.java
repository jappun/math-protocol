import java.net.*;
import java.io.*;

public class MathProtocol {
    private static final int WAITING = 0;
    private static final int GOTOP = 1;
    private static final int ANOTHER = 2;

    private int state = WAITING;


    public String validateInput(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "What's your math question?";
        } else if (state == GOTOP) {
            String[] req = theInput.split(" ");
            if (req.length != 3) {
                theOutput = "Please enter a valid operation. Enter 'help' to see vali d requests";
            } else {
                String operation = req[0];
                if (operation.equals("ADD") || operation.equals("SUB") || operation.equals("MULT") || operation.equals("DIV")) {
                } else {
                    theOutput = "Not a valid question. Enter 'help' to see valid requests.";
                }

            }
            String operation = req[0];
            switch (operation) {
                case "ADD":
                    break;
                case "SUB":
                    break;
                case "MULT":
                    break;
                case "DIV":
                    break;
            }
        } else if (state == ANOTHER) {
            theOutput = "Ask another math question";
        }
            
        // KnockKnockProtcol
        // } else if (state == SENTCLUE) {
        //     if (theInput.equalsIgnoreCase(clues[currentJoke] + " who?")) {
        //         theOutput = answers[currentJoke] + " Want another? (y/n)";
        //         state = ANOTHER;
        //     } else {
        //         theOutput = "You're supposed to say \"" + 
		// 	    clues[currentJoke] + 
		// 	    " who?\"" + 
		// 	    "! Try again. Knock! Knock!";
        //         state = SENTKNOCKKNOCK;
        //     }
        // } else if (state == ANOTHER) {
        //     if (theInput.equalsIgnoreCase("y")) {
        //         theOutput = "Knock! Knock!";
        //         if (currentJoke == (NUMJOKES - 1))    public static void main(String[] args) throws IOException {
        
        //             if (args.length != 1) {
        //                 System.err.println("Usage: java EchoServer <port number>");
        //                 System.exit(1);
        //             }
                    
        //             int portNumber = Integer.parseInt(args[0]);
                    
        //             try (
        //                 ServerSocket serverSocket =
        //                     new ServerSocket(Integer.parseInt(args[0]));
        //                 Socket clientSocket = serverSocket.accept();     
        //                 PrintWriter out =
        //                     new PrintWriter(clientSocket.getOutputStream(), true);                   
        //                 BufferedReader in = new BufferedReader(
        //                     new InputStreamReader(clientSocket.getInputStream()));
        //             ) {
        //                 String inputLine;
        //                 while ((inputLine = in.readLine()) != null) {
        //                     out.println(inputLine);
        //                 }
        //             } catch (IOException e) {
        //                 System.out.println("Exception caught when trying to listen on port "
        //                     + portNumber + " or listening for a connection");
        //                 System.out.println(e.getMessage());
        //             }
        //         }
        //             currentJoke = 0;
        //         else
        //             currentJoke++;
        //         state = SENTKNOCKKNOCK;
        //     } else {
        //         theOutput = "Bye.";
        //         state = WAITING;
        //     }
        return theOutput;
    }
}

