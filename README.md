🍽️ Foodie CLI Application

A Java-based Command Line Interface (CLI) application inspired by food ordering platforms like Zomato. This app allows users to browse restaurants, explore menus, and place orders — all from the terminal.

📌 Overview

The Foodie CLI Application simulates a real-world food ordering system where users can:

Create and manage customer accounts
Browse restaurants and menus
Select dishes and place orders
View order summaries and history

It’s a great project to demonstrate Java fundamentals, OOP concepts, and CLI-based interaction.

🚀 Features
👤 Customer Management
Register a new account
Login with existing credentials
🍴 Restaurant Selection
View available restaurants
Choose a restaurant to explore
📖 Menu Browsing
Display dishes with descriptions
Easy navigation through menu items
🛒 Order System
Select dishes and quantities
Place orders seamlessly
📄 Order Summary
View selected items before confirmation
Check total bill
📜 Order History (Optional/Extendable)
View previously placed orders
🛠️ Tech Stack
Language: Java
Concepts Used:
Object-Oriented Programming (OOP)
Collections (ArrayList, etc.)
Exception Handling
CLI Interaction (Scanner)
📂 Project Structure
foodie-cli-java/
│── src/
│   ├── Main.java
│   ├── Customer.java
│   ├── Restaurant.java
│   ├── Dish.java
│   ├── Order.java
│
│── bin/        (compiled classes)
│── README.md
⚙️ Installation & Setup

Follow these steps to run the project locally:

1️⃣ Clone the Repository
git clone https://github.com/madhusamala-dev/foodie-cli-java.git
2️⃣ Navigate to Project Directory
cd foodie-cli-java
3️⃣ Compile the Java Files
javac -d bin src/*.java
4️⃣ Run the Application
java -cp bin Main
💻 Usage

Once the application starts, follow the menu:

Register/Login
Browse Restaurants
View Menu
Select Dishes
Place Order
View Summary
🎯 Future Enhancements
✅ Add database integration (MySQL / MongoDB)
✅ Implement payment system
✅ Add admin panel for restaurant management
✅ Convert CLI → Web App (Spring Boot)
✅ Add REST APIs
🤝 Contributing

Contributions are welcome!

Fork the repository
Create a new branch
Make your changes
Submit a Pull Request
📜 License

This project is open-source and available under the MIT License.

👨‍💻 Author

Chauhan K




#OUTPUT
C:\Users\prasa\.jdks\openjdk-25.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\lib\idea_rt.jar=64380" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\prasa\IdeaProjects\foodi-cli-app-java\out\production\foodi-cli-app-java com.chauhan.foodiecliapp.Main
Customers from csv file
[Customer{ id='C001', name='John Doe', email='john.doe@example.com', password='password123'}, Customer{ id='C002', name='Jane Smith', email='jane.smith@example.com', password='password456'}, Customer{ id='C003', name='Alice Johnson', email='alice.johnson@example.com', password='password789'}, Customer{ id='C004', name='Bob Brown', email='bob.brown@example.com', password='password321'}, Customer{ id='C005', name='Charlie Davis', email='charlie.davis@example.com', password='password654'}, Customer{ id='C006', name='Diana Evans', email='diana.evans@example.com', password='password987'}, Customer{ id='C007', name='Eve Foster', email='eve.foster@example.com', password='password111'}, Customer{ id='C008', name='Frank Green', email='frank.green@example.com', password='password222'}, Customer{ id='C009', name='Grace Harris', email='grace.harris@example.com', password='password333'}, Customer{ id='C010', name='Hank Ivan', email='hank.ivan@example.com', password='password444'}]

Restaurant from csv file
[Restaurant{id='R001', name='Spice Haven', address='123 Curry Lane', menu=[]}, Restaurant{id='R002', name='Taste of India', address='456 Spice St', menu=[]}, Restaurant{id='R003', name='Royal Tandoor', address='789 Flavor Ave', menu=[]}, Restaurant{id='R004', name='Maharaja's Feast', address='101 Maharaja Blvd', menu=[]}, Restaurant{id='R005', name='Bombay Bistro', address='202 Masala Rd', menu=[]}, Restaurant{id='R006', name='Delhi Delight', address='303 Chaat Circle', menu=[]}, Restaurant{id='R007', name='Punjab Palace', address='404 Butter Chicken Blvd', menu=[]}, Restaurant{id='R008', name='Udupi Upahar', address='505 South Indian St', menu=[]}, Restaurant{id='R009', name='Garam Masala', address='606 Spicy Ln', menu=[]}, Restaurant{id='R010', name='Rajdhani Thali', address='707 Veggie Blvd', menu=[]}]

Process finished with exit code 0
