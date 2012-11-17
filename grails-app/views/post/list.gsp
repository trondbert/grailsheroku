<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Blogzilla - Posts</title>
	</head>
	<body>
		<g:each in="${postList}" status="i" var="post">
		  <div class="postBox">
		  	<div><b>${post.user}</b> - Posted: <g:formatDate date="${post.datePosted}"/></div>
		  	${post.content}
		  </div>
		</g:each>
		<div id="createPostLink">
			<a href="#" onclick="hideAndShow('createPostLink','createPostForm')">New Post</a>
		</div>
		<div id="createPostForm" style="display:none">
			<g:form action="create">
			<fieldset><legend>New post</legend>
				<div><label>Your name</label><g:textField name="user"/></div>
				<div><label>Your words</label><g:textArea name="content"></g:textArea></div>				
				<g:submitButton name="Submit"/>
			</fieldset>
			</g:form>
		</div> 
	</body>
</html>
		