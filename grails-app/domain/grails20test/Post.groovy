package grails20test

import org.joda.time.DateMidnight;

class Post {

	DateMidnight    datePosted = new DateMidnight();
	String			user;
	String			content;

    static constraints = {
    }
}
