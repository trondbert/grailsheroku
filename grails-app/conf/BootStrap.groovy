class BootStrap {

    def init = { servletContext ->
		if (!Post.count()) {
            new Post(user: "Mike", content : "Hi all").save(failOnError: true)            
        }

    }
    def destroy = {
    }
}
