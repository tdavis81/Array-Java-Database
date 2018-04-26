package fixeddatabase;

public class FixedDatabase 
{
    public static void printDirections()
    {
        System.out.println("________________________________________________");
        System.out.println("_              Database Program                _");
        System.out.println("_              Baseball Database               _");
        System.out.println("_          Programmer : Tyler Davis            _");
        System.out.println("_               Date: 4/10/2018                _");
        System.out.println("________________________________________________");
    }
    
    public static int findPlayerFirstName(Player[] myPlayers)
    {
        //Variables
        int indexFound = 0;
        String userName = "";
        
        System.out.println("");
        System.out.println("    You have chosen to search by First Name....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a first name to search by....");
        System.out.print("First Name: ");
        userName = SavitchIn.readLine();
        userName = checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
        if (Player.currentPlayer ==0)
        {
            System.out.println("");
            System.out.println(" I'm sorry there are no players in the database..");
        }
        else if (Player.currentPlayer !=0)
        {
            for(int i = 0; i < Player.currentPlayer; i++)
            {
                if(myPlayers[i].firstName.equals(userName))
                {
                    System.out.println("");
                    System.out.println("Player Found!");
                    indexFound = i;
                    i=101;
                }
                else
                {
                    System.out.println("");
                    System.out.println("I'm sorry but the player you are looking for was not found.");
                    indexFound = -1;
                }
            }
        }
        else
        {
            System.out.println("General Error in find player");
        }
        return indexFound;
    }
    
    public static int findPlayerLastName(Player[] myPlayers)
    {
        //Variables
        int indexFound = 0;
        String userName = "";
        
        System.out.println("");
        System.out.println("    You have chosen to search by Last Name....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a last name to search by....");
        System.out.print("Last Name: ");
        userName = SavitchIn.readLine();
        userName = checkIfInputValid(userName);
        userName = userName.toLowerCase();
        
        if (Player.currentPlayer ==0)
        {
            System.out.println("");
            System.out.println(" I'm sorry there are no players in the database..");
        }
        else if (Player.currentPlayer !=0)
        {
            for(int i = 0; i < Player.currentPlayer; i++)
            {
                if(myPlayers[i].lastName.equals(userName))
                {
                    System.out.println("");
                    System.out.println("Player Found!");
                    indexFound = i;
                    i=101;
                }
                else
                {
                    System.out.println("");
                    System.out.println("I'm sorry but the player you are looking for was not found.");
                    indexFound = -1;
                }
            }
        }
        else
        {
            System.out.println("General Error in find player");
        }
        return indexFound;
    }
    
    public static int findPlayerJerseyNum(Player[] myPlayers)
    {
      //Variables
        int indexFound = 0;
        int userInt = 0;
        
        System.out.println("");
        System.out.println("    You have chosen to search by Jersey Number....");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("   Please enter a jersey number to search by....");
        System.out.print("Jersey Number: ");
        userInt = SavitchIn.readLineInt();
        while(userInt <0)
        {
            System.out.println("I'm sorry you cannot search for a negative jersey number");
            System.out.print("Jersey Number: ");
            userInt = SavitchIn.readLineInt();
        }
        
        if (Player.currentPlayer ==0)
        {
            System.out.println("");
            System.out.println(" I'm sorry there are no players in the database..");
        }
        else if (Player.currentPlayer !=0)
        {
            for(int i = 0; i < Player.currentPlayer; i++)
            {
                if(myPlayers[i].jerseyNum == userInt)
                {
                    System.out.println("");
                    System.out.println("Player Found!");
                    indexFound = i;
                    i=101;
                }
                else
                {
                    System.out.println("");
                    System.out.println("I'm sorry but the player you are looking for was not found.");
                    indexFound = -1;
                }
            }
        }
        else
        {
            System.out.println("General Error in find player");
        }
        return indexFound;
    }
    
    
    public static int findPlayer(Player[] myPlayers)
    {
        //Variables
        int userInt = 0;
        int indexFound = 0;
        
        System.out.println("");
        System.out.println("                   Find Player");
        System.out.println("________________________________________________");
        System.out.println("   How would you like to search for a player?");
        System.out.println("1 - First Name  |  2 - Last Name  |  3 - Jersey Number");
        System.out.print("Choice: ");
        userInt = SavitchIn.readLineInt();
        
        while (( userInt <= 0) ||(userInt >3))
        {
            System.out.println("I'm sorry you have entered an invalid choice please try again....");
            System.out.print("Choice: ");
            userInt = SavitchIn.readLineInt();
        }
        
        switch (userInt) {
            case 1:
                indexFound = findPlayerFirstName(myPlayers);
                return indexFound;
            case 2:
                indexFound = findPlayerLastName(myPlayers);
                return indexFound;
            case 3:
                indexFound = findPlayerJerseyNum(myPlayers);
                return indexFound;
            default:
                System.out.println("General Error in Find Player");
                indexFound = 0;
                return indexFound;
        }
        
        
                
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static int switchBoardChoice()
    {
        //Variables 
        int userChoice = 0;
        
        //Logic
        System.out.println("");
        System.out.println("     Which option would you like to choice?");
        System.out.println("________________________________________________");
        System.out.println("|            [  1 -   ADD PLAYER   ]           |");
        System.out.println("|            [  2 - DELETE PLAYER  ]           |");
        System.out.println("|            [  3 -  EDIT PLAYER   ]           |");
        System.out.println("|            [  4 - PRINT PLAYERS  ]           |");
        System.out.println("|            [  5 -    EXIT        ]           |");
        
        System.out.print("Choice: ");
        userChoice = SavitchIn.readLineInt();
        
        //Error Checking to ensure user cannot enter in a choice other than 1,2,3,4,5
        while ((userChoice <= 0) || (userChoice > 5))
        {
            System.out.println("I'm sorry you have entered an invalid choice. Try Again.");
            System.out.print("Choice: ");
            userChoice = SavitchIn.readLineInt();
        }
        
        //Returns the users choice
        return userChoice;
    }
    
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void switchBoardChosenOption(int userChoice, Player[] myPlayers)
    {
        switch (userChoice) {
            case 1:
                addPlayer(myPlayers);
                break;
            case 2:
                deletePlayer(myPlayers);
                break;
            case 3:
                editPlayer(myPlayers);
                break;
            case 4:
                printPlayers(myPlayers);
                break;
            case 5:
                System.out.println("You have chosen to exit the program....Goodbye....");
                break;
            default:
                System.out.println("General Error 101 - Error timed out in SwitchBoardChosenOption Method.....");
                break;
        }
    }
    
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static String checkIfInputValid(String userInput)
    {
        while(!userInput.matches("[A-Za-z]+"))
        {
            System.out.println("I'm sorry you have entered an invalid character.");
            System.out.print("Try again : ");
            userInput = SavitchIn.readLine();        
        }
        
        return userInput;
    }
    
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void addPlayer(Player[] myPlayers)
    {
        //Variables
        int playerIndex = Player.currentPlayer;
        String userInput = "";
        int userInt = 0;
        
        //Logic
        myPlayers[playerIndex] = new Player();
        System.out.println("");
        System.out.println("       You have chosen to add a player");
        System.out.println("________________________________________________");
        
        System.out.println("Please enter the player's [   First Name    ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        myPlayers[playerIndex].firstName = userInput;
        
        System.out.println("Please enter the player's [   Last Name     ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        myPlayers[playerIndex].lastName = userInput;
        
        System.out.println("Please enter the player's [   Position      ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        myPlayers[playerIndex].position = userInput;
        
        System.out.println("Please enter the player's [   Gender        ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        myPlayers[playerIndex].gender = userInput;
        
        System.out.println("Please enter the player's [   Throwing Side ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        myPlayers[playerIndex].throwingSide = userInput;
        
        System.out.println("Please enter the player's [   Team name     ]");
        userInput = SavitchIn.readLine();
        userInput = checkIfInputValid(userInput);
        userInput = userInput.toLowerCase();
        myPlayers[playerIndex].teamName = userInput;
        
        System.out.println("Please enter the player's [   Age           ]");
        userInt = SavitchIn.readLineInt();
        myPlayers[playerIndex].age = userInt;
        
        System.out.println("Please enter the player's [   Jersey Number ]");
        userInt = SavitchIn.readLineInt();
        myPlayers[playerIndex].jerseyNum = userInt;
        
        Player.currentPlayer++;
                
    }
    
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void deletePlayer(Player[] myPlayers)
    {
        //Variables
        int userInt = 0;
        int indexFound = 0; 
        
        System.out.println("");
        System.out.println("                Delete Player");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("Would you like to delete a single player or all?");
        System.out.println("1 - Delete Single Player | 2 - Delete All Players");
        System.out.println("");
        System.out.print("Choice: ");
        userInt = SavitchIn.readLineInt();
        
        //Error Checking
        while ((userInt <= 0)|| (userInt > 2))
        {
            System.out.println("I'm sorry that is an invalid choice, try again.");
            System.out.print("Choice: ");
            userInt = SavitchIn.readLineInt();
        }
        
        //Logic
        switch (userInt) {
            case 1:
                indexFound = findPlayer(myPlayers);
                if (indexFound ==-1)
                {
                    //Do nothing beceause the player was not found
                }
                else if (indexFound >=0)
                {
                    for(int i = indexFound; i < Player.currentPlayer;i++)
                    {
                        int newInt = i;
                        if ((newInt+1)>myPlayers.length)
                        {
                            myPlayers[newInt]=null;
                        }
                        else
                        {
                            myPlayers[i] = myPlayers[i+1];
                            Player.currentPlayer --;
                            System.out.println("Players Deleted!");
                        }
                    }
                }
                break;
            case 2:
                if (Player.currentPlayer ==0)
                {
                    System.out.println("");
                    System.out.println("I'm sorry there are no players in the database to delete.");
                   
                }
                else if (Player.currentPlayer !=0)
                {
                    for (int i = 0; i < Player.currentPlayer;i++)
                    {
                        try
                        {
                            myPlayers[i].firstName = null;
                            myPlayers[i].lastName = null;
                            myPlayers[i].position = null;
                            myPlayers[i].gender = null;
                            myPlayers[i].throwingSide = null;
                            myPlayers[i].teamName = null;
                            myPlayers[i].age = 0;
                            myPlayers[i].jerseyNum = 0;
                            Player.currentPlayer =0;
                            System.out.println("Players Deleted!");
                        }
                        catch(Exception e)
                        {
                            System.out.println("General Error in delete");
                        }
                    
                    }
                }
                else
                {
                    System.out.println("General Error in delete all players...");
                }
                
               
                break;
            default:
                System.out.println("General Error 101 in Delete Player....");
                break;
        }
        
    }
    
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void editPlayer(Player[] myPlayers)
    {
        //Variables
        int indexFound = 0;
        String userInput = "";
        int userInt = 0;
        
        System.out.println("");
        System.out.println("                    Edit Player");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println(" Please search for the player you would like to edit below.");
        indexFound = findPlayer(myPlayers);
        if (indexFound <0)
        {
            ///Player was not found 
        }
        else if (indexFound >=0)
        {
            System.out.println("");
            System.out.println("You have chosen to edit " + myPlayers[indexFound].firstName);
            System.out.println("________________________________________________");

            System.out.println("Please enter the player's [   First Name    ]");
            userInput = SavitchIn.readLine();
            userInput = checkIfInputValid(userInput);
            userInput = userInput.toLowerCase();
            myPlayers[indexFound].firstName = userInput;

            System.out.println("Please enter the player's [   Last Name     ]");
            userInput = SavitchIn.readLine();
            userInput = checkIfInputValid(userInput);
            userInput = userInput.toLowerCase();
            myPlayers[indexFound].lastName = userInput;

            System.out.println("Please enter the player's [   Position      ]");
            userInput = SavitchIn.readLine();
            userInput = checkIfInputValid(userInput);
            userInput = userInput.toLowerCase();
            myPlayers[indexFound].position = userInput;

            System.out.println("Please enter the player's [   Gender        ]");
            userInput = SavitchIn.readLine();
            userInput = checkIfInputValid(userInput);
            userInput = userInput.toLowerCase();
            myPlayers[indexFound].gender = userInput;

            System.out.println("Please enter the player's [   Throwing Side ]");
            userInput = SavitchIn.readLine();
            userInput = checkIfInputValid(userInput);
            userInput = userInput.toLowerCase();
            myPlayers[indexFound].throwingSide = userInput;

            System.out.println("Please enter the player's [   Team name     ]");
            userInput = SavitchIn.readLine();
            userInput = checkIfInputValid(userInput);
            userInput = userInput.toLowerCase();
            myPlayers[indexFound].teamName = userInput;

            System.out.println("Please enter the player's [   Age           ]");
            userInt = SavitchIn.readLineInt();
            myPlayers[indexFound].age = userInt;

            System.out.println("Please enter the player's [   Jersey Number ]");
            userInt = SavitchIn.readLineInt();
            myPlayers[indexFound].jerseyNum = userInt;    
        }
        else
        {
            System.out.println("General Error in edit player");
        }
    }
    
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void printPlayers(Player[] myPlayers)
    {
        //Variables
        int userInput = 0;
        int counter = 0;
        int indexFound = 0;
        
        //Logic
        System.out.println("");
        System.out.println("Would you like to list out a single player or all players?");
        System.out.println("      1 - Single Player | 2- - All Players ");
        System.out.println("________________________________________________");
        System.out.print("Choice : ");
        userInput = SavitchIn.readLineInt();
        
        //Error checking
        while (( userInput <= 0 ) ||( userInput > 2))
        {
            System.out.println("You have entered and invalid choice, try again.");
            System.out.print("Choice : ");
            userInput = SavitchIn.readLineInt();
        
        }
        
        switch (userInput) {
            case 1:
                indexFound = findPlayer(myPlayers);
                if (indexFound <0)
                {
                   // Do nothing player was not found
                }
                else if (indexFound >= 0)
                {
                    System.out.println("");
                    System.out.println("Player " + indexFound + "'s" + " First Name    is : " + myPlayers[indexFound].firstName);
                    System.out.println("Player " + indexFound + "'s" + " Last Name     is : " + myPlayers[indexFound].lastName);
                    System.out.println("Player " + indexFound + "'s" + " Position      is : " + myPlayers[indexFound].position);
                    System.out.println("Player " + indexFound + "'s" + " Gender        is : " + myPlayers[indexFound].gender);
                    System.out.println("Player " + indexFound + "'s" + " Throwing Side is : " + myPlayers[indexFound].throwingSide);
                    System.out.println("Player " + indexFound + "'s" + " Team Name     is : " + myPlayers[indexFound].teamName);
                    System.out.println("Player " + indexFound + "'s" + " Age           is : " + myPlayers[indexFound].age);
                    System.out.println("Player " + indexFound + "'s" + " Jersey Number is : " + myPlayers[indexFound].jerseyNum);
                }
                else
                {
                    System.out.println("General Error in Print single student");
                }
                break;
            case 2:
                for (int i = 0; i < Player.currentPlayer;i++)
                {
                    try
                    {
                        System.out.println("");
                        System.out.println("Player " + counter + "'s" + " First Name    is : " + myPlayers[i].firstName);
                        System.out.println("Player " + counter + "'s" + " Last Name     is : " + myPlayers[i].lastName);
                        System.out.println("Player " + counter + "'s" + " Position      is : " + myPlayers[i].position);
                        System.out.println("Player " + counter + "'s" + " Gender        is : " + myPlayers[i].gender);
                        System.out.println("Player " + counter + "'s" + " Throwing Side is : " + myPlayers[i].throwingSide);
                        System.out.println("Player " + counter + "'s" + " Team Name     is : " + myPlayers[i].teamName);
                        System.out.println("Player " + counter + "'s" + " Age           is : " + myPlayers[i].age);
                        System.out.println("Player " + counter + "'s" + " Jersey Number is : " + myPlayers[i].jerseyNum);
                        counter++;
                        
                    }
                    catch (Exception e)
                    {
                        System.out.println("");
                        System.out.println("General Error ");
                    }
                    
                    
                }
                if (Player.currentPlayer ==0)
                {
                    System.out.println("");
                    System.out.println("I'm sorry but there are no player's in the database to print out.");
                }
                break;
            default:
                System.out.println("General Error 101 in Print Players");
                break;
        }
    
    }
    
    
    public static void baseballDatabaseMenu()
    {
        //Variables and Objects
        int userChoice = 0;
        Player[] myPlayers = new Player[100];
        
        printDirections();
        while(userChoice !=5)
        {
            userChoice = switchBoardChoice();
            switchBoardChosenOption(userChoice, myPlayers);
        }
        
        
        
    }
    
    public static void main(String[] args) 
    {
        baseballDatabaseMenu();
    }
    
}
