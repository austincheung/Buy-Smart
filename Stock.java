package BuySmart;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.JTextArea;


public class Stock {
    
public Phones phonepurchased;

    public Stack<Phones> list = new Stack <Phones> ();

    public void addItem(Phones item)
    {
        list.add(item);
    }

    public void fill() throws FileNotFoundException
    {
        list.clear();
        Scanner scanner = new Scanner(new File("Phones.txt"));

        String brand = "";
        String model = "";
        String size = "";
        String price = "";
        String screen = "";
        String ram = "";
        String battery = "";
        String date = "";

        while(scanner.hasNextLine())
        {
            try{
                brand = scanner.nextLine();
                model = scanner.nextLine();
                size = scanner.nextLine();
                price = scanner.nextLine();
                screen = scanner.nextLine();
                ram = scanner.nextLine();
                battery = scanner.nextLine();
                date = scanner.nextLine();
                Phones item = new Phones (brand, model,size,price,screen, ram, battery,date);
                list.push(item);
            }catch(Exception e)
            {
                System.out.println("File not found");
                break;
            }
        }
    }
    
    public int findDevice(String phone) throws FileNotFoundException
    {
        fill();
        for(int i = 0; i <= list.size()-1; i++)
        {
           if((list.get(i).getModel() + " " + list.get(i).getStorage()).equals(phone))
           {
               phonepurchased = list.get(i);
               return i;
           }
        }
        
        return 0;
    }

    public void display(JTextArea area)
    {
        area.setFont(new Font("Calibri",Font.PLAIN ,14));
        for(int i = 0; i<=(list.size()-1); i++)
        {
            area.append(list.get(i).getModel()+ "  ");
            area.append(list.get(i).getStorage()+ "\n");
        }
    }
    
    public void displayAll(JTextArea area, int i, int j)
    {
            area.setFont(new Font("Calibri",Font.PLAIN ,20));
            area.append(list.get(i).getBrand()+ "  ");
            area.append(list.get(i).getModel()+ "  ");
            area.append(list.get(i).getStorage()+ "  ");
            area.append(list.get(i).getScreen()+ "  ");
            area.append(list.get(i).getRam()+ "  ");
            area.append(list.get(i).getBattery()+ "  ");
            area.append(list.get(i).getDate()+ "\n");
           
            area.append("\n");
            
            area.append(list.get(j).getBrand()+ "  ");
            area.append(list.get(j).getModel()+ "  ");
            area.append(list.get(j).getStorage()+ "  ");
            area.append(list.get(j).getScreen()+ "  ");
            area.append(list.get(j).getRam()+ "  ");
            area.append(list.get(j).getBattery()+ "  ");
            area.append(list.get(j).getDate()+ "\n");
    }
    
     public void displayOne(JTextArea area, int i)
    {
            area.setFont(new Font("Calibri",Font.PLAIN ,20));
            area.append(list.get(i).getBrand()+ "  ");
            area.append(list.get(i).getModel()+ "  ");
            area.append(list.get(i).getStorage()+ "  ");
            area.append(list.get(i).getScreen()+ "  ");
            area.append(list.get(i).getRam()+ "  ");
            area.append(list.get(i).getBattery()+ "  ");
            area.append(list.get(i).getDate()+ "\n");

    }
}
