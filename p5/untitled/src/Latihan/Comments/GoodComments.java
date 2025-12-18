package Latihan.Comments;

import java.util.regex.Pattern;

public class GoodComments {
    class Responder{}


    //legal comments
    // Copyright (C) 2011 by Osoco. All rights reserved.
    // Released under the terms of the GNU General Public License
    // version 2 or later.

    //informative comments
    // Returns an instance of the Responder being tested.
    protected Responder responderInstance() {
        return null;
    }

    // renaming the function: responderBeingTested
    // format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*,\\d*");

    //clarification
    /*
    void assertTrue(a.compareTo(b) == -1); // a < b
    void assertTrue(b.compareTo(a) == 1); // b > a

     */
}
