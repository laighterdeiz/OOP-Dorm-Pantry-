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

`PantryApp.java` – Entry point; displays menu and handles user interactions.<br/>
`Pantry.java` – Manages the list of pantry items (add, remove, display).<br/>
`PantryItem.java` – Abstract parent class containing shared item properties.<br/>
`CannedItem.java` / `PerishableItem.java` / `OtherItem.java` – Subclasses representing each category.<br/>

<br/>
<h2 align = "center"> 📁 Steps on how to run the program 📁 </h2>
Open your terminal inside the src/ folder
Compile all Java files:

`javac pantryapp/*.java`

Run the program:
`java pantryapp.PantryApp`

<h2 align = "center">⚙ Features ⚙</h2>
1. "Add Entry" Create a new diary entry with timestamp.<br/>
2. "View Entries" Display all saved entries with numbering.<br/>
3. "Modify Entry" Edit any existing note by selecting its number<br/>
4. "Delete Entry" Remove a specific entry permanently.<br/>
5. "Insert Entry" Add a note at any position in the list.<br/>
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
It hides common behaviors while letting subclasses (CannedItem, PerishableItem, OtherItem) implement their own getCategory() method.
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

## Example Output
```
===== Dorm Pantry Inventory System =====
[1] Add Item
[2] View All Items
[3] View Items Expiring Soon
[4] Remove Item
[5] Exit
Choose an option: 1
Enter item name: Milk
Enter expiration year (YYYY): 2025
Enter expiration month (1–12): 2
Enter expiration day (1–31): 10
Select category:
[1] Canned
[2] Perishable
[3] Other
Enter choice: 2
Item added: Milk
```

## 👾 Contributors 👾
<table>
<tr>
    <th> &nbsp; </th>
    <th> Name </th>
    <th> Role </th>
</tr>
<tr>
    <td><img src="static/marieemoiselle.JPG" width="100" height="100"> </td>
    <td><strong>Lance M. Pria</strong> <br/>
    <a href="https://github.com/laighterdeiz" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=orange" alt="laighterdeiz's GitHub">
        </a>
    </td>
    <td>The Third Wheel</td>
</tr>
<tr>
    <td><img src="static/jeisquared.jpg" width="100" height="100"> </td>
    <td><strong>Chris Raye M. Mendoza</strong> <br/>
    <a href="https://github.com/callmeDnD" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=blue" alt="callmeDnD's GitHub">
        </a>
    </td>
    <td>The Loverboy</td>
</tr>
<tr>
    <td><img src="static/renzmarrion.jpg" width="100" height="100"> </td>
    <td><strong>Lily BeatriZ D. Untalan</strong> <br/>
    <a href="https://github.com/" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=blue" alt="Lele's GitHub">
        </a>
    </td>
    <td>The Lovergirl</td>
</tr>
</table>

##🫂 Acknowledgments 🫂
To our CS 211 Instructor, we sincerely express our thanks for guiding us all throughout the semester. Although we have our shortcomings, you stayed patient. To our revered classmates, thank you for being with us, cooperating, learning, and laughing along. With our silly little OOP inside jokes, it is sure to bring some lighthearted and informational memories
---

