if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}

function hideAndShow(hideThis, showThis) {
	$('#'+hideThis).hide();
	$('#'+showThis).show();
	
}