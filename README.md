<h1 align = "center">✨ ✨ Dorm Pantry Inventory System ✨ ✨</h1>
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
<p align = "left">
Users can:<br/>
🥫 Add a pantry item<br/>
📋 View all items<br/>
⏳ View items expiring soon<br/>
❌ Remove an item<br/>
📈 Analytics<br/>
🚪 Exit the system<br/>
</p>

<h2 align = "center"> 📋 Project File Structure 📋 </h2>

```
📂 OOP-Dorm-Pantry/
└── 📂 SourceCode/
    ├── ☕ Pantry.java          
    ├── ☕ PantryApp.java
    └── ☕ PantryItem.java
    └── ☕ PerishableItem.java
    └── ☕ CannedItem.java
    └── ☕ FrozenItem.java
    └── ☕ DryItem.java
    └── ☕ OtherItem.java
```
       
<br/>

`PantryApp.java` – Entry point; displays menu and handles user interactions.<br/>
`Pantry.java` – Manages the list of pantry items (add, remove, display).<br/>
`PantryItem.java` – Abstract parent class containing shared item properties.<br/>
`CannedItem.java` / `PerishableItem.java` / `OtherItem.java` / `FrozenItems.java` / `DryItems.java` – Subclasses representing each category.<br/>

<br/>
<h2 align="center"> 📁 Steps on how to run the program 📁 </h2>

Open your terminal inside the SourceCode/ folder

<br/>

Compile all Java files:

`
javac SourceCode/*.java
`

Run the program through the terminal, bash:

`
java PantryApp.java
`
</p>

<h2 align = "center">⚙ Features ⚙</h2>
1. "Add Entry" Create a new diary entry with timestamp.<br/>
2. "View Entries" Display all saved entries with numbering.<br/>
3. "View Expiring/Expired Items" Displays nearly expired or already expired items<br/>
4. "Remove Item" Remove a specific entry permanently.<br/>
5. "Analytics" Displays the percentages of items per category.<br/>
5. "Exit" Exits the program.<br/>
<br/>

<h2 align = "center"> 🔨 Object Oriented Principles: 🔨</h2>
<h3 align = "center"> - Encapsulation - </h3>
<p align = "center">
Applied through private fields inside PantryItem such as name and expirationDate.
These variables are only accessible via public getter methods, ensuring controlled data handling.
</p>
<h3 align = "center"> - Abstraction - </h3>
<p align = "center">
PantryItem is defined as an abstract class.
It hides common behaviors while letting subclasses (CannedItem, PerishableItem, FrozenItem, DryItem, OtherItem) implement their own getCategory() method.
</p>
<h3 align = "center"> - inheritance - </h3>
<p align = "center">
CannedItem, PerishableItem, and OtherItem inherit from PantryItem.
Each subclass reuses the parent’s properties and methods, reducing duplication.
</p>
<h3 align = "center"> - Polymorphism - </h3>
<p align = "center">
Objects of different subclasses (new CannedItem(), new PerishableItem(), etc. are stored in the same List<PantryItem>.
When calling item.toString() or item.getCategory(), the program dynamically selects the correct overridden version based on the object's actual type.
</p>

<h2 align = "center"> Example Outputs</h2>

## Adding an Item
```
===== Dorm Pantry Inventory System =====
[1] Add Item
[2] View All Items
[3] View Items Expiring Soon
[4] Remove Item
[5] Analytics (Items by Category)
[6] Exit
Choose an option: 1
Enter item name: Century Tuna
Enter expiration year (YYYY): 2028
Enter expiration month (1?12): 04
Enter expiration day (1?31): 25
Select Category:
[1] Canned Goods
[2] Perishable Goods
[3] Frozen Goods
[4] Dry Goods
[5] Others
Enter choice: 1
Item added: Century Tuna
```

## Viewing All Items

```
[1] Add Item
[2] View All Items
[3] View Items Expiring Soon
[4] Remove Item
[5] Analytics (Items by Category)
[6] Exit
Choose an option: 2
All items in pantry:
[Perishable] Milk | Expires: 2025-12-05 (2 days left) ?? Expiring Soon!
[Canned] Monggo Beans | Expires: 2027-12-03 (730 days left)
[Dry Goods] Instant Noodles | Expires: 2026-08-03 (243 days left)
[Frozen Goods] Tender Juicy Hotdog | Expires: 2026-12-03 (365 days left)
[Frozen Goods] Longganisa | Expires: 2026-12-03 (365 days left)
[Canned] Century Tuna | Expires: 2028-04-25 (874 days left)
```

## Viewing Items That Will Expire Soon or Already Expired

```
===== Dorm Pantry Inventory System =====
[1] Add Item
[2] View All Items
[3] View Items Expiring Soon
[4] Remove Item
[5] Analytics (Items by Category)
[6] Exit
Choose an option: 3
Items expiring within 5 days or already expired:
[Perishable] Milk | Expires: 2025-12-05 (2 days left) ?? Expiring Soon!
```

## Deleting an Item

```
===== Dorm Pantry Inventory System =====
[1] Add Item
[2] View All Items
[3] View Items Expiring Soon
[4] Remove Item
[5] Analytics (Items by Category)
[6] Exit
Choose an option: 4
Enter name of item to remove: Century Tuna
```

## Viewing Analytics

```
===== Dorm Pantry Inventory System =====
[1] Add Item
[2] View All Items
[3] View Items Expiring Soon
[4] Remove Item
[5] Analytics (Items by Category)
[6] Exit
Choose an option: 5

===== Pantry Analytics =====
Perishable: 1 items (20.00%)
Canned: 1 items (20.00%)
Dry Goods: 1 items (20.00%)
Frozen Goods: 2 items (40.00%)
```

<h2 align = "center">👾 Contributors 👾</h2>
<table align = "center">
<tr>
    <th> &nbsp; </th>
    <th> Name </th>
    <th> Role </th>
</tr>
<tr>
    <td><img src="assets/lance.jpg" width="100" height="100"> </td>
    <td><strong>Lance M. Pria</strong> <br/>
    <a href="https://github.com/laighterdeiz" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=orange" alt="laighterdeiz's GitHub">
        </a>
    </td>
    <td>The Third Wheel</td>
</tr>
<tr>
    <td><img src="assets/chris.webp" width="100" height="100"> </td>
    <td><strong>Chris Raye M. Mendoza</strong> <br/>
    <a href="https://github.com/callmeDnD" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=blue" alt="callmeDnD's GitHub">
        </a>
    </td>
    <td>The Loverboy</td>
</tr>
<tr>
    <td><img src="assets/lily.jpg" width="100" height="100"> </td>
    <td><strong>Lily Beatriz D. Untalan</strong> <br/>
    <a href="https://github.com/lilyuntalan" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Lele's GitHub">
        </a>
    </td>
    <td>The Lovergirl</td>
</tr>
</table>

<h2 align = "center">🫂 Acknowledgments 🫂</h2>
To our CS 211 Instructor, we sincerely express our thanks for guiding us all throughout the semester. Although we have our shortcomings, you stayed patient. To our revered classmates, thank you for being with us, cooperating, learning, and laughing along. With our silly little OOP inside jokes, it is sure to bring some lighthearted and informational memories


