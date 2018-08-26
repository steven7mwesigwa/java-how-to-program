
package chapter3.bankaccount;

//    -----------------------------------
//    |         Account                 |
//    |---------------------------------|
//    | - name : String                 |
//    |---------------------------------|
//    | + setName(name : String)        |
//    | + getName() : String            |
//    |                                 |
//    -----------------------------------



/**
 *
 * @author jaguar
 */
public class Account {

    private String name; // instance variable
    
    /**
     * method to set the name in the object
     * @param name
     */
    public void setName(String name) {
        this.name = name; // store the name
    }

    /**
     * method to retrieve the name from the object
     * @return
     */
    public String getName() {
        return name; // return value of name to caller
    }

}
