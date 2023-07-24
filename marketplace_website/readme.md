
```
Design an online marketplace that allows buyers to browse and purchase products from multiple sellers. The marketplace should provide an easy-to-use interface for buyers to search and filter products, view product details, add products to their shopping cart, and checkout. The goal is to create a seamless and efficient online shopping experience for buyers.


User Registration and Login
Users must be able to register and log in to their accounts.
Product Fetch
The system should be able to retrieve any product using an identifier.
Shopping Cart
Buyers should be able to add products to a shopping cart, view their cart, and checkout.
The checkout process should collect necessary information from the buyer, including shipping address, payment information, and order confirmation.
Order Management
Buyers should be able to view their order history and track their orders.
Functions to help you think
createUser(User user): This function is used to create and store a new user in the system. It takes a User object as input which contains the user's details like name, email, password, and other relevant information. The function should validate the input data before storing the user.

getUser(String userId): This function retrieves the user's details based on their unique user ID. It takes a userId as input and returns a User object containing the user's details. The function should handle the case when the userId does not exist in the system.

getProduct(String productId): This function retrieves the product's details based on its unique product ID. It takes a productId as input and returns a Product object containing the product's details. The function should handle the case when the productId does not exist in the system.

addToCart(String userId, String productId, int quantity): This function is used to add a product to the user's shopping cart. It takes userId, productId, and quantity as inputs and adds the product to the user's cart with the specified quantity. If the product is already in the cart, the quantity should be updated. The function should handle the case when either userId or productId does not exist in the system.

getCart(String userId): This function retrieves the user's shopping cart. It takes userId as input and returns a list of CartItem objects containing the details of each product in the user's cart. The function should handle the case when the userId does not exist in the system.

checkout(String userId): This function is used to check out the user's shopping cart. It takes userId as input and completes the order by creating a new Order object and updating the inventory of each product in the cart. The function should handle the case when the userId does not exist in the system, or the cart is empty.

getOrderHistory(String userId): This function retrieves the user's order history. It takes userId as input and returns a list of Order objects containing the details of each completed order. The function should handle the case when the userId does not exist in the system, or the user has no order history.
```