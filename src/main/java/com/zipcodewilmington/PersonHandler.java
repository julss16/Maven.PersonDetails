package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter= 0;
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
        while (counter < personArray.length){
            result += personArray[counter].toString();
                counter++;
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop

        return result;
    }



    public String forLoop() {
        String result = "";

        for (int i =0; i < personArray.length; i++){
            result += personArray[i].toString();
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

        int counter =0;


        for ( Person personArray : personArray) {
            result += personArray.toString();
            counter++;

            //result += personArray[i].toString();


            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

        } return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

/**

 public static int findSumWithoutUsingStream(int[] array) {
 int sum = 0;
 for (int value : array) {
 sum += value;
 }
 return sum;
 }
 }

 */