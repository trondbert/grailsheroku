package grails20test



import grails.test.mixin.*
import org.junit.*
import org.apache.log4j.Logger
import grails.test.mixin.domain.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PostController)
@TestMixin(DomainClassUnitTestMixin)
class PostControllerTests {

	Logger logger = Logger.getLogger(getClass())

    void testIndexForwardToList() {
       controller.index()
       assert response.redirectedUrl == "/post/list"
    }

    void testListShouldShowAllPosts() {    	
    	Post theOnePost = new Post();
    	theOnePost.content = "Hello"
    	theOnePost.user 	= "Mark8080"

		mockDomain(Post, [theOnePost])

    	Map model = controller.list()

    	assert model.postList == [theOnePost]
    }
}
