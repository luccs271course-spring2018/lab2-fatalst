### What is the complexity of each of the four search methods in terms of array or list size n?

The first three searches are all linear searches (n).  FindMinFundingFast is a binary search (n^2).


### What happens in the case of binary search if the array is not sorted?

If the array is not sorted, the binary search could eliminate the half of the array with the object of the search.


### What is the purpose of constructor argument validity checking?

To make sure none of the arguments are null, which would ruin the tests.


## What is the purpose of using the keyword `final` with variables and arguments?

To ensure the variables don't change when they are being used so often.


### What are alternatives to using `Optional` and how do they compare?

An alternative to `Optional` is using an exception method, which requires more work to write up code unlike `Optional`, which includes the function.