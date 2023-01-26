/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bedömningsarbete;

import java.util.Scanner;

/**
 *
 * @author denise.leon
 */
public class Bedömningsarbete {
    
//passion kommer att vara en förändringsfaktor som kommer ändra helheten av de poäng du får från varje interaktion.
    
   //den ska vara odödlig
static double psn = 1;
//Affection är hur batmans syn på dig är överhuvudtaget och den höjs och sänks för varje sak som sker.

       //den ska vara odödlig
       static int afctn = 0;
       
    //Grudge kommer höjas för varje riskfyllda händelse, de kan bara sänkas genom att be om ursäkt
    static int grdg = 0;
    
    //Blommor
    static int gardenias = 0;
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bleyblade = new Scanner(System.in);
        
        
        
        //Det kommer finnas 10 rundor för att försöka få batman att gilla en nog för att det ska bli en dejt, mer än det och han kommer bli trött och då blir det game over.
        for(int rnd = 1; rnd<10; rnd++){
            System.out.println("Runda: " +rnd);
            System.out.println("-STATS-");
            System.out.println("passion: "+psn);
            System.out.println("Affection: "+afctn);
            System.out.println("Grudge: "+grdg);
            System.out.println("-----------");
           if(afctn >= 100){
               date();
           }
           else if(grdg == 6 || afctn < 0){
               break;
           }
           else{
               if (gardenias >0){
                   gardenias+=1;
                   if(gardenias>=4){
                       System.out.println("");
                       System.out.println("");
                       System.out.println("--------------");
                       System.out.println("");
                       System.out.println("Pero si un atardecer");
                       System.out.println("Las gardenias de mi amor se mueren...");
                       System.out.println("Es porque han adivinado");
                       System.out.println("Que tú amour me ha traicionado");
                       System.out.println("Porque existe otro querer...");
                       System.out.println("");
                       System.out.println("");
                       System.out.println("GAME OVER");
                       System.exit(0);
                   }
               }
                 //Här an du välj vilken typ av handling du vill utföra
              System.out.println("Vad skulle du vilja göra?\n"
                      + "(1) Dra\n"
                      + "(2) Gör nått\n"
                      + "(3) Säg nått\n"
                      + "(4) Date (Du måste ha 100 affection för att välja detta)\n");
              int val = bleyblade.nextInt();
               switch(val){
                   //Dra
                  case(1): {
                    if(afctn < 45){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------");
                        System.out.println("");
                        System.out.println("Du vaknar nästa morgon i din vanliga säng"
                                 + "\n Du kollar ut genom fönstret"
                                 + "\nVa igår bara en dröm?");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }
                    else if(afctn < 90){
                        System.out.println("");
        System.out.println("");
        System.out.println("--------------");
        System.out.println("");
                        System.out.println("Du vaknar nästa morgon i din vanliga säng"
                                + "\ndu går till jobbet som vanligt"
                                + "\nDu blir tillkallad till din närmaste chef"
                                + "\nDu får reda på att du fått sparken och måste lämna byggnaden med detsamma"
                                + "\nDu kommer hem bara för att märka att din fru lämnade dig och tog med barnen"
                                + "\nDu får ett brev som säger att ditt hus ska rivas innom kommande timmen"
                                + "\nDu försöker vinna lite pengar på en enarmadbandit till middag"
                                + "\nDu förlorar alla dina pengar och lånar från en främling"
                                + "\nDu hamnar i stora skulder\nDu är hungrig, lever på gatan, med en tidning till säng och kan inte komma ut ur den håla som grävts åt dig"
                                + "\nDu blir misshandlad av ett gäng ungdommar bakom en bensinstation"
                                + "\nIngen kommer för att hjälpa dig...");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("GAME OVER");
                        System.exit(0);
                     } 
                    else{
                        System.out.println("");
        System.out.println("");
        System.out.println("--------------");
        System.out.println("");
                        System.out.println("Du vaknar nästa morgon i din vanliga säng"
                                + "\nDu sätter på Tv:n och kollar på dagens nyheter"
                                + "\nInget nytt visas"
                                + "\nDu vaknar om några månader i din vanliga säng"
                                + "\nDu sätter på Tv:n och kollar på dagens nyheter"
                                + "\nBatman har fortfarande inte synst till sedan den där dagen"
                                + "\nGotham är i kaos"
                                + "\nKan det vara ditt fel?");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("GAME OVER");
                            System.exit(0);
                    }
                  }
                  break;
                  case(2): {
                      //här kan spelaren välja vad hen vill göra
                      System.out.println("Vad skulle ni vilja göra?\n(1)Ge blommor\n(2)Försök kyss\n(3)Be om ursäkt\n(4)Ta i hand");
                      int hand = bleyblade.nextInt();
                      switch(hand){
                          case(1):{
                              //ge blommor
                              double chans = Math.random();
                              if(afctn <=5){
                                  if(chans >= 0.7){
                                      gardenias+=1;
                                      psn+=0.6;
                                      System.out.println("Batman tog försiktigt emot blommorna, han kollar efter explosiva medel innan han tackar för den fina presenten.");
                                      
                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Batman tittar på blommorna du erbjuder misstänktsamt och tar inte emot dom. Bättre lycka nästa gång");
                                  }
                                  break;
                                }
                              else if(afctn <= 60){
                                  if(chans > 0.6){
                                      gardenias+=1;
                                      psn+=0.5;
                                      System.out.println("Batman tog försiktigt emot blommorna, han kollar efter explosiva medel innan han tackar för den fina presenten.");

                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Batman tittar på blommorna du erbjuder misstänktsamt och tar inte emot dom. Bättre lycka nästa gång");

                                  }
                                  break;
                              }
                              else if(afctn > 60){
                                      System.out.println("Batman tittar på blommorna du erbjuder misstänktsamt och tar inte emot dom. Han vill inte ta en sån risk nu när allt går så bra:)");
                                  
                          }break;}
                          case(4):{
                            double chans = Math.random();
                            //ta i hand
                              if(afctn <=20){
                                  if(chans >= 0.6){
                                      aplyckat();
                                      System.out.println("Batman rycker till förvånat när din hand vidrör hans, med det lite rodnande som syntes under masken lät han era fingrar sammanfläta.");
                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Du rör din hand mot batmans i hopp om att få kontakt. Han märker rörelsen i sin ögonvrå och drar in sin hand innan era fingrar snuddar. Du skämms lite men tar inte upp det igen. Du kanske testar igen senare...");
                                  }
                                  break;
                                }
                              else if(afctn <= 70){
                                  if(chans > 0.4){
                                      aplyckat();
                                      System.out.println("Batman rycker till förvånat när din hand vidrör hans, med det lite rodnande som syntes under masken lät han era fingrar sammanfläta.");

                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Du rör din hand mot batmans i hopp om att få kontakt. Han märker rörelsen i sin ögonvrå och drar in sin hand innan era fingrar snuddar. Du skämms lite men tar inte upp det igen. Du kanske testar igen senare...");

                                  }
                                  break;
                              }
                              else if(afctn > 70){
                                  if(chans >0.1){
                                      aplyckat();
                                      System.out.println("Batman rycker till förvånat när din hand vidrör hans, med det lite rodnande som syntes under masken lät han era fingrar sammanfläta.");

                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Du rör din hand mot batmans i hopp om att få kontakt. Han märker rörelsen i sin ögonvrå och drar in sin hand innan era fingrar snuddar. Du skämms lite men tar inte upp det igen. Du kanske testar igen senare...");
                                      
                                  }
                                  break;
                          }
                              
                          }
                          case(2):{
                              //försök kyss
                              double chans = Math.random();
                                 
                                if(afctn < 80){
                                  if(chans > 0.8){
                                      afctn+=10;
                                      aplyckat();
                                      System.out.println("Du lutar dig frammåt, ditt ansikte närmar sig hans som är halvt täkt av masken, men du bryr dig inte. Centimeter efter centimeter, med en kraft vars ursprung di inte kan komma på närmar du dig hans läppar. Till slut så snuddar de sitt mål, och det ger dig modet att trycka dig närmare honom, och kyssen blir allt mer passionerad.");
                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Du lutar dig frammåt för att kyssa honom men när han märker dina avsikter så tar han fram en batarang och swingar den så att den flyger mot ditt ansikte i en hastighet som är för snabb för att mäta och går igenom väggen bakom dig. Du har stelnat av skräck medan bataman går tillbaka till hur det va som om inget hänt.");
                                      grdg++;
                                  }
                                  break;
                              }
                              else if(afctn >= 80){
                                  if(chans >0.4){
                                      aplyckat();
                                      afctn+=10;
                                      System.out.println("Du lutar dig frammåt, ditt ansikte närmar sig hans som är halvt täkt av masken, men du bryr dig inte. Centimeter efter centimeter, med en kraft vars ursprung di inte kan komma på närmar du dig hans läppar. Till slut så snuddar de sitt mål, och det ger dig modet att trycka dig närmare honom, och kyssen blir allt mer passionerad.");
                                  }
                                  else{
                                      olyckat();
                                      System.out.println("Du lutar dig frammåt för att kyssa honom men när han märker dina avsikter så tar han fram en batarang och swingar den så att den flyger mot ditt ansikte i en hastighet som är för snabb för att mäta och går igenom väggen bakom dig. Du har stelnat av skräck medan bataman går tillbaka till hur det va som om inget hänt.");

                                        }}
                                        
                                    break;}
                          case(3):{
                              //Be om ursäkt
                              double chans = Math.random();
                                if (grdg>= 4){
                                  if(chans>0.5){
                                      grdg=0;
                                      System.out.println("Du reflekterar över de misstag du gjort under kvällens gång och delar med dig av dina tankar och känslor med batman. Han lyssnar tålmodigt och när du är klar så nickar han med förståelse och tar helt och hållet emot din ursäkt.");                                              
                                  }
                                  else{
                                      grdg--;
                                      System.out.println("Du reflekterar över de misstag du gjort under kvällens gång och delar med dig av dina funderingar med batman. Han ger ut ett (vad du kan gissa är) nöjt grymt.");                                              

                                      
                                  }break;}
                                else{
                                      if(grdg>0.2){
                                      grdg=0;
                                      System.out.println("Du reflekterar över de misstag du gjort under kvällens gång och delar med dig av dina tankar och känslor med batman. Han lyssnar tålmodigt och när du är klar så nickar han med förståelse och tar helt och hållet emot din ursäkt.");                                              

                                      }
                                      else{
                                      grdg--;
                                      System.out.println("Du reflekterar över de misstag du gjort under kvällens gång och delar med dig av dina funderingar med batman. Han ger ut ett (vad du kan gissa är) nöjt grymt.");                                              

                                      }
                                        }
                                break;
                                  
                              }
                          
                          default:{
                              System.out.println("Snälla välj en handling");
                              break;
                          }
                      }
                      break;
                  } 
                  case(3): {
                      //Här kan du välja vad du ska säga till batman
                      System.out.println("Vad vill du säga?\n (1)Prata om vädret \n(2)Ställ vågad fråga\n (3)Ge en komplimang");
                      int tal = bleyblade.nextInt();
                      switch(tal){
                          case(1):{
                              //Prata om vädret
                              afctn +=5;
                              plyckat();
                              System.out.println("Du pekar ut de olika stjärnorna på den mörka himlen.\n 'Vilken tur vi hade med vädret' \nSäger du. Det får dig att diskutera vidare angående hur det ständigt rängnat i Gotham de senaste sju åren. Batman har ett konstant leende på ansiktet medan du pratar.");
                              break;
                          }
                          case(2):{
                              //ställ vågad fråga
                              double chans = Math.random();
                              
                              if(afctn < 50){
                                  if(chans > 0.8){
                                      aplyckat();
                                      System.out.println("Du tar allt ditt mod och samlar det för att nu faktiskt ställa batman frågan som du väntat på hela natten. Utan att vända blicken från Gothams horisont så låter du orden passera dina läppar. Till din förvånan så är du inte död än. Du vänder blicken för att se hans reaktion, allt han har på ansiktet är ett snällt leende och förståelig blick, och kanske lite mer än det...");
                                  }
                                  else{
                                      olyckat();
                                      grdg++;
                                      System.out.println("Du tar allt ditt mod och samlar det för att nu faktiskt ställa batman frågan som du väntat på hela natten. DU kommer doch inte ens halvvägs förrens du känner den starka negativa auran som har omgivit er. Situationen har blivit stel och du vågar inte fortsätta det du startade.");

                                  }
                                  break;
                              }
                              else if(afctn <75){
                                  if(chans > 0.4){
                                      aplyckat();
                                      System.out.println("Du tar allt ditt mod och samlar det för att nu faktiskt ställa batman frågan som du väntat på hela natten. Utan att vända blicken från Gothams horisont så låter du orden passera dina läppar. Till din förvånan så är du inte död än. Du vänder blicken för att se hans reaktion, allt han har på ansiktet är ett snällt leende och förståelig blick, och kanske lite mer än det...");

                                  }
                                  else{
                                      olyckat();
                                      grdg++;
                                      System.out.println("Du tar allt ditt mod och samlar det för att nu faktiskt ställa batman frågan som du väntat på hela natten. DU kommer doch inte ens halvvägs förrens du känner den starka negativa auran som har omgivit er. Situationen har blivit stel och du vågar inte fortsätta det du startade.");

                                  }
                                  break;
                              }
                              else if(afctn>=75){
                                  if(chans > 0.15){
                                      aplyckat();
                                      System.out.println("Du tar allt ditt mod och samlar det för att nu faktiskt ställa batman frågan som du väntat på hela natten. Utan att vända blicken från Gothams horisont så låter du orden passera dina läppar. Till din förvånan så är du inte död än. Du vänder blicken för att se hans reaktion, allt han har på ansiktet är ett snällt leende och förståelig blick, och kanske lite mer än det...");

                                    }
                                  else{
                                      olyckat();
                                      grdg++;
                                      System.out.println("Du tar allt ditt mod och samlar det för att nu faktiskt ställa batman frågan som du väntat på hela natten. DU kommer doch inte ens halvvägs förrens du känner den starka negativa auran som har omgivit er. Situationen har blivit stel och du vågar inte fortsätta det du startade.");

                                  }
                                  break;
                              }
                              
                               
                          }
                          case(3):{
                              //ge komplimang
                             afctn +=10 ;
                              System.out.println("Nu när du har mannen, legenden, hjälten, vid din sida så kan du inte hålla ut. Du låter din nördighet spilla. Det verkar inte som att Batman tar det på ett dåligt sätt, det kanske till och med lyfte stämningen en gnutta.");
                             break;
                          }
                          
                      }
                      break;                      
                  } 
                  case(4): {
                      if(afctn >= 100){
                      date();   
                      }
                          
                      else{                           
                      System.out.println("Du kan än inte välja detta");
                      break;   
                      }   
                  } 
                  
                  default:{
                      
                  }
               }
                    
           }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("--------------");
        System.out.println("");
        System.out.println("Morgonens första solstrålar sipprar genom byggnaderna, du blir bländad i en sekund och måste lyfta upp handen för för att lägga en skugga över ögonen. Men den där sekunden va det som dömde dig, för nu när du kan se igen så märker du att du sitter helt ensam på taket. \n Bättre lycka nästa gång...?");
        System.out.println("");
        System.out.println("");
        System.out.println("Game Over");
        System.exit(0);
               
        
    }
    
    
    static double plyckat(){
     psn+=0.2;
     return psn;   
    }
    static double aplyckat(){
    psn+=0.1;
    double ff = psn*20;
    afctn +=ff;
    return afctn;
    }
    static double olyckat(){
        grdg++;
        psn-=0.1;
         return psn;   
    }
    
    static void date(){
        System.out.println("Han gick med på att gå på en dejt!");
        System.out.println("Batman knyter en duk runt dina ögon som ska arbeta som ögonbindel.\n"
                + "du känner hur ni tar er ner från taket och in i vad du gissar är batmobilen.\n"
                + "Du vet inte om det va distansen som va kort eller om ni bara hade en sån hög hastighet, men du kände i alla fall av hur bilden stannade efter bara några minuter\n"
                + "Du hör hur hans sida av bilen öppnas och han stiger av, snart öppnads dörren på din sida med och du känner hur hans stora hand tar i din för att dra ut dig. \n"
                + "När du hittade din balans på marken så togs ögonbindeln av från dina ögon och en underbar syn visades framför sig.\n"
                + "Och jag, för en gångs skull, menar inte batmans underbara kropp, utan den stora grottan som ni befann er i, grottan som du bara kunde gissa va the Batcave.\n"
                + "Det pirrar i din mage över allt som sker runt om dig.\n"
                + "Batman ursäktar sig själv, säger att han kommer snart tillbaka och att du inte ska röra ngot innan han försvinner uppför några trappor.\n"
                + "Du väntar tålmodigt där du står, du säger till att kolla på allt som dina ögon når.\n"
                + "När du plötsligt hör en dörr öppnas tror du att det är batman som har kommit tillbaka, men till din förskräckelse så är det inte han.\n"
                + "en liten pojke, inte äldre än 15 kommer ut, han ser starkt missnöjd ut och när hans ögon landar på dig så blir han allt utom gladare.\n"
                + "Han stampar kraftigt mot dig, ljud som inte borde kunna genereras av en sån liten kropp ekar i den stora grottan för varje steg han tar.\n"
                + "Du gissar att pojken nyss nått målbrottet,om hur hans röst bryter sig medan han skriker på dig är något att gå efter.\n"
                + "Du hör inte riktigt vad han säger över hur upprörd han är, men det är tydligt vad den här pojken vill.\n"
                + "Han ställer sig i fighting stans och du halvt imiterar den, om du måste slåss för att vara med batman, är det det du kommer göra...\n\n\n"
                + "FIGHT!");
        System.exit(0);
  
    }
}
