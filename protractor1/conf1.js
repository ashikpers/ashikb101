// conf.js
exports.config = {
		
  directConnect : true,
  multiCapabilities: [{
		browserName: 'chrome'
	}],
  framework: 'jasmine',
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['spec.js'],
jasmineNodeOpts: {
	defaultTimeoutInterval: 500000
}
}