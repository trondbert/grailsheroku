package com.trondvalen.blogster



import grails.test.mixin.*
import org.junit.*

import com.trondvalen.blogster.Post;

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostTests {

    void testSomething() {
       assert new Post():getDatePosted() == new Date()
    }
}
