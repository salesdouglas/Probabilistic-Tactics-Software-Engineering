
package probabilistictacticsproject;

import java.util.Scanner;

public class Statistics{

    Scanner valueT = new Scanner(System.in);
    
    String[]  games = new String[20];
    private int  yellowCard;
    private int  redCard;
    Escalation escalation ;
    
    public Statistics(){
        escalation = new Escalation();
    }
    
    
    
    public void setYellowCard(int YellowCard){
        this.yellowCard = YellowCard;
    }
    
    public void setRedCard(int RedCard){
        this.redCard = RedCard;
    }
    
    public int getYellowCard(){
        return yellowCard;
    }
    
    public int getRedCard(){
        return redCard;
    }

    public void descritionPlayer(){ //descrition the player

    }

    public void addGame(){
        
            
        //The person choose a team for play of game of back with our team
            
        System.out.println("EQUIPES DISPONIVEIS PARA JOGAR CONTRA NOSSO TIME:"); //RETIRAR
            
        System.out.println("1 - Origin:"); //RETIRAR
        System.out.println("2 - Cabrid:"); //RETIRAR
        System.out.println("3 - Chuchuq:"); //RETIRAR
        System.out.println("4 - Nowin:"); //RETIRAR
        System.out.println("5 - Mowqilio:"); //RETIRAR
        System.out.println("6 - Powlif:"); //RETIRAR
        System.out.println("7 - Bakapowho:"); //RETIRAR
        System.out.println("8 - Choolsa:"); //RETIRAR
        System.out.println("9 - Paraloppy:"); //RETIRAR
        System.out.println("10 - Gabbywol:"); //RETIRAR
        System.out.println("11 - Pahol:"); //RETIRAR
        System.out.println("12 - Panatilows:"); //RETIRAR
        System.out.println("13 - Hollo:"); //RETIRAR
        System.out.println("14 - Excheloh:"); //RETIRAR
        System.out.println("15 - Kalakazi:"); //RETIRAR
        System.out.println("Time escolhido : "); //RETIRAR
        
        int team1 = 0;
        
        while((team1<1)||(team1>15)){
             team1 = valueT.nextInt();
        }
        
        
        escalation.SelectionTactic(team1);
         
        
        
        
        System.out.println("PREPARANDO PARA O JOGO : "); //RETIRAR
        
        System.out.println("TIME FORMADO "); //RETIRAR
        
        int i;
        
        for(i=0;i<escalation.escalationOficialName.length;i++){
            
            while(!(escalation.escalationOficialName[i].equalsIgnoreCase("null"))){
                System.out.printf(" %s ",escalation.name);
                System.out.printf(" ");
                System.out.printf(" %s - %d", escalation.escalationOficialName[i],escalation.escalationOficialNumberShirt[i]);
                
            }
            
        }
        
    }
        
            
        
            
    
            
    

    public void deleteGame(){
            //Opcion for delete a game of the math
    }
    
}