<<<<<<< HEAD
# CDAC_Preparatory_Assignments

Assignments Given before admission as revision
Done with cpp and java

***

># Q1. Write a program to input n numbers on command line argument and calculate maximum of them.

># Q2. Write a program to calculate a Factorial of a number.

># Q3. Write a program to calculate Fibonacci Series up to n numbers

># Q4. Write a program to calculate the grade of a student. There are five subjects. 
># Marks in each subject are entered from keyboard. Assign grade 
># based on the following rule:
>>Total Marks >= 90
>>
>>Grade: Ex
>>
>>90 > Total Marks >= 80
>>
>>Grade: A
>>
>>80 > Total Marks >= 70
>>
>>Grade: B
>>
>>70 > Total Marks >= 60
>>
>>Grade: C
>>
>>60 > Total Marks
>>
>>Grade: F

># Q5. Write a program to check the input characters for uppercase,
># lowercase, number of digits and other characters. Display appropriate
># message.

># Q6. Write a program to perform matrix multiplication.

># Q7. Write a program to accept a number from user using command line
># argument and display its table.

># Q8. Write a program to read the name of a student (studentName), roll
># Number (rollNo) and marks (totalMarks) obtained. rollNo may be an
># alphanumeric string. Display the data as read. Hint: Create a Student
># structure and write appropriate functions.

># Q9. Accept an integer number and when the program is executed print the
># binary, octal and hexadecimal equivalent of the given number.
># Sample Output:
>>Enter Number : 20
>>Given Number :20
>>Binary equivalent :10100
>>Octal equivalent :24
>>Hexadecimal equivalent :14
>
>Hint: Use bitwise operators for binary conversion. Octal/Hexadecimal
>conversion to be done by repetitive division using recursion.

># Q10. Read at most 10 names of students and store them into an array of
># char nameOfStudents[10][50]. Sort the array and display them back. 
>Hint: Use qsort() method.

># Q11. Create a structure called Employee that includes three fields - a first
># name (type String), a last name (type String) and a monthly salary (double).
># Write functions to initialize the fields, print them and modify the values in
>#the given object. 
>Example methods:
>>void emp_init(struct emp* e);
>>void set_salary(struct emp *e, double sal);
>>void emp_display(struct emp *e);
>
>Write the test code in the main(). Create two emp objects and display each
>object’s yearly salary. Then give each Employee a 10% raise and display
>each Employee’s yearly salary again.

># Q12. Write a Program to reverse the letters present in the given String. 

># Do not use strrev() function.

># Q13. Declare an Array of type char* (Strings) and initialize it with a few strings (hardcoded). Display the strings which are duplicated in that array. (Hint: use
>#strcmp())

># Q14 Write a code to check if string is palindrome.
># Q15. Input a string from the user. Count occurrences (case insensitive) of
># each alphabet in the string.
>Sample output:
>>Input: Welcome to SunBeam.
>>Output:
>>A:1
>>B:1
>>C:1
>>E:3
>>L:1
>>M:2
>> ...
=======
Assignment 1:
error in toDouble for 123456789 fixed
QuickSort added | merge sort added
remaining: active user input and comma sperated input 
corrected qSort partition was ment for horhe partitioning and was not implemented correctly


Assignment 2: 
done

Assignment 3:
done 
remaining: maybe addition of pyramid style printing

Assignment 4:
done
got hang of enum :>
// .name() returns name used while defination ie int a > .name() => a
used classes librally

Assignment 5:
done?
is it to confirm passwords?
feels like it is for passwords
made for password
done

Assignment 6: 
2d matrix multiplication done

Assignment 7: 
multiplication table done

Assignment 8:
later

Assignment 9:
too much jargon with Binary itself
will revisit later
for now using Integet.toString()

Assignment 10:
Strings sort done
by using List
.stream().sort()
gives stable sort
https://thejavaguy.org/posts/013-ultimate-guide-to-sorting-strings-in-java/

Assignment 12:
String reverse done

Assignment 13:
String compair done
<T>=>generic
using HasMap => like/is a dictonary
https://www.geeksforgeeks.org/java-program-to-print-all-the-repeated-numbers-with-frequency-in-an-array/

Assignment 14:
check palendrome done 
>>>>>>> java/master
