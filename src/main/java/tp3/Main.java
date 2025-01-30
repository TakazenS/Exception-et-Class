package tp3;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exo1();
    }

    public static void exo1() {
        boolean sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un int : ");
                int i = sc.nextInt();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                   System.out.println("Veuillez entrer un nombre entier !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }
        
        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un nombre réel : ");
                float i = sc.nextFloat();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre réel !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }

        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un byte : ");
                byte i = sc.nextByte();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un byte !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }

        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un texte : ");
                char i = sc.nextLine().charAt(0);
                System.out.println("" + i);
                sortie = true;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Veuillez entrer un texte !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }

        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un short : ");
                short i = sc.nextShort();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un short !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }

        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un double : ");
                double i = sc.nextDouble();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un double !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }

        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un long : ");
                long i = sc.nextLong();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un long !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }

        sortie = false;
        while (!sortie) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Entrez un texte : ");
                String i = sc.nextLine();
                System.out.println("" + i);
                sortie = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un texte !");
            } catch (NoSuchElementException e) {
                System.out.println("Sortie forcée par l'utilisateur !");
                break;
            }
        }
    }

}

