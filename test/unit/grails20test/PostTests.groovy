package grails20test



import grails.test.mixin.*
import org.junit.*
import org.joda.time.DateMidnight;

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostTests {

    void testSomething() {
       assert new Post():getDatePosted() == new DateMidnight();
    }
}