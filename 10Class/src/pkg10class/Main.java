
package pkg10class;


public class Main {


    public static void main(String[] args) {
        Country ct=new Country();
        ct.hist();
        System.out.println("\n\nElectronics -");
        MobilePhone m = new MobilePhone();
        m.colour = "White";
        m.battery=1;
        m.keys=15;
        m.camera=2;
        System.out.println("\nMoblie:");
        m.info();
        m.On();
        m.Off();
        Laptop l = new Laptop();
        l.colour = "Golden";
        l.battery=1;
        l.keys=55;
        l.camera=1;
        System.out.println("\nLaptop:");
        l.info();
        l.On();
        l.Off();
        TV t = new TV();
        t.colour = "Black";
        t.keys=6;
        System.out.println("\nTv:");
        t.info();
        t.On();
        t.Stop();
        
        System.out.println("\nInstituations -");
        Sust s = new Sust();
        System.out.println("\n\nSust:");
        s.name = "Shahjalal University Of Science and Technology.";
        s.teachers = 1200;
        s.students = 30000;
        s.department = 20;
        s.buildings = 30;
        s.uni();
        s.intro();
        Neub n = new Neub();
        System.out.println("\nNeub:");
        n.name = "North East University Bangladesh.";
        n.teachers = 100;
        n.students = 3000;
        n.department = 5;
        n.buildings = 1;
        n.uni();
        n.intro();
        BlueBird b = new BlueBird();
        System.out.println("\nBlue Bird:");
        b.name = "Blue Bird School and College";
        b.teachers = 120;
        b.students = 4000;
        b.buildings = 7;
        b.Sch();
        b.intro();
        Mc mc = new Mc();
        System.out.println("\nMc College:");
        mc.name = "Murari Chad College";
        mc.teachers = 120;
        mc.students = 4000;
        mc.buildings = 7;
        mc.clg();
        mc.intro();
        
        System.out.println("\n\nGame -");
        System.out.println("\nCricket:");
        Cricket ck = new Cricket();
        ck.Name="Cricket.";
        ck.field="Circle.";
        ck.player=22;
        ck.refre=3;
        ck.pl();
        ck.introduce();
        System.out.println("\nFootball:");
        Football ft = new Football();
        ft.Name="Football.";
        ft.field="Square.";
        ft.player=22;
        ft.refre=3;
        ft.pl();
        ft.introduce();
    }
    
}
class Electronics{
    String colour;
    int keys;
    int camera;
    int battery;
    
    public void info(){
        System.out.println("Colour = "+colour);
        System.out.println("Keys = "+keys);
        System.out.println("Camera = "+camera);
        System.out.println("Battery = "+battery);
    }
}
class MobilePhone extends Electronics {
    public void On(){
        System.out.println("Mobile is Starting.");
        Pass();
        MediaOpen();
        MediaOff();
    }
    private void Pass(){
        System.out.println("Password need to unlock the phone");
    }
    private void MediaOpen(){
        System.out.println("Password is Ok, Opening media file......");
    }
    private void MediaOff(){
        System.out.println("Closing Media file.....");
    }
    public void Off(){
        System.out.println("Mobile is shutting down......");
    } 
    
}

class Laptop extends Electronics{
    public void On(){
        System.out.println("Window is Opening.....");
        Scan();
    }
    private void Scan(){
        System.out.println("Scanning fingerprint....");
    }
    public void Off(){
        System.out.println("Its not your laptop. Shutting down.....");
    }
}

class TV extends Electronics{
    public void On(){
        System.out.println("TV Power is On.");
        Play();
    }
    private void Play(){
        System.out.println("Playing The Channel Ten Sports.");
    }
    public void Stop(){
        System.out.println("TV Power is Off.");
    }
}
class Institution{
    String name;
    int teachers;
    int students;
    int department;
    int buildings;
    public void intro(){
        System.out.println("Name = "+name);
        System.out.println("Teachers = "+teachers);
        System.out.println("Students = "+students);
        System.out.println("Department = "+department);
        System.out.println("Buildings = "+buildings);
    }
}
class Sust extends Institution{
    public void uni(){
        System.out.println("It is One of the best public university in Bangladesh.");
        System.out.println("It is situated in Sylhet.");
        System.out.println("This university was started in 1991.");
    }
}
class Neub extends Institution{
    public void uni(){
        System.out.println("This private university is developing their skill day by day.");
        System.out.println("It is situated in Sylhet.");
        System.out.println("This university was started in 2012.");
    }
}
class Mc extends Institution{
    public void clg(){
        System.out.println("This is one of the oldest National University of Bangladesh");
        System.out.println("It is situated in Sylhet.");
        System.out.println("This was started in 1892.");
    }
}
class BlueBird extends Institution{
    public void Sch(){
        System.out.println("It is One of the best school in Bangladesh.");
        System.out.println("It is situated in Sylhet.");
        System.out.println("This school was started in 1962.");
    }
}

class Game{
    String Name;
    String field;
    int player;
    int refre;
    public void introduce(){
        System.out.println("Name = "+Name);
        System.out.println("Field is = "+field);
        System.out.println("Players = "+player);
        System.out.println("Refree = "+refre);
        
    }
    
}

class Cricket extends Game{
    public void pl(){
        System.out.println("It is one of the most famous game in Bangladesh.");
    }
}
class Football extends Game{
    public void pl(){
        System.out.println("It is one of the most famous game in the world.");
    }
}
class Country{
    String nm="Bangladesh";
    String pp="1,60,00,000";
    String ar="1,47,570";
    public void hist(){
        System.out.println("Name = "+nm);
        System.out.println("It has got indepence in 1971.");
        System.out.println("Population = "+pp);
        System.out.println("Area = "+ar);
        System.out.println("It is a beautiful country.");
    }
}
