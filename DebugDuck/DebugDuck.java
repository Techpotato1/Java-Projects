/*
 * Wyatt Cares
 * APCSA
 * A simple class for the DebugDuck
*/
package DebugDuck;
public class DebugDuck 
{
    private int age;
    private String name;
    private String color;
    private String costume;

    public DebugDuck(int a, String n, String c, String cs) 
    {
        System.out.println("New Duck created!");
        age = a;
        name = n;
        color = c;
        costume = cs;
        System.out.println("They are " + age + " years old, their name is " + name + ", their color is " + color + " and their costume is " + costume);
    }

    public void speak() {
        System.out.println("Quack!");
    }

    public void speak(int n)
    {
        for (int i = 1; i < n; i++)
        {
            speak();
        }
    }

    public void speak(String s)
    {
        System.out.println("The duck says: ");
        System.out.println(s);
    }
}
