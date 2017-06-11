/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spel1;

/**
 *
 * @author joels
 */
public class Test {
   
    static void skriv(String str){
        System.out.println(str);
    }
    
    void skriv(){
        this.skriv("hej");
    }
    
    void skriv(int in){
        for(int i = 1; i < (in+1); i++){
            this.skriv(i + "kHus");
        }
    }
    
    public static void main(String[] args){
        Test test = new Test();
        test.skriv("hej");
        test.skriv("hejsan");
        test.skriv("HEJSAAAAAAANSANANA...NA");
        test.skriv(7);
        
       
    }
    
}
