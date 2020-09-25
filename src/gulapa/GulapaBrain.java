/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gulapa;

import java.util.ArrayList;

/**
 *
 * @author 3Z5RZL2
 */
public class GulapaBrain {

    static ArrayList w = new ArrayList();
    static ArrayList r = new ArrayList();
    public String[] knowledgebase = {"name", "age", "hi", "hello"};
    public String[] responses = {"My Name is Dante PAPA Gulapa", "I am 69 years old","Hello!", "Hi!"};
    public int loopcount = 0;
    public int newcount = 0;

    public String analyzeChat(String message) {

        for (Object x : w) {

            if (message.contains(String.valueOf(x))) {
                String out = String.valueOf(r.get(newcount));

                return out;
            }
            newcount++;

        }
        for (String y : knowledgebase) {

            if (message.contains(y)) {
                String out = responses[loopcount];

                return out;
            }
            loopcount++;
        }
        return "I can't understand";
    }

    public String newWord(String message) {
        GulapaBrain.w.add(message);

        return "(" + message + ")" + " has been added. What should I response into that?";
    }

    public String newReply(String message) {
        GulapaBrain.r.add(message);
        return "(" + message + ")" + " has been learned";
    }
}
