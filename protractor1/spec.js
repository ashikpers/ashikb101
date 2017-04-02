// spec.js
describe('Protractor Demo App', function() {
  it('should have a title', function() {
    browser.get('http://www.way2automation.com/angularjs-protractor/banking/#/login');

    expect(browser.getTitle()).toEqual('Protractor practice website - Banking App');
    element(by.buttonText("Customer Login")).click();
    element.all(by.css("#userSelect option")).then(function(dropdown){
    	console.log("total items in dropdown are" + dropdown.length);
    	for(i=0;i<dropdown.length;i++)
    		{
    		dropdown[i].getText().then(function(text){
    			console.log(" the customer "+ i + "in dropdown is "+ text);
    			
    		});
    		}
    
   dropdown[2].click();
   dropdown[2].getText().then(function(a){
	  
   
   element(by.buttonText("Login")).click();
   element(by.className("fontBig ng-binding")).getText().then(function(text){
   console.log(a+ " is same as " +text);
	   
   })
    
   });
    });
  });
});