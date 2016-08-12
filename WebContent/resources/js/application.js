// var application = (function(){})(); IIFE패턴

var application = (function(){
	var init = function(param) {
		sessionStorage.setItem('context', param);
	};
	var getContextPath = function(){
		return sessionStorage.getItem('context');
	};
	var go_home = function(){
		location.href = this.getContextPath()+"/home.do";
	};
	
	return {
		to_douglas : function() {
			location.href = getContextPath()+"/douglas.do";
		},
		
		init : init,
		go_home : go_home,
		getContextPath : getContextPath
	};
})();

	
