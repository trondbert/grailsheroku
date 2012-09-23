package grails20test

class PostController {

    def index() { 
    	redirect action: "list"
    }

    def list() {
    	[postList : Post.list()]
    }
}
