package com.trondvalen.blogster

import grails.plugins.springsecurity.Secured;

import com.trondvalen.blogster.Post;

class PostController {

    def index() { 
    	redirect action: "list"
    }

    def list() {
    	[postList : Post.list()]
    }
	
	@Secured(['ROLE_MEMBER'])
	def create() {
		Post post = new Post(params)
		post.save()
		redirect action: "list"
	}
}
