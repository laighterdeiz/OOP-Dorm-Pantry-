<h1 align = "center">✨ ✨ OOP Dorm Inventory ✨ ✨</h1>
<h3 align = "center"> In partial fulfillment for CS 211</h3>
<p align = "center">
<b>BSIT 2110 </b> <br/>
Pria, Lance M. <br/>
Mendoza, Chris Raye M. <br/>
Untalan, Lily Beatriz D.
</p>

<br/>
<h2 align = "center"> 🌟 Overview 🌟 </h2>
<p align = "center">
Dorm Pantry Inventory System is a console-based Java application designed to help students manage pantry items efficiently.
It allows users to add items, track expiration dates, view items expiring soon, and remove items.
<br/><br/>
It demonstrates the practical use of Object-oriented Programming (OOP) concepts such as encapsulation, inheritance, polymorphism, and abstraction, alongside proper file handling and modular design.
</p>
<br/>
<br/>
<p align = "left">
Users can:<br/>
🥫 Add a pantry item<br/>
📋 View all items<br/>
⏳ View items expiring soon<br/>
❌ Remove an item<br/>
🚪 Exit the system<br/>
</p>
<br/>
<h2 align = "center"> 📋 Project File Structure 📋 </h2>
📂 src/<br/>
└── 📂 pantryapp/<br/>
    ├── ☕ PantryApp.java<br/>          
    ├── ☕ Pantry.java<br/>
    ├── ☕ PantryItem.java<br/>
    ├── ☕ CannedItem.java<br/>
    ├── ☕ PerishableItem.java<br/>
    └── ☕ OtherItem.java<br/>
<br/>

```
'PantryApp.java' – Entry point; displays menu and handles user interactions.
'Pantry.java' – Manages the list of pantry items (add, remove, display).
'PantryItem.java' – Abstract parent class containing shared item properties.
'CannedItem.java' / 'PerishableItem.java' / 'OtherItem.java' – Subclasses representing each category.
```
<br/>
<h2 align = "center"> 📁 Steps on how to run the program 📁 </h2>
Open your terminal inside the src/ folder
Compile all Java files:

```
javac pantryapp/*.java
```
Run the program:

```
java pantryapp.PantryApp
```
<h2 align = "center">⚙ Features ⚙</h2>
1. "Add Entry" Create a new diary entry with timestamp.<br/>
2. "View Entries" Display all saved entries with numbering.<br/>
3. "Modify Entry" Edit any existing note by selecting its number<br/>
4. "Delete Entry" Remove a specific entry permanently.<br/>
5. "Insert Entry" Add a note at any position in the list.<br/>
<br/>

<h2 align = "center"> 🔨 Object Oriented Principles: 🔨</h2>
<h3 align = "center"> Encapsulation </h3>
<p align = "center">
Applied through private fields inside PantryItem such as name and expirationDate.
These variables are only accessible via public getter methods, ensuring controlled data handling.
</p>
<h3 align = "center"> Abstraction </h3>
<p align = "center">
PantryItem is defined as an abstract class.
It hides common behaviors while letting subclasses (CannedItem, PerishableItem, OtherItem) implement their own getCategory() method.
</p>
<h3 align = "center"> inheritance </h3>
<p align = "center">
CannedItem, PerishableItem, and OtherItem inherit from PantryItem.
Each subclass reuses the parent’s properties and methods, reducing duplication.
</p>
<h3 align = "center"> Polymorphism </h3>
<p align = "center">
Objects of different subclasses (new CannedItem(), new PerishableItem(), etc.) are stored in the same List<PantryItem>.
When calling item.toString() or item.getCategory(), the program dynamically selects the correct overridden version based on the object's actual type.
</p>


