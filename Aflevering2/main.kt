package com.example.myapplication.CS101.Aflevering2

fun main() {

//opgave 1
    println("opgave 1")


    var employee1 = Employee("Bo", "Bosen")
     employee1.salary = 30.000

    var employee2 = Employee("Linea", "Moltved")
     employee2.salary = 31.000

    println("Bo has a salary of ${employee1.salary}")
    println("Linea has a salary of ${employee2.salary}")


    fun increaseSalary( currentSalary: Double): Double {
        val newSalary: Double = currentSalary*1.10
        println("now the salary is $newSalary")
        return newSalary
    }
    //kalder den på alle employees
    //Bo
    increaseSalary(30000.00)
    //Linea
    increaseSalary(31000.00)

    //opagave 2
    println("Opgave 2")
    //create a laptop
    val newLaptop = Laptop("Lenovo YOGA 7", 4000, true, "15 tommer")
    println(newLaptop)

    //create phone
    val newPhone = smartPhone("SamSung s5", 2000, false, "Ok")
    println(newPhone)

    //opgave 3
    println("Opgave 3")
    //opretter producter i klasserne
    val newBook = Book("How to read a book by Bo Bosen", 200, 3)
    val newTshirt = Tshirt("The best T-shirt (trademark)", 500, 5)
    val newShoe = Shoe("Hiking Boots: These boots are made for walking", 1200, 4)

    //tester ved at printe
    println("Shoe: ${newShoe.name}, Price: ${newShoe.price}")
    println(newTshirt)
    println("Book: ${newBook.name}")

    //printer method for hvert product
    println(newShoe.identifyProductCategory())
    println(newTshirt.identifyProductCategory())
    println(newBook.identifyProductCategory())

    //opgave 4
    println("opgave 4")
    //lad fx chatGPT løse en opgave som juniorkoder og som senoirkoder
        //Bruger chatGPT
    //som junioir - er i ShapeJunior.kt
        //den startede med at svare i python, så jeg bad dem om at lave det i kotlin istedet

    //Starter med at lave en abstract class Shape - jeg ved ikke hvad abstract gør
        //Det ser ud til, at det gør så man feks kan lave en funktion under methods uden at den har noget indhold endnu - og så kan man i underklasserne bruge override til at specifere hvad funktionen skal gøre
        //den bruger Math.PI hvilket virker ret smart og er simpelt at forstå hvad gør
        //der er en funktion til at omregne omkredsen af trekantetn - den hedder calculatePerimeter og den bruges så
        //til at regne arealet ud ved en matematisk formel der bruger Herons formel som skal bruge halvdelen af omkredsen og alle sidelængder til at regne arealet ud

    //som senior - er i ShapeSenior.kt
        //selve koden er ret ens ud men der er mere forklarende tekst
        //senoir er meget nemmere at forstå. Variablene/propherties i klasserne er declaret på hver sin linje, hvor junior har hele volemitten i den samme linje
        //senoir bruger sideA B og C mens junior bruger side 1 2 og 3
        //junoir og senoir laver s til udregning af trekant areal forskelligt
        //senior:
// val s = (sideA + sideB + sideC) / 2
        //junior
//val s = calculatePerimeter() / 2
        //senior er nemmere at forstå da man kan se hvad der foregår, hvor junir bare tager fat i funktionen - som godt nok returnere det samme, men det er ikke ligeså læseligt

    //overall er senoir langt nemmere at læse og forstå pga bedre opstilling og indeling med linjeskift + små kommentarer så man kan se fx hvad der udregnes


    //opgave 5 - eller ihvertfald noget af den
    println("Opgave 5")

}