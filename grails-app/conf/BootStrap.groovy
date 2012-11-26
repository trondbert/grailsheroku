import com.trondvalen.blogster.Post
import com.trondvalen.blogster.Role
import com.trondvalen.blogster.User
import com.trondvalen.blogster.UserRole;

class BootStrap {

    def init = { servletContext ->
		if (!Post.count()) {
            new Post(user: "Mike", content : "Hi all").save(failOnError: true)            
        }
		def adminRole = new Role(authority: "ROLE_ADMIN")
		adminRole.save()
		def memberRole = new Role(authority: 'ROLE_MEMBER')
		memberRole.save()
		
		def member = new User(username: "member", password: "member", enabled: true)
		member.save()
		def admin = new User(username: "admin", password: "admin", enabled: true)
		admin.save()
		
		UserRole.create(member, memberRole)
		UserRole.create(admin, adminRole)

    }
    def destroy = {
    }
}
