import java.util.*;


class Stopwatch {
static int interval;
static Timer timer;

void watch() {
    Scanner sc = new Scanner(System.in);
    //System.out.print("Input seconds => : ");
    String secs = "20";
    int delay = 500;
    int period = 500;
    timer = new Timer();
    interval = Integer.parseInt(secs);
    System.out.print(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            System.out.print(setInterval() );

        }
    }, delay, period);
}

int setInterval() {
    if (interval == 1)
        timer.cancel();
    return --interval;
}
}


class menu {

void menu1(){
Scanner in=new Scanner(System.in);
int arr[]=new int[10];
arr[0]=50;
arr[1]=70;
arr[2]=100;
arr[3]=60;
arr[4]=65;
arr[5]=45;
arr[6]=30;
arr[7]=15;
arr[8]=10;
arr[9]=20;
String resp="y";
int total=0;
float cancel=0;
while(resp.compareTo("y")==0){
System.out.println("Choose Your Items");
System.out.println("1:Honey chilli potato: "+arr[0]);
System.out.println("2:pasta: "+arr[1]);
System.out.println("3:chicken lollipop: "+arr[2]);
System.out.println("4:chicken roll: "+arr[3]);
System.out.println("5:schezwan rice: "+arr[4]);
System.out.println("6:masala dosa: "+arr[5]);
System.out.println("7:plain dosa: "+arr[6]);
System.out.println("8:lassi: "+arr[7]);
System.out.println("9:chach: "+arr[8]);
System.out.println("10:Shikanji: "+arr[9]);
int num=in.nextInt();
System.out.println("enter quantity");
int qty=in.nextInt();
int y=1;
while(y==1){
System.out.println("more items?....y or n");
resp=in.next();
if(resp.compareTo("y")==0 || resp.compareTo("n")==0){
y=0;}
else{y=1;}
total=total+(arr[num-1]*qty);
}}

System.out.println("1:home delivery or 2:self pick");
int ent=in.nextInt();
if(ent==1){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your address");
in.nextLine();
String add=in.nextLine();



System.out.println("enter your phone number");
String nu=in.next();
}
else if(ent==2){
System.out.println("enter your name");
in.nextLine();
String name=in.nextLine();
System.out.println("enter your phone number");
String nu=in.next();
}
System.out.println("bill  "+total);
if(total>200){
total=total-(int)(total*0.3);
System.out.println("bill after discount  "+total);
}
System.out.println("");
if(total>10){
cancel=(int)(total*0.2);
System.out.println("if you cancel your order cancellation charges will be"+":-"+cancel);
System.out.println("");
}
}

void menu2(){
Scanner in=new Scanner(System.in);
int arr[]=new int[10];
arr[0]=50;
arr[1]=70;
arr[2]=100;
arr[3]=60;
arr[4]=65;
arr[5]=45;
arr[6]=30;
arr[7]=15;
arr[8]=10;
arr[9]=20;
String resp="y";
int total=0;
float cancel=0;
while(resp.compareTo("y")==0){
System.out.println("Choose Your Items");
System.out.println("1:Honey chilli potato: "+arr[0]);
System.out.println("2:pasta: "+arr[1]);
System.out.println("3:chicken lollipop: "+arr[2]);
System.out.println("4:chicken roll: "+arr[3]);
System.out.println("5:schezwan rice: "+arr[4]);
System.out.println("6:masala dosa: "+arr[5]);
System.out.println("7:plain dosa: "+arr[6]);
System.out.println("8:lassi: "+arr[7]);
System.out.println("9:chach: "+arr[8]);
System.out.println("10:Shikanji: "+arr[9]);
int num=in.nextInt();
System.out.println("enter quantity");
int qty=in.nextInt();
int p=1;
while(p==1){
System.out.println("more items?....y or n");
resp=in.next();
if(resp.compareTo("y")==0 || resp.compareTo("n")==0){
p=0;}
else{p=1;}
total=total+(arr[num-1]*qty);
}}

System.out.println("1:home delivery or 2:self pick");
int ent=in.nextInt();
if(ent==1){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your address");
in.nextLine();
String add=in.nextLine();
System.out.println("enter your phone number");
int nu=in.nextInt();
}
else if(ent==2){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your phone number");
int nu=in.nextInt();
}
System.out.println("bill  "+total);
if(total>200){
total=total-(int)(total*0.3);
System.out.println("bill after discount  "+total);
}
System.out.println("");
if(total>10){
cancel=(int)(total*0.2);
System.out.println("if you cancel your order cancellation charges will be"+":-"+cancel);
System.out.println("");
}
}

void menu3(){
Scanner in=new Scanner(System.in);
int arr[]=new int[10];
arr[0]=50;
arr[1]=70;
arr[2]=100;
arr[3]=60;
arr[4]=65;
arr[5]=45;
arr[6]=30;
arr[7]=15;
arr[8]=10;
arr[9]=20;
String resp="y";
int total=0;
float cancel=0;
while(resp.compareTo("y")==0){
System.out.println("Choose Your Items");
System.out.println("1:Honey chilli potato: "+arr[0]);
System.out.println("2:pasta: "+arr[1]);
System.out.println("3:chicken lollipop: "+arr[2]);
System.out.println("4:chicken roll: "+arr[3]);
System.out.println("5:schezwan rice: "+arr[4]);
System.out.println("6:masala dosa: "+arr[5]);
System.out.println("7:plain dosa: "+arr[6]);
System.out.println("8:lassi: "+arr[7]);
System.out.println("9:chach: "+arr[8]);
System.out.println("10:Shikanji: "+arr[9]);
int num=in.nextInt();
System.out.println("enter quantity");
int qty=in.nextInt();
int c=1;
while(c==1){
System.out.println("more items?.......y or n");
resp=in.next();
if(resp.compareTo("y")==0 || resp.compareTo("n")==0){
c=0;}
else{c=1;}
total=total+(arr[num-1]*qty);
}}

System.out.println("1:home delivery or 2:self pick");
int ent=in.nextInt();
if(ent==1){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your address");
in.nextLine();
String add=in.nextLine();
System.out.println("enter your phone number");
int nu=in.nextInt();
}
else if(ent==2){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your phone number");
int nu=in.nextInt();
}
System.out.println("bill  "+total);
if(total>200){
total=total-(int)(total*0.3);
System.out.println("bill after discount  "+total);
}
System.out.println("");
if(total>10){
cancel=(int)(total*0.2);
System.out.println("if you cancel your order cancellation charges will be"+":-"+cancel);
System.out.println("");
}
}

void menu4(){
Scanner in=new Scanner(System.in);
int arr[]=new int[10];
arr[0]=50;
arr[1]=70;
arr[2]=100;
arr[3]=60;
arr[4]=65;
arr[5]=45;
arr[6]=30;
arr[7]=15;
arr[8]=10;
arr[9]=20;
String resp="y";
int total=0;
float cancel=0;
while(resp.compareTo("y")==0){
System.out.println("Choose Your Items");
System.out.println("1:Honey chilli potato: "+arr[0]);
System.out.println("2:pasta: "+arr[1]);
System.out.println("3:chicken lollipop: "+arr[2]);
System.out.println("4:chicken roll: "+arr[3]);
System.out.println("5:schezwan rice: "+arr[4]);
System.out.println("6:masala dosa: "+arr[5]);
System.out.println("7:plain dosa: "+arr[6]);
System.out.println("8:lassi: "+arr[7]);
System.out.println("9:chach: "+arr[8]);
System.out.println("10:Shikanji: "+arr[9]);
int num=in.nextInt();
System.out.println("enter quantity");
int qty=in.nextInt();
int a=1;
while(a==1){
System.out.println("more items?.......y or n");
resp=in.next();
if(resp.compareTo("y")==0 || resp.compareTo("n")==0){
a=0;}
else{a=1;}
total=total+(arr[num-1]*qty);
}
}


System.out.println("1:home delivery or 2:self pick");
int ent=in.nextInt();
if(ent==1){
System.out.println("Enter your name");
String name=in.next();
System.out.println("Enter your address");
in.nextLine();
String add=in.nextLine();
System.out.println("Enter your phone number");
int nu=in.nextInt();
}
else if(ent==2){
System.out.println("Enter your name");
String name=in.next();
System.out.println("Enter your phone number");
int nu=in.nextInt();
}
System.out.println("Bill  "+total);
if(total>200){
total=total-(int)(total*0.3);
System.out.println("Bill after discount  "+total);
}
System.out.println("");
if(total>10){
cancel=(int)(total*0.2);
System.out.println("if you cancel your order cancellation charges will be"+":-"+cancel);
System.out.println("");
}
}

void menu5(){
Scanner in=new Scanner(System.in);
int arr[]=new int[10];
arr[0]=50;
arr[1]=70;
arr[2]=100;
arr[3]=60;
arr[4]=65;
arr[5]=45;
arr[6]=30;
arr[7]=15;
arr[8]=10;
arr[9]=20;
String resp="y";
int total=0;
float cancel=0;
while(resp.compareTo("y")==0){
System.out.println("Choose Your Items");
System.out.println("1:Honey chilli potato: "+arr[0]);
System.out.println("2:pasta: "+arr[1]);
System.out.println("3:chicken lollipop: "+arr[2]);
System.out.println("4:chicken roll: "+arr[3]);
System.out.println("5:schezwan rice: "+arr[4]);
System.out.println("6:masala dosa: "+arr[5]);
System.out.println("7:plain dosa: "+arr[6]);
System.out.println("8:lassi: "+arr[7]);
System.out.println("9:chach: "+arr[8]);
System.out.println("10:Shikanji: "+arr[9]);
int num=in.nextInt();
System.out.println("enter quantity");
int qty=in.nextInt();
int u=1;
while(u==1){
System.out.println("more items?......y or n");
resp=in.next();
if(resp.compareTo("y")==0 || resp.compareTo("n")==0){
u=0;}
else{u=1;}
total=total+(arr[num-1]*qty);
}
}

System.out.println("1:home delivery or 2:self pick");
int ent=in.nextInt();
if(ent==1){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your address");
in.nextLine();
String add=in.nextLine();
System.out.println("enter your phone number");
int nu=in.nextInt();
}
else if(ent==2){
System.out.println("enter your name");
String name=in.next();
System.out.println("enter your phone number");
int nu=in.nextInt();
}
System.out.println("bill  "+total);
if(total>200){
total=total-(int)(total*0.3);
System.out.println("bill after discount  "+total);

}
System.out.println("");
if(total>10){
cancel=(int)(total*0.2);
System.out.println("if you cancel your order cancellation charges will be"+":-"+cancel);
System.out.println("");
}
}
}










class rest extends menu{
void res(){
int select=0;
rest r=new rest();
Scanner scan=new Scanner(System.in);
System.out.println("Hello....Could you please tell your locality");
System.out.println("1:Bidholi");
System.out.println("2:Kandoli");
System.out.println("3:Pondha");
int in=scan.nextInt();
if(in==1 || in==2 || in==3){
String choice="";
switch(in){
case 1:
int s=1;
while(s==1){
System.out.println("Choose from where you want to order your dine");
System.out.println("1:Chaupal Res ; Rating 4.0");
System.out.println("Near Upes/Pizza Hub");
	System.out.println("234111");
System.out.println("");
System.out.println("2:Tomar ; Rating 3.9");
System.out.println("Behind Baap Cafe");
	System.out.println("123456");
System.out.println("");
select=scan.nextInt();
if(select==1 || select==2){
if(select==1){
choice="Chaupal rest.";
r.menu1();
s=0;
}
else if(select==2){
choice="Tomar rest.";

r.menu2();
s=0;
}
}
else{System.out.println("wrong entry");
s=1;
}
}
break;
case 2:
int d=1;
while(d==1){
System.out.println("Choose from where you want to order your dine");
System.out.println("1:Standard Food ; Rating 3.5");
System.out.println("Near Upes (Kandoli Campus)");
	System.out.println("231876");
System.out.println("");
System.out.println("2:Krrust Res ; Rating 4.1");
	System.out.println("Opp.Shahid point");
System.out.println("231178");
System.out.println("");
select=scan.nextInt();
if(select==1 || select==2){
if(select==1){
choice="Standard food";

r.menu3();
d=0;
}
if(select==2){
choice="krrust rest.";

r.menu4();
d=0;

}
}
else{System.out.println("wrong entry");
d=1;}
}
break;
case 3:
int t=1;
while(t==1){
System.out.println("Choose from where you want to order your dine");
System.out.println("1:Blue sea Res ; Rating 4.0");
System.out.println("Opp.Sona Boys Hostel");
	System.out.println("986432");
System.out.println("");
select=scan.nextInt();
if(select==1){
if(select==1){
choice="Blue sea Res";

r.menu5();
t=0;
}
}
else{System.out.println("wrong entry");
t=1;}
}
break;

}
}
}
}












public class food{
public static void main(String args[]){
Scanner sh= new Scanner(System.in);
System.out.println("Foodbae is a food service provider which provides you to choose a variety of food and drinks at economical rate from your nearby restaurant/cafes");
System.out.println("It is always providing you some good offers to make your day as refreshing as the exotic beach environment in the summers.This place never closes");
System.out.println("and welcomes you for 24*7");
System.out.println("");          
System.out.println("Contact number:-9518032578");
System.out.println("");

rest oj=new rest();
oj.res();

System.out.println("1:Payment or 2.Cancellation");      /*payment*/
/*if you want to cancel your order you have got sufficient time to cancel it down*/
Stopwatch ob=new Stopwatch();
ob.watch();
System.out.println("");
int enr=sh.nextInt();
if(enr==1){
System.out.println("Cash/E-wallet");
System.out.println("");
System.out.println("1.Cash or 2.E-wallet");
int os=sh.nextInt();
if(os==1)
{
System.out.println("Cash");
System.out.println("Your Order Will Be Delivered To You By 30 Minutes");
System.out.println("");
System.out.println("");
System.out.println("**Note:- If you cancel your order now then you have to pay the cancellation charges shown above according to our policy.. :)");}
else if(os==2)
{
System.out.println("E-wallet");
System.out.println("Your Order Will Be Delivered To You By 30 Minutes");
System.out.println("");
System.out.println("");
System.out.println("**Note:- If you cancel your order now then you have to pay the cancellation charges shown above according to our policy.. :)");}
}
else if(enr==2){
System.out.println("No problem");
System.out.println("No Charges Will Cut Down From Your Side");
}
System.out.println("");
System.out.println("Thank You for choosing our services.....");
System.out.println("Have a nice day :)");

}
}


