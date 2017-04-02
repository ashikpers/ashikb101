When(/^User enter search item$/) do
    $driver.find_element(:name,"search").send_keys("iPhone")
end

When(/^User click on Search$/) do
  $driver.find_element(:xpath,".//*[@id='search']/span/button").click
end

Then(/^User navigate to search result page$/) do
   puts "Search Successfully"
end