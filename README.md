# BigBangGenerator

Generate an array for number 1 to 100, replace the numbers when

-   Divisible by 3 with "BIG"
-   Divisible by 5 with "BANG"
-   Divisible by 3 and 5 with "BIGBANG"
-   Other numbers remain as their string value.

And output the result to "output.json" as JSON array format

# How to Run

1. **Clone the project**<br>
   open command prompt / bash<br>
   git clone https://github.com/Cresswell-0301/BigBangGenerator.git<br>
   cd BigBangGenerator

2. **Complie JAVA File**<br>
   javac BigBangGenerator.java

3. **Run the Script**<br>
   java BigBangGenerator

4. **Check the output.json file**<br>
   See output.json in the project folder. It contain the generated array.<br>
   The file contains the result array, e.g. :
   <br>
   ["1", "2", "BIG", "4", "BANG", "BIG", "7", "8", "BIG", "BANG", "11", "BIG", "13", "14", "BIGBANG", …. all the way to 100]
