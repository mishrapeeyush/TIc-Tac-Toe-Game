import java.util.Scanner;
class project
{char game[][]=new char[3][3];
  void instructions()
  {
   System.out.println("We welcome you to the all-time favourite game of TIC TAC TOE");
   System.out.println(); 
   System.out.println("Before starting this exciting game we would like to introduce rules of this game.\nThey are as follows:");
   System.out.println("1. The game is played on a grid that's 3 squares by 3 squares.");
   System.out.println("2. You are X, your friend is O. Players take turns putting their marks in empty squares.");
   System.out.println("3. The first player to get 3 of her/his marks(ie,X or O) in a row (horizontally, vertically or diagonally) is the winner.");
   System.out.println("4. When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.");
   System.out.println("5. The first player's marks is X while O is the mark for second player"); 
   System.out.println(); 
   System.out.println("One quick advice before starting the game: it is highly recommended to avoid the entering of one's mark in an already filled grid");
   System.out.println("May the best player wins"); 


   System.out.println("These are the position of all the grids for the player's reference");
   char z;
   int r,s;
   	z='1';
   for(r=0;r<3;r++)
    {
     for(s=0;s<3;s++)
      {
        game[r][s]='z';
        z++;
      }
    }
  } Scanner s=new Scanner(System.in);
 boolean validate1(String number)
{
	boolean flag=true;
	char ch='\0';
	for (int i=0;i<number.length();i++){
	ch = number.charAt(i);
	if(Character.isDigit(ch))
	{
		flag = true;
	}
	else{
		flag =false;
	}
	}
	
	if(flag==true){return true;}
	else {return false;}
		
}

  boolean validate(String name)
{
	boolean flag=true;
	char ch='\0';
	for (int i=0;i<name.length();i++){
	ch = name.charAt(i);
	if(Character.isLetter(ch))
	{
		flag = true;
	}
	else{
		flag =false;
	}
	}
	
	if(flag==true){return true;}
	else {return false;}
		
}


 public static void main(String args[])
 {		Scanner s=new Scanner (System.in);


char game[][]=new char[3][3];

  project ob=new project();
   
  ob.instructions();
String ax;
int j,a,i,k;
System.out.println("Press 1: For single player game \n Press 2: For Two player game");
		int choice=s.nextInt();
  s.nextLine();
  
  
  	project ob1 = new project();
	
	boolean flag;

		if(choice==1)
	
			{  
			
			String player1;

do{
  			System.out.println("Please enter the name of the player");
			  player1=s.nextLine();
                          
		flag=ob.validate(player1);
		
	}while(flag==false);
			System.out.println("\n===========================\n");
 			System.out.println("The Following Are the positions");
		int count=1; char count1;
		
			for(i=0;i<3;i++)
 				 { 
 					  for(j=0;j<3;j++)
  				 { 	 
						count1= String.valueOf(count).charAt(0);
 					   game[i][j]=count1;
						count++;
				 }
 				 }
		
		
		
		 for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
					}

				   System.out.print("\n--------------------");
 
 			  System.out.println(" ");
  				}
System.out.println("\n===========================\n");

System.out.println("\n===========================\n");
			for(i=0;i<3;i++)
 				 { 
 					  for(j=0;j<3;j++)
  				 { 
 					   game[i][j]='*';
			  	 }
 				 }

				 
								  

 				 for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
					}

				   System.out.print("\n--------------------");
 
 			  System.out.println(" ");
  				}
				 						  
 					
				for(i=0;i<9;i++)
				{
					
            
String q;
 int counter1=1;
 int q1[]=new int[6];
int p[]=new int[5];

 
 do{ 		
			do{
		System.out.println(player1+" enter the position of the grid where you want to enter X ");
	
			q=s.next();
			flag=ob.validate1(q);
		}while(flag==false);
	q1[counter1]=Integer.parseInt(q);
		
	
	
	}while(q1[counter1]==p[counter1]);
	
		
	

	

	
switch(q1[counter1])
{

case 1:
game[0][0]='X';
break;
case 2:
game[0][1]='X';
break;
case 3:
game[0][2]='X';
break;
case 4:
game[1][0]='X';
break;
case 5:
game[1][1]='X';
break;
case 6:
game[1][2]='X';
break;
case 7:
game[2][0]='X';
break;
case 8:
game[2][1]='X';
break;
case 9:
game[2][2]='X';
break;
default: 
    System.out.println("Invalid Input");
}
System.out.println("\n===========================\n");

System.out.println("\n===========================\n");
                                for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
                                    }

				   System.out.print("\n--------------------");
 
                                 System.out.println(" ");
  				}
                        
if(game[0][0]=='X' && game[0][1]=='X' && game[0][2]=='X')

{ System.out.println(player1+" Wins !!");
System.exit(0);
}
if(game[1][0]=='X' && game[1][1]=='X' && game[1][2]=='X')

{ System.out.println(player1+" Wins !!"); 
System.exit(0);
}
if(game[2][0]=='X' && game[2][1]=='X' && game[2][2]=='X')

{ System.out.println(player1+" Wins !!");
System.exit(0);
}
if(game[0][0]=='X' && game[1][0]=='X' && game[2][0]=='X')

{ System.out.println(player1+" Wins !!"); 
System.exit(0);
}
if(game[0][1]=='X' && game[1][1]=='X' && game[2][1]=='X')

{ System.out.println(player1+" Wins !!");
System.exit(0);
}
if(game[0][2]=='X' && game[1][2]=='X' && game[2][2]=='X')

{ System.out.println(player1+" Wins !!");
System.exit(0);
}
if(game[0][0]=='X' && game[1][1]=='X' && game[2][2]=='X')

{ System.out.println(player1+" Wins !!");
System.exit(0);
}

if(game[0][2]=='X' && game[1][1]=='X' && game[2][0]=='X')
{ System.out.println(player1+" Wins !!");
System.exit(0);
}
           int flag2=0;             
                     	
		flag2=1;
		do {
 		
		p[counter1] = 1 + (int)(Math.random() * 9);
		}while(p[counter1]==q1[counter1]);
                
                
                
		if(p[counter1]!=q1[counter1])
	{
		switch(p[counter1])
		{

case 1:
game[0][0]='O';
break;
case 2:
game[0][1]='O';
break;
case 3:
game[0][2]='O';
break;
case 4:
game[1][0]='O';
break;
case 5:
game[1][1]='O';
break;
case 6:
game[1][2]='O';
break;
case 7:
game[2][0]='O';
break;
case 8:
game[2][1]='O';
break;
case 9:
game[2][2]='O';
break;
}}
        


System.out.println("\n===========================\n");

System.out.println("\n===========================\n");
                                    for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
                                    }

				   System.out.print("\n--------------------");
 
                                 System.out.println(" ");
  				}System.out.println("\n===========================\n");

System.out.println("\n===========================\n");

if(game[0][0]=='O' && game[0][1]=='O' && game[0][2]=='O')

{ System.out.println("Compter Wins !!");
System.exit(0);

}
if(game[1][0]=='O' && game[1][1]=='O' && game[1][2]=='O')

{ System.out.println("Computer Wins !!"); 
System.exit(0);}
if(game[2][0]=='O' && game[2][1]=='O' && game[2][2]=='O')

{ System.out.println(" Computer Wins !!"); 
System.exit(0);}
if(game[0][0]=='O' && game[1][0]=='O' && game[2][0]=='O')

{ System.out.println("Computer Wins !!"); 
System.exit(0);}
if(game[0][1]=='O' && game[1][1]=='O' && game[2][1]=='O')

{ System.out.println("Computer Wins !!");
System.exit(0);}
if(game[0][2]=='O' && game[1][2]=='O' && game[2][2]=='O')

{ System.out.println("Computer Wins !!"); 
System.exit(0);}
if(game[0][0]=='O' && game[1][1]=='O' && game[2][2]=='O')

{ System.out.println("Computer Wins !!");
System.exit(0);}


if(i==8){System.out.println("Oh!! It's a draw...Both were equally matched.");}

				}
				
				
			}        
			
 


 else
 {
  String player_1,player_2;
  System.out.println("");
  
         do{
		System.out.println("Please enter the name of first player");
		 player_1=s.nextLine();
		flag=ob.validate(player_1);
		
	}while(flag==false);
 
  
         do{
		System.out.println("Please enter the name of second player");
		 player_2=s.nextLine();
		flag=	ob.validate(player_2);
		
	}while(flag==false);
   
 	System.out.println("The Following Are the positions");
		int count2=1; char count3;
		
			for(i=0;i<3;i++)
 				 { 
 					  for(j=0;j<3;j++)
  				 { 	 
						count3= String.valueOf(count2).charAt(0);
 					   game[i][j]=count3;
						count2++;
				 }
 				 }
		
		
		
		 for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
					}

				   System.out.print("\n--------------------");
 
 			  System.out.println(" ");
  				}
System.out.println("\n===========================\n");

System.out.println("\n===========================\n");
   
 
  for(i=0;i<3;i++)
  { 
   for(j=0;j<3;j++)
   { 
    game[i][j]='*';
   }
  }


                                  for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
                                    }

				   System.out.print("\n--------------------");
 
                                 System.out.println(" ");
                                  }
System.out.println("\n===========================\n");

System.out.println("\n===========================\n");
int a1[]= new int[6];
int b1[]= new int[5];
 int counter = 1;
for(i=0;i<9;i++)
{

 String b="";
 int flag1 = 0;

      
 do{
	
		System.out.println(player_1+" enter the position of the grid where you want to enter X ");
		 ax=s.next();
		flag=ob.validate1(ax);
		
	}while(flag==false);
	
 a1[counter]= Integer.parseInt(ax);
switch(a1[counter])
{

case 1:
game[0][0]='X';
break;
case 2:
game[0][1]='X';
break;
case 3:
game[0][2]='X';
break;
case 4:
game[1][0]='X';
break;
case 5:
game[1][1]='X';
break;
case 6:
game[1][2]='X';
break;
case 7:
game[2][0]='X';
break;
case 8:
game[2][1]='X';
break;
case 9:
game[2][2]='X';
break;
default:
System.out.println("Invalid input");
}

               for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
                                    }

				   System.out.print("\n--------------------");
 
                                 System.out.println(" ");
                                  }


if(game[0][0]=='X' && game[0][1]=='X' && game[0][2]=='X')

{ System.out.println(player_1+" Wins !!");

System.exit(0);
}
if(game[1][0]=='X' && game[1][1]=='X' && game[1][2]=='X')

{ System.out.println(player_1+" Wins !!"); System.exit(0);
}
if(game[2][0]=='X' && game[2][1]=='X' && game[2][2]=='X')

{ System.out.println(player_1+" Wins !!");System.exit(0);
}
if(game[0][0]=='X' && game[1][0]=='X' && game[2][0]=='X')

{ System.out.println(player_1+" Wins !!"); System.exit(0);
}
if(game[0][1]=='X' && game[1][1]=='X' && game[2][1]=='X')

{ System.out.println(player_1+" Wins !!");System.exit(0);
}
if(game[0][2]=='X' && game[1][2]=='X' && game[2][2]=='X')

{ System.out.println(player_1+" Wins !!"); System.exit(0);
}
if(game[0][0]=='X' && game[1][1]=='X' && game[2][2]=='X')

{ System.out.println(player_1+" Wins !!");System.exit(0);
}

if(game[0][2]=='X' && game[1][1]=='X' && game[2][0]=='X')
{ System.out.println(player_1+" Wins !!"); System.exit(0);
}
			{

     
 
 flag1 = 0;
 do{
 flag1=0;
do{
		System.out.println(player_2+" enter the position of the grid where you want to enter O Except Position"+ ": " +a1[counter] );
		 
	b=s.next();
		flag=ob.validate1(b);
		
	}while(flag==false);
	
	
	


	b1[counter]=Integer.parseInt(b);
	if(b1[counter]==a1[counter]){
		
		flag1 = 1;
			
	}

	
}while(flag1==1);

if(flag1 != 1)
{
switch(b1[counter])
{ 

case 1:
game[0][0]='O';
break;
case 2:
game[0][1]='O';
break; 
case 3:
game[0][2]='O';
break;
case 4:
game[1][0]='O';
break;
case 5:
game[1][1]='O';
break;
case 6:
game[1][2]='O';
break;
case 7:
game[2][0]='O';
break;
case 8:
game[2][1]='O';
break;
case 9:
game[2][2]='O';
break;
}

                                    for(i=0;i<3;i++)
				  {
 					  for(k=0;k<3;k++)
 				  {
  				   System.out.print( "|"+game[i][k] +"|  ");
 
                                    }

				   System.out.print("\n--------------------");
 
                                 System.out.println(" ");
  				}
}System.out.println("\n===========================\n");

System.out.println("\n===========================\n");

if(game[0][0]=='O' && game[0][1]=='O' && game[0][2]=='O')

{ System.out.println(player_2 +" Wins !!");
System.exit(0);
}
if(game[1][0]=='O' && game[1][1]=='O' && game[1][2]=='O')

{ System.out.println(player_2 +" Wins !!"); System.exit(0);
}
if(game[2][0]=='O' && game[2][1]=='O' && game[2][2]=='O')

{ System.out.println(player_2 +" Wins !!"); System.exit(0);
}
if(game[0][0]=='O' && game[1][0]=='O' && game[2][0]=='O')

{ System.out.println(player_2 +" Wins !!"); System.exit(0);
}
if(game[0][1]=='O' && game[1][1]=='O' && game[2][1]=='O')

{ System.out.println(player_2 +" Wins !!");}


if(game[0][2]=='O' && game[1][2]=='O' && game[2][2]=='O')

{ System.out.println(player_1+" Wins !!"); System.exit(0);
}
if(game[0][0]=='O' && game[1][1]=='O' && game[2][2]=='O')

{ System.out.println(player_1+" Wins !!");System.exit(0);
}

if(game[0][2]=='O' && game[1][1]=='O' && game[2][0]=='O')
{ System.out.println(player_1+" Wins !!"); System.exit(0);
			}

                        }
			
			


counter++;
}}

}}
