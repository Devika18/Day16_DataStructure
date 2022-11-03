/* Hashing Function to search a Number in a slot
a. Desc -> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to
efficiently search a number from a given set of number
b. I/P -> read a set of numbers from a file and take user input to search a number
c. Logic -> Firstly store the numbers in the Slot. Since there are 10 Numbers divide
each number by 11 and the reminder put in the appropriate slot. Create a Chain
for each Slot to avoid Collision. If a number searched is found then pop it or else
push it. Use Map of Slot Numbers and Ordered LinkedList to solve the problem.
In the Figure Below, you can see number 77/11 reminder is 0 hence sits in the 0
slot while 26/11 remainder is 4 hence sits in slot 4
d. O/P -> Save the numbers in a file
*/

package Hashing;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new Map<Integer, Integer>();
        map.add(77, 77);
        map.add(44, 44);
        map.add(99, 99);
        map.add(12, 12);
        map.add(34, 34);
        map.add(17, 17);
        map.add(96, 96);
        map.add(25, 25);
        map.add(27, 27);

        map.show();
    }
}

