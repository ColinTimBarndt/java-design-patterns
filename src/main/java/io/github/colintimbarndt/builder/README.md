# Builder Pattern

- [UserProfile.Builder](./UserProfile.java)
- [Calendar.Builder](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Calendar.Builder.html)

**Type**: Creational\
**Purpose**: Simplify object creation that features many optional parameters or complex steps
**Participants**: Element, Element builder

**Pros**
- Step-by-step object construction; steps can be left out and replaced by default steps/values
- A factory is able to use and encapsulate special construction code that happens more often (similar to factory method)

**Cons**
- Code complexity increases due to more classes that are needed