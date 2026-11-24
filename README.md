# Question 1.
### The deposit did not work for both accounts because account2 is using Valuable as its declared type. Valuable does not have any methods it has declared while BankAccount does have method declared that can be called.
# Question 2.
### The methods available to account1 are deposit and withdraw.
# Question 3.
### The methods available to account2 are none.
# Question 4.
### Due to account1 using BankAccount as it's type it can use deposit and withdraw, while Valuable does not have any methods.
# Question 5.
### Portfolio can implement Valuable because Portfolio has value in terms of the items it has such as a house or car having value and therefore Portfolio carries that value.
# Why Interfaces?
## Are the classes different kinds of things? A bird isn't a drone.
### Yes, the classes are different things. While they can share similar properties or details they are still different things altogether. A bird and a drone can both fly, but a bird is a living thing and a drone isn't. A bird uses it's wings to push the air down to create lift and a drone uses rotors to push the air down for lift. While they share those and other properties, they are still fundamentally different things.
## Would a shared parent be empty? No fields, no code, only method names.
### A parent can be empty and only have methods, but it would be better to have an interface. You can have more than one interface for a class, but you can't have more than one parent.
## Does a class need more than one ability, or does it already have a parent? A drone flies and recharges.
### A class might need more than one ability and therefore can use as many interfaces as it needs, versus only being able to have one parent.