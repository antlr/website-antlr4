/*
	JH Functions
*/

$(document).ready(function() {
    
    
// pre load

/*	function preload(arrayOfImages) {
	    $(arrayOfImages).each(function(){
	        $('<img/>')[0].src = this;
	        // Alternatively you could use:
	        // (new Image()).src = this;
	    });
	}

	preload([
	    'images/home-hover.png',
	    'images/dropdown.png'	    
	]);	   
*/	    
    
    
    
    $('#quickstart').cycle({ 
	    fx:     'fade', 
	    speed:  'fast', 
	    timeout: 0, 
	    pager:  '#pager-qs' 
	});
	
    $('#samples').cycle({ 
	    fx:     'fade', 
	    speed:  'fast', 
	    timeout: 0, 
	    pager:  '#pager-sa' 
	});	


/*

$(window).bind("load", function() {

    $('.tweet_list').cycle({ 
	    fx:     'scrollLeft', 
	    timeout: 6000, 
	    pager:  '#pager-tw' 
	});	


    $('#tests').cycle({ 
	    fx:     'scrollLeft', 
	    timeout: 6000, 
	    pager:  '#pager-te' 
	});	

});	

*/
	
    
      $('#tab-qs a').addClass("active");
      $('#quickstart,#pager-qs,#hd-qs').fadeIn('fast');

	  $('#tab-qs a').click(function() {
                    $('#samples,#pager-sa,#hd-sa').hide();                                                            	  
                    $('#quickstart,#pager-qs,#hd-qs').fadeIn();
                    $(this).addClass("active");
                    $('#tab-sa a').removeClass("active");                    
                });	
    

	  $('#tab-sa a').click(function() {
                    $('#quickstart,#pager-qs,#hd-qs').hide();
                    $('#samples,#pager-sa,#hd-sa').fadeIn();                                                            
                    $(this).addClass("active");
                    $('#tab-qs a').removeClass("active");  
                });	    
    
    
	  $('.slide').corner("5px");
		

//fancybox

	$(document).ready(function(){  

	$(function(){

				jQuery.fn.getTitle = function() {
			var arr = jQuery("a.fancybox");
			jQuery.each(arr, function() {
				var title = jQuery(this).children("img").attr("title");
				jQuery(this).attr('title',title);
			})
		}

		// Supported file extensions
		var thumbnails = 'a:has(img)[href$=".bmp"],a:has(img)[href$=".gif"],a:has(img)[href$=".jpg"],a:has(img)[href$=".jpeg"],a:has(img)[href$=".png"],a:has(img)[href$=".BMP"],a:has(img)[href$=".GIF"],a:has(img)[href$=".JPG"],a:has(img)[href$=".JPEG"],a:has(img)[href$=".PNG"]';

		$(thumbnails).addClass("fancybox").attr("rel","fancybox").getTitle();

			$("a.fancybox").fancybox({
			prevEffect	: 'fade',
		nextEffect	: 'fade'
			});

		});

		});
       
});	//document ready