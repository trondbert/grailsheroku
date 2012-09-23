package grails20test

import java.util.Date

class Post {

	Date    		datePosted = new Date()
	String			user;
	String			content;

    static constraints = {
    }
}