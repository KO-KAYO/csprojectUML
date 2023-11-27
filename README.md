# csprojectUML
doesn't matter currently.

One author and dev - Sebastian Medina

1.
let's just make a basic microtransaction store front design, with a premium currency, freemium currency, 
a free starter reward, and some sort of support request which will be a dummy function for now. I don't have a server to invest in.

3. 
There is 2 main use cases, namely purchases, and support requests. 

Microtransactions, while important, are an entire use-case situation on their own, 
based on interactions with various financial institutions and users, and dealing with financial information
is complicated enough to not be included for the sake of brevity.

When a purchase is made, there is several cases to be considered. This involves whether 
the user wants to purchase with coins, gems, or the purchase doesn't have anything for the
user to need to choose either currency. Then, it will get run by a program which should just
deduct the amount for the purchase within the client, since we have no server implementation.

Varing preconditions are the amount of coins, gems, and whether or not their free reward was claimed.

Postconditions such as the success of the purchase, whether to change the currency value, or whether to 
change the purchase condition on the storefront, are all expected to be rebound through the system.

Scenarios A and B are normal currency purchases, coins or gems, that go through and succeed, reducing
their respective currency and we tally the purchase in some test counter on the side.

Scenario C is a free purchase, where the user needs to only interact with it for the first time, and
claim their purchase, which will get tallied and should disable the option permanently.

Scenario D is a failed purchase, where the user attempts to make any purchase from A through C, but
either the amount or flags for the purchase do not line up with the requirements for the purchase
to pass, therefore making it invalid, and denying the user with a warning.

Scenario E is an odd one out, just being our dummy support ticket to allow a user to attempt to
ask for help with any services or issues in general. Nothing will come of the ticket, for obvious
reasons, but it helps to implement for a demonstration.

