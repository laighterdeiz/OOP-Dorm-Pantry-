<h1 align = "center">* * * OOP Dorm Inventory * * *</h1>
<h3 align = "center"> In partial fulfillment for CS 211</h3>
<p align = "center">
<b>BSIT 2110 </b> <br/>
Pria, Lance M. <br/>
Mendoza, Chris Raye M. <br/>
Untalan, Lily Beatriz D.
</p>

<p align = "center">* * Overview * *</p>
Dorm Pantry Inventory System is a console-based Java application designed to help students manage pantry items efficiently.
It allows users to add items, track expiration dates, view items expiring soon, and remove items.
<br/><br/>
It demonstrates the practical use of Object-oriented Programming (OOP) concepts such as encapsulation, inheritance, polymorphism, and abstraction, alongside proper file handling and modular design.
<br/>
<p align = "center">
Users can:<br/>
🥫 Add a pantry item<br/>
📋 View all items<br/>
⏳ View items expiring soon<br/>
❌ Remove an item<br/>
🚪 Exit the system<br/>
</p>

<p align = "center">* * Project File Structure * *</p>
```
📂 src/
└── 📂 pantryapp/
    ├── ☕ PantryApp.java          
    ├── ☕ Pantry.java
    ├── ☕ PantryItem.java
    ├── ☕ CannedItem.java
    ├── ☕ PerishableItem.java
    └── ☕ OtherItem.java
```

```
'PantryApp.java' – Entry point; displays menu and handles user interactions.
'Pantry.java' – Manages the list of pantry items (add, remove, display).
'PantryItem.java' – Abstract parent class containing shared item properties.
'CannedItem.java' / 'PerishableItem.java' / 'OtherItem.java' – Subclasses representing each category.
