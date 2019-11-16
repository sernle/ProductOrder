# ProductOrder
Simple rest API to demo product order end to end


# Requirements
API supports basic products CRUD:
● Create a new product
● Get a list of all products
● Update a product
The API should also support:
● Placing an order
● Retrieving all orders within a given time period
A product should have a name and some representation of its price.

# Persistence consideration
Due to the requirement, I think we could use a simple key-value database here. 
There is not any require for complex transaction here. Most of the key-value/document database in the market could 
