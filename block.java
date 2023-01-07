/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokchain;
import java.util.Arrays;
//this class process for block operations.
public class block {
    //block value of block that is before from recent block
    private int previousHash;
    //data that we want to save in chain
    private String[] transaction;
    //recent value of block
    private int blockHash;
    
    
    //its a construction with two arguments.
    public block(int previousHash, String[] transaction){
        //assigned arguments to class variables.
this.previousHash=previousHash;
this.transaction=transaction;

//assigned data from construction to object
Object[] contents={Arrays.hashCode(transaction),previousHash};
this.blockHash=Arrays.hashCode(contents);
    
    }
//getter and setters for encapsulating.
    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public String[] getTransaction() {
        return transaction;
    }

    public void setTransaction(String[] transaction) {
        this.transaction = transaction;
    }

    public int getBlockHash() {
        return blockHash;
    }
    
    
    
    
}
