import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        System.out.println("Welcome to Health Organization Vaccination program!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Queue Size for Vaccination!!");
        int totalPop = scanner.nextInt();
        Queue queue = new Queue(totalPop); // create queue object
        while (true) {
            System.out.println("Enter the Number!\n[1] - Add new Person \n[2] - Get Next Person on the Queue");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    if (checkqueue(queue, totalPop)) {
                        Person person = addPerson();
                        try {
                            queue.enqueue(person); // enqueue the person to the queue
                            System.out.println("New Person Added!!");
                        } catch (Exception e) {
                            System.out.println(e + "\nError Occured!! Please Try Again!!");
                            break;
                        }
                        break;
                    } else {
                        break;
                    }
                case 2:
                    try {
                        Person NextPerson = queue.dequeue();
                        System.out.println("Next Person on the Queue is: " + NextPerson.getName() + " with the age of: "
                                + NextPerson.getAge());
                    } catch (Exception e) {
                        System.out.println(e + "\nError Occured!! Please Try Again!!");
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid command!!");
                    break;
            }
        }
    }

    public static Person addPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name of the person who is about to be vaccinated!!");
        String name = scanner.next();
        System.out.println("Enter the Age of the person who is about to be vaccinated!!");
        try {
            int age = scanner.nextInt();
            return new Person(name, age);

        } catch (Exception e) {
            System.out.println("Age is Invalid! Please Try Again!");
            return null;
        }

    }

    public static boolean checkqueue(Queue queue, int totalPop) {
        if (queue.getCount() < totalPop) {
            return true;
        } else {
            System.out.println("Queue is Full!!! Please wait till one person gets in!");
            return false;
        }
    }

}
