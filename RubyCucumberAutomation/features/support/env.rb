require 'Selenium-webDriver'
Before do
  $driver = Selenium::WebDriver.for :firefox
  $driver.get "http://shop.thetestingworld.com"
end

After do
  $driver.quit
end