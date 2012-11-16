package grails20test

class PostController {

    def index() { 
    	redirect action: "list"
    }

    def list() {
    	[postList : Post.list()]
    }
	
	def create() {
		Post post = new Post(params)
		post.save() 
		redirect action: "list"
	}
}
