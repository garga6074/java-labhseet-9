# Lab Sheet 09 — Java Collections Framework

**Course:** MCA203P — Object Oriented Programming Using Java  
**Programme:** MCA III Semester

This repository contains 30 individually runnable Java programs covering `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `LinkedHashSet`, `PriorityQueue`, `Queue`, `Iterator`, `Comparator`, and collection conversions.

## Requirements
- JDK 8 or later
- VS Code, IntelliJ IDEA, Eclipse or Command Prompt

## Project structure
```text
Lab_Sheet_09_Java_Collections/
├── src/main/java/lab09/collections/
│   ├── Exercise01ArrayListPrint.java
│   ├── ...
│   ├── Exercise30ClearCollections.java
│   └── Student.java
├── compile.bat
├── compile.sh
├── run-example.bat
├── README.md
├── EXPECTED_OUTPUTS.md
└── .gitignore
```

## Compile all programs

**Windows**
```bat
compile.bat
```

**macOS / Linux**
```bash
chmod +x compile.sh
./compile.sh
```

Compiled class files are saved in the `out/` directory.

## Run an exercise

Run commands from the project root after compiling. Example:

```bash
java -cp out lab09.collections.Exercise01ArrayListPrint
java -cp out lab09.collections.Exercise08ArrayListSort
java -cp out lab09.collections.Exercise17TreeSetSort
java -cp out lab09.collections.Exercise22PriorityQueueRemoveOrder
java -cp out lab09.collections.Exercise27SortCustomObjectsComparator
```

## Exercise mapping

| No. | Program | Main concept |
|---:|---|---|
| 1 | `Exercise01ArrayListPrint` | Create and print an integer ArrayList |
| 2 | `Exercise02ArrayListSize` | Add elements and display size |
| 3 | `Exercise03ArrayListInsert` | Insert at a specific index |
| 4 | `Exercise04ArrayListRemove` | Remove by index and by value |
| 5 | `Exercise05ArrayListUpdate` | Update with `set()` |
| 6 | `Exercise06ArrayListForEach` | Iterate using for-each |
| 7 | `Exercise07ArrayListIterator` | Iterate using Iterator |
| 8 | `Exercise08ArrayListSort` | Sort integers ascending |
| 9 | `Exercise09ReverseArrayListStrings` | Reverse a string ArrayList |
| 10 | `Exercise10LinkedListPrint` | Create and print LinkedList |
| 11 | `Exercise11LinkedListAddEnds` | Add at beginning and end |
| 12 | `Exercise12LinkedListRemoveEnds` | Remove first and last elements |
| 13 | `Exercise13LinkedListRetrieveEnds` | Retrieve first and last elements |
| 14 | `Exercise14HashSetDuplicates` | Observe duplicate removal in HashSet |
| 15 | `Exercise15HashSetRemove` | Remove an element from HashSet |
| 16 | `Exercise16HashSetIterator` | Iterate through HashSet |
| 17 | `Exercise17TreeSetSort` | TreeSet natural ascending order |
| 18 | `Exercise18TreeSetContains` | Check membership using contains() |
| 19 | `Exercise19LinkedHashSetOrder` | Preserve insertion order |
| 20 | `Exercise20CompareSets` | Compare HashSet, LinkedHashSet and TreeSet |
| 21 | `Exercise21PriorityQueueAddPrint` | Add and display PriorityQueue |
| 22 | `Exercise22PriorityQueueRemoveOrder` | Observe priority removal order |
| 23 | `Exercise23PriorityQueuePeek` | Peek without removing |
| 24 | `Exercise24QueueLinkedListReference` | Queue interface with LinkedList |
| 25 | `Exercise25QueueAddRemovePeek` | Queue offer, poll and peek |
| 26 | `Exercise26ArrayListCustomObjects` | Custom Student objects with Iterator |
| 27 | `Exercise27SortCustomObjectsComparator` | Sort Student objects with Comparator |
| 28 | `Exercise28ListToSet` | Convert List to Set |
| 29 | `Exercise29SetToList` | Convert Set to List |
| 30 | `Exercise30ClearCollections` | Clear List, Set and Queue |

## Important observations

- `ArrayList` preserves insertion order and supports index-based access.
- `LinkedList` supports operations at both ends.
- `HashSet` prevents duplicates but does not guarantee iteration order.
- `LinkedHashSet` prevents duplicates and preserves insertion order.
- `TreeSet` prevents duplicates and stores elements in sorted order.
- `PriorityQueue` exposes its head according to priority; printing or iterating the queue does **not** guarantee fully sorted order. Repeated `poll()` or `remove()` shows priority order.
- `Queue` commonly follows FIFO behavior when backed by a `LinkedList`.
- `Comparator` defines custom sorting rules for user-defined objects.

## GitHub upload

1. Extract the ZIP.
2. Create a GitHub repository named `MCA203P-Lab-Sheet-09-Java-Collections`.
3. Upload the contents of the extracted folder.
4. Commit the files and README.
5. Keep compiled `out/` files and IDE-specific folders out of the repository unless your instructor requests them.
