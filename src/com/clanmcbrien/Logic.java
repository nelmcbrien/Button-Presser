/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clanmcbrien;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.SwingWorker;

/**
 *
 * @author Nelson3
 */
public class Logic implements Runnable {
    
    Boolean keepGoing = true;    
    int time = 1000;
    char keyRaw = 'e';
    int keyToPress = KeyEvent.getExtendedKeyCodeForChar(keyRaw);
    
    public void run () {        
        
        while(keepGoing) {
            
            try {
                Robot r = new Robot();                    
                r.keyPress(keyToPress);
                r.keyRelease(keyToPress);
                r.delay(time);
                
            } catch (AWTException e){
                e.printStackTrace();
            }
        }
    }
    
    public void setTime (int time) {
        this.time = time;
    }
    
    public void setKeepGoing (Boolean keepGoing) {
        this.keepGoing = keepGoing;
    }
    
    public void setKeyRaw (int key) {
        this.keyToPress = key;
    }
    
    //Erase below?    
    public void programGo(int time) {
        //Start doing stuff here...
        keepGoing = true;
        
        while(keepGoing) {
            
            try {
                Robot r = new Robot();                    
                r.keyPress(KeyEvent.VK_E);
                r.keyRelease(KeyEvent.VK_E);
                r.delay(time);                
                
            } catch (AWTException e){
                e.printStackTrace();
            }
        }
    
    }
    public void programStop() {
        keepGoing = false;         
    }         
}
